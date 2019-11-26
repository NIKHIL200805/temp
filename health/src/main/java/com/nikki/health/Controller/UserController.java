package com.nikki.health.Controller; //  package for the controller class  
import java.util.HashMap;  
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.nikki.health.entities.User;
import com.nikki.health.repos.UserRepository;

@RestController                          // which is used for web services     
@RequestMapping("/api/collection2")
public class UserController {   //  opening the main class
	@Autowired                                    // which is used for connecting the different classes 
	private UserRepository repo;
	
	@GetMapping("/user")                      //  this  annotation is used for maps the HTTP GET REQUEST data from database in the form of json objects  
		public List<User>getAllUsers(){
			return repo.findAll();                // this type used for getting all the data present in the particular user table.
		}
		@GetMapping("/user/{id}")  //it is used for  getting the data by id .
	public ResponseEntity<User>getUserById(@PathVariable(value="id") String id)
	
	throws ResourceAccessException{
			User user=repo.findById(id).orElseThrow(()-> new ResourceAccessException("User Not Found On ::"+id));
		return ResponseEntity.ok().body(user);
			
		} //  this throws exception is used for the handling exception which is caused at run time.
		
		//@RequestMapping(value="login/registerUser",method=RequestMethod.POST)
		
		  @PostMapping("/user1")   // this annotation used  for  HTTP POST request or posting the data into the database or table.
		  public User saveCrud(@Valid  @RequestBody User user) {
		    return repo.save(user); 
		  }
		  
	  @PutMapping("/user2/{id}")  // this annotation is used for updating the data which is present in the table or database.
		  public ResponseEntity<User> updateUser(
		      @PathVariable(value = "id") String id, @Valid @RequestBody User userDetails)
	      throws ResourceAccessException {
		    User user =
		        repo
		            .findById(id)
		            .orElseThrow(() -> new ResourceAccessException("User not found on :: " +id));
		    user.setId(userDetails.getId());
		    user.setUsername(userDetails.getUsername());
		    user.setAge(userDetails.getAge());
		    user.setGender(userDetails.getGender());
		    user.setPassword(userDetails.getPassword());
    user.setMailid(userDetails.getMailid());
	  final User updatedUser = repo.save(user);
	    return ResponseEntity.ok(updatedUser);
		  }
	  
	  @DeleteMapping("/user3/{id}")  //  this annotation is used for deleting the data presented in the table by user id.
	  public Map<String, Boolean> deleteUser(@PathVariable(value = "id") String id) throws Exception {
	    User user =
	        repo
	            .findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + id));
	    repo.delete(user);
	    Map<String, Boolean> response = new HashMap<>();
	    response.put("deleted", Boolean.TRUE);
	    return response;
	  }
	  
	  
	  
} //  closing the main class
		  
		  
		
