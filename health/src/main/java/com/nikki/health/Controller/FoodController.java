package com.nikki.health.Controller;

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

import com.nikki.health.entities.Food;
import com.nikki.health.entities.User;
import com.nikki.health.repos.FoodRepository;

@RestController                               // which is used for web services    
@RequestMapping("/api/collection2")
public class FoodController {                //  opening the main class
	
	
	@Autowired                   			// which is used for connecting the different classes
	private FoodRepository repo1;
	@GetMapping("/food")    			   //  this  annotation is used for maps the HTTP GET REQUEST data from database in the form of json objects
	public List<Food>getAllFoods(){
		return repo1.findAll(); 		  // this type used for getting all the data present in the particular user table.
	}
	@GetMapping("/food/{id}")         	//it is used for  getting the data by id .
	public ResponseEntity<Food>getFoodById(@PathVariable(value="id") String id)
	
	throws ResourceAccessException{
			Food food=repo1.findById(id).orElseThrow(()-> new ResourceAccessException("User Not Found On ::"+id));
		return ResponseEntity.ok().body(food);
			
		}							 //  this throws exception is used for the handling exception which is caused at run time.

	  @PostMapping("/food1")          // this annotation used  for  HTTP POST request or posting the data into the database or table.
	  public Food saveCrud(@Valid  @RequestBody Food food) {
	    return repo1.save(food);
	  }
	  
	  @PutMapping("/food1/{id}")  	// this annotation is used for updating the data which is present in the table or database.
	  public ResponseEntity<Food> updateFood(
	      @PathVariable(value = "id") String id, @Valid @RequestBody Food foodDetails)
      throws ResourceAccessException {
	    Food food =
	        repo1
	            .findById(id)
	            .orElseThrow(() -> new ResourceAccessException("User not found on :: " +id));
	    food.setId(foodDetails.getId());
	    food.setMode(foodDetails.getMode());
	    food.setFooditem(foodDetails.getFooditem());
	    food.setCalforsingle(foodDetails.getCalforsingle());
	   
  final Food updatedFood = repo1.save(food);
    return ResponseEntity.ok(updatedFood);
	  }
  
  @DeleteMapping("/food2/{id}") 	//  this annotation is used for deleting the data presented in the table by user id.
  public Map<String, Boolean> deleteFood(@PathVariable(value = "id") String id) throws Exception {
    Food food =
        repo1
            .findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + id));
    repo1.delete(food);
    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return response;
  }
		
} 									//  closing the main  class
