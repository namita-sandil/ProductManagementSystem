package com.example.DAO;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entities.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer>{
	
	

}