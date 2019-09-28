package com.ecommerce.dev.beans;

import com.ecommerce.dev.entity.ProductsEntity;
import lombok.Data;

import java.util.List;

@Data
public class ResponseData {
    private boolean status;
    private String responseCode;
    private List<ProductsEntity> productsData;

    public static synchronized ResponseData success(List<ProductsEntity> productsEntities){
        ResponseData responseData = new ResponseData();
        responseData.setStatus(true);
        responseData.setResponseCode("0");
        responseData.setProductsData(productsEntities);

        return responseData;
    }

}
