package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.Entities.Product;


public interface ProductService {
	

	public Product save(Product p);
	public Iterable<Product> findAll();
	public Product getByName(String name);
	public Optional<Product> getByID(int id);
	public Product update(Product p);
	public void delete(int id);

}
