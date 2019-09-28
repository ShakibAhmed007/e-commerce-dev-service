package com.ecommerce.dev.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "products")
@Data
public class ProductsEntity {

    @Id
    @Column(name = "product_id")
    private Long id;
    @Column(name = "product_sku")
    private String productSku;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_price")
    private Float productPrice;
    @Column(name = "product_weight")
    private Float productWeight;
    @Column(name = "product_cart_desc")
    private String productCartDesc;
    @Column(name = "product_short_desc")
    private String productShortDesc;
    @Column(name = "product_long_desc")
    private String productLongDesc;
    @Column(name = "product_thumb")
    private String productThumb;
    @Column(name = "product_image")
    private String productImage;
    @Column(name = "product_category_iD")
    private Long productCategoryID;
    @Column(name = "product_update_date")
    private Date productUpdateDate;
    @Column(name = "product_stock")
    private Float productStock;
    @Column(name = "product_live")
    private Long productLive;
    @Column(name = "product_unlimited")
    private Long productUnlimited;
    @Column(name = "product_location")
    private String productLocation;
}
