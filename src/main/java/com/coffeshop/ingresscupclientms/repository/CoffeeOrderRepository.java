package com.coffeshop.ingresscupclientms.repository;

import com.coffeshop.ingresscupclientms.entity.CoffeeOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeOrderRepository extends JpaRepository<CoffeeOrder, Long> {


    void deleteById(String nameOnCup);
}
