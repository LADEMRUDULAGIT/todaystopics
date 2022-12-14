package com.axis.service;

import java.util.List;

import com.axis.model.Product;

public interface ProductService {
	public Product addProduct(Product product);

    public List<Product> getAllProducts();

    public Product getProductById(String id);
    
    public Product updateProduct(String id,Product product);
    
    public String deleteProduct(String id);
}
