package com.wywang.springbootmall.service;

import com.wywang.springbootmall.dto.CreateOrderRequest;
import com.wywang.springbootmall.dto.OrderQueryParams;
import com.wywang.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
