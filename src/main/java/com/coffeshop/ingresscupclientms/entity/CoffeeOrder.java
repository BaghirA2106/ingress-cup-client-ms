package com.coffeshop.ingresscupclientms.entity;

import com.coffeshop.ingresscupclientms.enums.Coffee_Size;
import com.coffeshop.ingresscupclientms.enums.Coffee_Type;
import com.coffeshop.ingresscupclientms.enums.OrderStatus;
import com.sun.istack.NotNull;
import jdk.jfr.Description;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = CoffeeOrder.TABLE_NAME)
public class  CoffeeOrder {

    public static final String TABLE_NAME = "Coffee_order_1";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nameOnCup;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Coffee_Type coffee_type;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Coffee_Size coffee_size;

    @Column(nullable = false)
    private String special_request;

    @Column(nullable = false)
    @NotNull
    private Boolean in_or_out;

    @Column(nullable = false)
    private LocalDateTime localDateTime;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;


}
