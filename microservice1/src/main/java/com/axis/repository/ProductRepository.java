package com.axis.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.axis.model.Product;
@Repository
public interface ProductRepository extends MongoRepository<Product, String>{
}