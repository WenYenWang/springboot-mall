package com.wywang.springbootmall.service;

import com.wywang.springbootmall.dto.CreateOrderRequest;
import com.wywang.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
