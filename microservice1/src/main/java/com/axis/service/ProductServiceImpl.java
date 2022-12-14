package com.axis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.exception.IDNotFoundException;
import com.axis.exception.InvalidPriceException;
import com.axis.model.Product;
import com.axis.repository.ProductRepository;
import com.axis.utils.AppConstants;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
	ProductRepository productRepository;
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		if(product.getPrice()<=0)
			throw new InvalidPriceException(AppConstants.INVALID_PRICE_STRING);
		return this.productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}

	@Override
	public Product getProductById(String id) {
		// TODO Auto-generated method stub
		return this.productRepository.findById(id).orElseThrow(()->new IDNotFoundException(AppConstants.ID_NOT_FOUND));
	}
	@Override
	public Product updateProduct(String id,Product product) {
		Product prod =productRepository.findById(id).orElseThrow(()->new IDNotFoundException(AppConstants.ID_NOT_FOUND));
		if(product.getPrice()<=0)
			throw new InvalidPriceException(AppConstants.INVALID_PRICE_STRING);
		// TODO Auto-generated method stub
		prod.setName(product.getName());
		prod.setPrice(product.getPrice());
		prod.setCategory(product.getCategory());
		return this.productRepository.save(prod);
	}
	@Override
	public String deleteProduct(String id) {
		Product prod=productRepository.findById(id).orElseThrow(()->new  IDNotFoundException(AppConstants.ID_NOT_FOUND));
	    productRepository.delete(prod);
	    return AppConstants.PRODUCT_DELETE_MESSAGE;
	}
    
}



















