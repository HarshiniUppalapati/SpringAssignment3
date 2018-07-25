package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.beans.Product;
import com.cg.exception.InvalidInputException;
import com.cg.repo.ProductRepo;
@Component(value="service")
public class ProductServiceImpl implements ProductService {
    @Autowired
	private ProductRepo repo;
	
	@Override
	public Product addProduct(Product product) throws InvalidInputException {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public List<Product> viewAllProducts() throws InvalidInputException {
		// TODO Auto-generated method stub
		List<Product> list=repo.findAll();
		return list;
	}

	@Override
	public Product viewProduct(int productId) throws InvalidInputException {
		// TODO Auto-generated method stub
		return repo.findOne(productId);
	}

	

	}
