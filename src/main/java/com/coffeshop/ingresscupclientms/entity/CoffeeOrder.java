package com.coffeshop.ingresscupclientms.entity;

import com.coffeshop.ingresscupclientms.enums.Coffee_Size;
import com.coffeshop.ingresscupclientms.enums.Coffee_Type;
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

    public static final String TABLE_NAME = "Coffee_order";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nameOnCup;

    @NotNull
    private Coffee_Type coffee_type;

    @NotNull
    private Coffee_Size coffee_size;

    @Description("This column may be empty")
    private String special_request;

    @NotNull
    private Boolean in_or_out;

    @NotNull
    private LocalDateTime localDateTime;



}
