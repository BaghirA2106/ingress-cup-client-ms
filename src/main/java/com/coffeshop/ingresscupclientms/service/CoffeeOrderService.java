package com.coffeshop.ingresscupclientms.service;

import com.coffeshop.ingresscupclientms.model.CoffeeOrderDto;

public interface CoffeeOrderService {

    CoffeeOrderDto createOrder(CoffeeOrderDto coffeeOrderDto);

    void deleteOrderById(String nameOnCup);

     //List<CoffeeOrderDto> getAllActiveOrder();

    //List<CoffeeOrderDto> getAllOrder();

}
