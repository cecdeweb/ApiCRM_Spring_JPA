package com.m2i.ApiFilRougeCrm.repository;

import com.m2i.ApiFilRougeCrm.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface OrderRepository extends JpaRepository<Order, Long> {


}
