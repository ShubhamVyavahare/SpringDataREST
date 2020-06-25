package com.example.SpringDataREST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.SpringDataREST.model.Customer;

@RepositoryRestResource(collectionResourceRel = "Customer", path = "Customer")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
