package com.coffeshop.ingresscupclientms.model;

import com.coffeshop.ingresscupclientms.enums.Coffee_Size;
import com.coffeshop.ingresscupclientms.enums.Coffee_Type;
import com.coffeshop.ingresscupclientms.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.criterion.Order;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoffeeOrderDto {

    private String nameOnCup;
    private Coffee_Type coffee_type;
    private Coffee_Size coffee_size;
    private String special_request;
    private Boolean in_or_out;
    private LocalDateTime localDateTime;
    private OrderStatus orderStatus;
}

