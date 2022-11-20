package com.wywang.springbootmall.dao;

import com.wywang.springbootmall.dto.ProductQueryParams;
import com.wywang.springbootmall.dto.ProductRequest;
import com.wywang.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);
    void deleteProductById(Integer productId);
}
