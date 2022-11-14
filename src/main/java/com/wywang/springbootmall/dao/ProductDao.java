package com.wywang.springbootmall.dao;

import com.wywang.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
