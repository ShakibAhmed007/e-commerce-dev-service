package com.ecommerce.dev.dao;

import com.ecommerce.dev.entity.ProductsEntity;
import com.ecommerce.dev.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsDAO {

    @Autowired
    ProductsRepository productsRepository;

    public List<ProductsEntity> getAllProductsList(){
        List<ProductsEntity> productsList = productsRepository.findAll();
        return productsList;
    }

}
