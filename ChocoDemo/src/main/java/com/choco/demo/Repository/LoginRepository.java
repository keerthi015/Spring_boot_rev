package com.choco.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.choco.demo.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer>{
	Login findByUsername(String username);

}