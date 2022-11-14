package com.wywang.springbootmall.dao;

import com.wywang.springbootmall.dto.ProductRequest;
import com.wywang.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);
}
