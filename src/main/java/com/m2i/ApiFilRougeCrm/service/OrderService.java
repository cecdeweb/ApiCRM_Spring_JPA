package com.m2i.ApiFilRougeCrm.service;

import com.m2i.ApiFilRougeCrm.entity.Order;
import com.m2i.ApiFilRougeCrm.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getOrders(){
        return orderRepository.findAll();
    }

    public void createOrder(Order order) {
        orderRepository.save(order);
    }

}
