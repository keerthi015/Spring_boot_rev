package com.choco.demo.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.choco.demo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>
{

}
