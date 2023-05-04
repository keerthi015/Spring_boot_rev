package com.choco.demo.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.choco.demo.model.ChocoDemo;

@Repository 
public interface Chocodemorepository extends JpaRepository<ChocoDemo,Integer>{




/*//positional parameter
	@Query("select s from ChocoDemo s where s.price=?1 and s.choclateName=?2")
	public List<ChocoDemo> getChocoDemoByPrice(String pri,String ChoclateName);
	
	//named parameter
	@Query("select s from ChocoDemo s where s.Price=:pri")
	public List<ChocoDemo> getChocoDemoByPrice(String pri);
	
	//DML parameter
	@Modifying
	@Query("delete from ChocoDemo s where s.ChoclateName=?1")
	public int deleteChocoDemoByChoclateName(String ChoclateName);*/
}
