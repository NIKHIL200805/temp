package com.nikki.health.Controller;     //  package for the controller class  

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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.nikki.health.entities.Cal;

import com.nikki.health.entities.User;
import com.nikki.health.repos.CalRepository;


@RestController          // which is used for web services  
@RequestMapping("/api/collection2")
public class CalController {         //  opening the main class    
	
	
	
	@Autowired  // which is used for connecting the different classes 
	private CalRepository repo1;
	@GetMapping("/cal")              //  this  annotation is used for maps the HTTP GET REQUEST data from database in the form of json objects
	public List<Cal>getAllCals(){
		return repo1.findAll();  // this type used for getting all the data present in the particular user table.
	}
	@GetMapping("/cal/{id}")   //it is used for  getting the data by id.
	public ResponseEntity<Cal>getCalById(@PathVariable(value="id") String id)
	
	throws ResourceAccessException{ 
			Cal cal=repo1.findById(id).orElseThrow(()-> new ResourceAccessException("User Not Found On ::"+id));
		return ResponseEntity.ok().body(cal);
			
		} //  this throws exception is used for the handling exception which is caused at run time.

	  @PostMapping("/cal1") // this annotation used  for  HTTP POST request or posting the data into the database or table.
	  public Cal saveCrud(@Valid  @RequestBody Cal cal) {
	    return repo1.save(cal);
	  }
	  
	  @PutMapping("/cal1/{id}")   // this annotation is used for updating the data which is present in the table or database.
	  public ResponseEntity<Cal> updateCal(
	      @PathVariable(value = "id") String id, @Valid @RequestBody Cal calDetails)
      throws ResourceAccessException {
	    Cal cal =
	        repo1
	            .findById(id)
	            .orElseThrow(() -> new ResourceAccessException("User not found on :: " +id));
	    cal.setId(calDetails.getId());
	    cal.setFooditem(calDetails.getFooditem());
	    cal.setTotalcal(calDetails.getTotalcal());
	    cal.setNitems(calDetails.getNitems());
	   
  final Cal updatedCal = repo1.save(cal);
    return ResponseEntity.ok(updatedCal);
	  }
  
  @DeleteMapping("/cal2/{id}")  //  this annotation is used for deleting the data presented in the table by user id.
  public Map<String, Boolean> deleteCal(@PathVariable(value = "id") String id) throws Exception {
    Cal cal =
        repo1
            .findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + id));
    repo1.delete(cal);
    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return response;
  } 
}//  closing the main class