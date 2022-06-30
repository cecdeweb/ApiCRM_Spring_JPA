package com.m2i.ApiFilRougeCrm.service;

import com.m2i.ApiFilRougeCrm.entity.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    public List<Order> getOrders(){
        ArrayList<Order> result = new ArrayList<>();
        // injection de données en dur pour tester getOrders
        result.add(new Order("formation", "Formation SpringBoot", 2, 50, 0));
        result.add(new Order("formation", "Formation SpringBoot avancé", 6, 180, 1));
        return result;
    }

}
