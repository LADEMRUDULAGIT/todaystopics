package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.exception.IDNotFoundException;
import com.axis.model.Product;
import com.axis.service.ProductService;

@RestController
@RequestMapping("/api/vi")
public class ProductController {
	@Autowired
	ProductService productservice;
	
	@PostMapping("/product")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		Product product2=productservice.addProduct(product);
		return new ResponseEntity<Product>(product2,HttpStatus.OK);
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>>getAllProducts(){
		List<Product> products=productservice.getAllProducts();
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") String id){
		Product product=productservice.getProductById(id);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
	@PutMapping("/product/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable String id,@RequestBody Product product){
        Product Uproduct=productservice.updateProduct(id, product);
        return new ResponseEntity<Product>(Uproduct,HttpStatus.OK);
	}
	@DeleteMapping("/product/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable String id){
        String Dproduct=productservice.deleteProduct(id);
        return new ResponseEntity<String>(Dproduct,HttpStatus.OK);
	}
	//@ExceptionHandler
	//public ResponseEntity<String> noIdFound(IDNotFoundException exception){
		//return new ResponseEntity<String>(exception.getmsg(),HttpStatus.NOT_FOUND);
	//}
}

























