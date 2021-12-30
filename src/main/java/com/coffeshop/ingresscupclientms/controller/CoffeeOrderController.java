package com.coffeshop.ingresscupclientms.controller;

import com.coffeshop.ingresscupclientms.model.CoffeeOrderDto;
import com.coffeshop.ingresscupclientms.service.CoffeeOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1.0/order")
@RequiredArgsConstructor
public class CoffeeOrderController {

    private CoffeeOrderService orderService;

    @PostMapping("/create")
    public CoffeeOrderDto create (@RequestBody CoffeeOrderDto orderDto){
       CoffeeOrderDto createCoffee = orderService.createOrder(orderDto);
       return createCoffee;
    }

    @DeleteMapping("/delete")
    public void delete (@PathVariable String name){
        orderService.deleteOrderById(new CoffeeOrderDto().getNameOnCup());

    }
}
