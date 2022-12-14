package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.feignclient.ProductClient;
import com.axis.model.Product;

@RestController
@RequestMapping("/microservice2")
public class microservice2controller {
	@Autowired
	ProductClient productclient;
	
	@RequestMapping("/greet2")
	public String greet() {
		return "this is microservice2";
	}
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productclient.getAllProducts();
	}
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable("id") String id){
		return productclient.getProductById(id);
		
	}
}
