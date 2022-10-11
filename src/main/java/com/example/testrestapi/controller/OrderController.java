package com.example.testrestapi.controller;

import com.example.testrestapi.entity.Order;
import com.example.testrestapi.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/")
public class OrderController {
    private OrderRepository orderRepo;

    public OrderController(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Order getOrder(@PathVariable long id){
        return orderRepo.getOrder(id);
    }
}
