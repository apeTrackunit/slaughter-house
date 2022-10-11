package com.example.testrestapi.repository;

import com.example.testrestapi.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class OrderRepository {
    private static final Map<Long, Order> orderMap = new HashMap<>();

    public OrderRepository(){
        initData();
    }

    private static void initData(){
        Order o1 = new Order(1, "Beer", true, 20);
        Order o2 = new Order(2, "Vodka", false, 0);

        orderMap.put(o1.getId(), o1);
        orderMap.put(o2.getId(), o2);
    }

    public List<Order> getAllOrders(){
        return orderMap.values().stream().toList();
    }

    public Order getOrder(long id){
        return orderMap.get(id);
    }

    public void addOrder(Order order){
        orderMap.put(order.getId(), order);
    }

    public Order changeOrder(Order order){
        orderMap.remove(order.getId());
        orderMap.put(order.getId(),order);
        return order;
    }

    public void deleteOrder(long id){
        orderMap.remove(id);
    }
}
