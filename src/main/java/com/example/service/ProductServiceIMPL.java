package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.ProductDao;
import com.example.Entities.Product;

@Service
public class ProductServiceIMPL implements ProductService {
	
	@Autowired
	ProductDao productdao;

	@Override
	public Product save(Product p) {
		productdao.save(p);
		return null;
	}

	@Override
	public Iterable<Product> findAll() {
		
		return productdao.findAll();
	}

	@Override
	public Product getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Product> getByID(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Product update(Product p) {
		
		return productdao.save(p);
	}

	@Override
	public void delete(int id) {
		productdao.deleteById(id);
		
		return;
	}
	
	
	

	

	

}
