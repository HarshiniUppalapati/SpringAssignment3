package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.beans.Product;
import com.cg.exception.InvalidInputException;
import com.cg.service.ProductService;

@Controller
public class ProductActionController {
    @Autowired
	private ProductService service;
	
    @RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public ModelAndView registerProduct(@ModelAttribute("product") Product product,BindingResult res) {
		try {
			if(res.hasErrors()) return new ModelAndView("addProductPage"); 
			product=service.addProduct(product);
			ModelAndView modelAndView = new ModelAndView("addSuccessPage", "product", product);
			return modelAndView;
		} catch (InvalidInputException e) {
			e.printStackTrace();
		}
		return new ModelAndView("errorPage");
	}
    @RequestMapping(value="/viewAll",method=RequestMethod.GET)
   	public ModelAndView viewAllProducts(@ModelAttribute("product") Product product) {
   		try {
   			List<Product> list=service.viewAllProducts();
   			ModelAndView modelAndView = new ModelAndView("viewProductsPage", "product", list);
   			return modelAndView;
   		} catch (InvalidInputException e) {
   			e.printStackTrace();
   		}
   		return new ModelAndView("errorPage");
   	}
    
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)  
    public ModelAndView edit(@PathVariable int id){  
		try {
			Product product=service.viewProduct(id);
			return new ModelAndView("update","command",product);
		}  catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        return new ModelAndView("errorPage");
    } 
	@RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public ModelAndView editsave(@ModelAttribute("product") Product product) throws InvalidInputException{  
       
			service.addProduct(product);
		    List<Product> list=service.viewAllProducts();
       
        return new ModelAndView("viewProductsPage","product",list);  
    }

}
