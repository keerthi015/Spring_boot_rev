package com.choco.demo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.choco.demo.model.ChocoDemo;
import com.choco.demo.service.Chocodemoservice;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController

public class Chocodemocontroller {
	@Autowired
	Chocodemoservice ab;
	@Tag(name="Get",description="get data")
	@GetMapping("/save")
	public List<ChocoDemo> allDetails(){
		return ab.getAllDetails();
	}
	@Tag(name="Post",description="post data")
	@PostMapping("/Save")
	public String saveAllL(@RequestBody ChocoDemo id) {
		
		ab.SaveDetails(id);
		return  "Details Saved";
	}
	@Tag(name="Put",description="put data")
	@PutMapping("/put")
	public ChocoDemo saveAll(@RequestBody ChocoDemo id) {
		
		return ab.putDetails(id);
	}
		
	@GetMapping("/all/{id}")
	public ChocoDemo getId(@PathVariable int id) {
		return ab.getDetails(id);
		
	}
	@Tag(name="Delete",description="delete data")
	@DeleteMapping("/delete/{id}")
	
	public String delete(@PathVariable int id) {
		ab.deleteById(id);
		return "Details Deleted";
	}
    @GetMapping("/sort/{field}")
    public List<ChocoDemo> sort(@PathVariable String field)
    {
        return ab.sortChocoDemo(field);
    }

    @GetMapping("/pagingAndSorting/{offset}/{pageSize}/{field}")
    public List<ChocoDemo> pagingAndSortingEmployees(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field) 
    {
       return ab.pagingAndSortingEmployees(offset, pageSize, field);
    }
    

   /* @GetMapping("/fetchChocoDemoByprice/{pri}/{chocolateName}")
    public List<ChocoDemo> fetchChocoDemoByPrice(@PathVariable String pri,@PathVariable String chocolateName)
    {
	    return ab.getChocoDemoByPrice(pri,chocolateName);
    }
    
    @DeleteMapping("/deleteStudentByName/{name}")
    public String deleteStudentByName(@PathVariable String chocolateName)
    {
        int result=ab.deleteChocoDemoByChoclateName(chocolateName);
        if(result >0)
        {
    	   return "Choco record deleted";
        }
        else
        {
    	   return "Problem occured while deleting";
        }
    }*/
    
    
}


	



