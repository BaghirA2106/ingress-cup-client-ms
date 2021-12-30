package com.coffeshop.ingresscupclientms.service.impl;

import com.coffeshop.ingresscupclientms.entity.CoffeeOrder;
import com.coffeshop.ingresscupclientms.mapper.CoffeeOrderMapper;
import com.coffeshop.ingresscupclientms.model.CoffeeOrderDto;
import com.coffeshop.ingresscupclientms.repository.CoffeeOrderRepository;
import com.coffeshop.ingresscupclientms.service.CoffeeOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CoffeeOrderServiceImpl  implements CoffeeOrderService {

    private CoffeeOrderMapper orderMapper;
    private CoffeeOrderRepository orderRepository;

    @Override
    public CoffeeOrderDto createOrder(CoffeeOrderDto coffeeOrderDto) {
        CoffeeOrder coffeeOrder = orderRepository.save(orderMapper.dtoToEntity(coffeeOrderDto));
        return orderMapper.entityToDto(coffeeOrder);
    }

    @Override
    public void deleteOrderById(String nameOnCup) {
        orderRepository.deleteById(nameOnCup);

    }
}
