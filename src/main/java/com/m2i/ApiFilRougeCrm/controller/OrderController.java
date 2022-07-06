package com.m2i.ApiFilRougeCrm.controller;

import com.m2i.ApiFilRougeCrm.entity.Order;
import com.m2i.ApiFilRougeCrm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("orders")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

    //TODO postMapping --> pour enregistrer une order (video : CRM_SPRING_JPA_220629-1_JC)
    @PostMapping("orders")
    public void createOrder(@RequestBody Order order){
        orderService.createOrder(order);
    }

//    @PostMapping("order")
//    public List<Order> saveOrder(Order order){
//       return orderService.saveOrder();
//    }

}
