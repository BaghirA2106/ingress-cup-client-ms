package com.coffeshop.ingresscupclientms.mapper;

import com.coffeshop.ingresscupclientms.entity.CoffeeOrder;
import com.coffeshop.ingresscupclientms.model.CoffeeOrderDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CoffeeOrderMapper {

    CoffeeOrderDto entityToDto(CoffeeOrder coffeeOrderEntity);
    CoffeeOrder dtoToEntity (CoffeeOrderDto coffeeOrderDto);
}
