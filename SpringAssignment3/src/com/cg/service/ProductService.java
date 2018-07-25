package com.cg.service;

import java.util.List;

import com.cg.beans.Product;
import com.cg.exception.InvalidInputException;

public interface ProductService {

	Product addProduct(Product product) throws InvalidInputException;
	List<Product> viewAllProducts() throws InvalidInputException;
    Product viewProduct(int productId) throws InvalidInputException;
}
