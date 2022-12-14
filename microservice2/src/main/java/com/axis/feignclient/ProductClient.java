package com.axis.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.axis.model.Product;

@FeignClient(name="microservice1")
public interface ProductClient {
	@GetMapping("/api/vi/products")
	List<Product>getAllProducts();
	@GetMapping("/api/vi/product/{id}")
	Product getProductById(@PathVariable String id);
}
