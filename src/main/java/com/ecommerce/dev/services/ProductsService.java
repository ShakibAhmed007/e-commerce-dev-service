package com.ecommerce.dev.services;

import com.ecommerce.dev.dao.ProductsDAO;
import com.ecommerce.dev.entity.ProductsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    ProductsDAO productsDAO;

    public List<ProductsEntity> getAllProductsList() {
        List<ProductsEntity> productsList = productsDAO.getAllProductsList();
        return productsList;

    }
}
