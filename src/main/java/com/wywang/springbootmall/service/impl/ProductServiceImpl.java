package com.wywang.springbootmall.service.impl;

import com.wywang.springbootmall.dao.ProductDao;
import com.wywang.springbootmall.model.Product;
import com.wywang.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
