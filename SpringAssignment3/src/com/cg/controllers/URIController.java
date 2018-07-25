package com.cg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.beans.Product;


@Controller
public class URIController {

	@RequestMapping("/")
	public String getHomePage() {
		return "indexPage";
	}
	
	@RequestMapping("/add")
	public String getAddProductPage() {
		return "addProductPage";
	}
	

	@ModelAttribute("product")
		public Product getProduct() {
		return new Product();
	}

}
