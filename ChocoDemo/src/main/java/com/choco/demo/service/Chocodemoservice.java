package com.choco.demo.service;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.choco.demo.Repository.Chocodemorepository;
import com.choco.demo.model.ChocoDemo;

import jakarta.transaction.Transactional;

@Service
public class Chocodemoservice {
	@Autowired
	Chocodemorepository cb;
	
	public List<ChocoDemo> getAllDetails(){
		return cb.findAll();
	}

//post
public ChocoDemo SaveDetails(@RequestBody ChocoDemo id ) {
	return cb.save(id);
}
//update
public ChocoDemo putDetails(@RequestBody ChocoDemo id ) {
	return cb.save(id);
}
//list
public ChocoDemo getDetails(@PathVariable int id ) {
	return cb.findById(id).orElse(null);
}
//delete
public void deleteById(@PathVariable int id) {
	cb.deleteById(id);
}

public List<ChocoDemo> sortChocoDemo(String field) 
{
	return cb.findAll(Sort.by(field));
}

public List<ChocoDemo> pagingAndSortingEmployees(int offset,int pageSize,String field) 
{
	Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
	Page<ChocoDemo> choco=cb.findAll(paging);
	return choco.getContent();
}


/*public List<ChocoDemo> getChocoDemoByPrice(String pri,String chocolateName)
{
	return cb.getChocoDemoByPrice(pri,chocolateName);
}

@Transactional
public int deleteChocoDemoByChoclateName(String chocolateName)
{
	return cb.deleteChocoDemoByChoclateName(chocolateName);
}*/


}

