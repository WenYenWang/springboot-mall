package com.wywang.springbootmall.service;

import com.wywang.springbootmall.dto.ProductRequest;
import com.wywang.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
