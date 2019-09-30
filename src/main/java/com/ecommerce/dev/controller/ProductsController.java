package com.ecommerce.dev.controller;

import com.ecommerce.dev.beans.ResponseData;
import com.ecommerce.dev.entity.ProductsEntity;
import com.ecommerce.dev.services.ProductsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class ProductsController{
    @Autowired
    ProductsService productsService;

    @ApiOperation(value = "Get All Products Data")
    @GetMapping(path = "/get-products-list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseData> getProductsList() {
        List<ProductsEntity> productsList = productsService.getAllProductsList();
        return ResponseEntity.ok(ResponseData.success(productsList));
    }

}
