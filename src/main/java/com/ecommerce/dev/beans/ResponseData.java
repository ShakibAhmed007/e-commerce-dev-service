package com.ecommerce.dev.beans;

import com.ecommerce.dev.entity.ProductsEntity;
import lombok.Data;

import java.util.List;

@Data
public class ResponseData {
    public boolean status;
    public String responseCode;
    public String responseType;
    public String message;



}
