package com.choco.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.choco.demo.model.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails,Integer>
{
	
}
