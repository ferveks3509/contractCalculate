package com.сontractсalculation.repository;

import com.сontractсalculation.dto.OrderInfoDTO;
import com.сontractсalculation.model.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Integer> {
    @Query("SELECT new com.сontractсalculation.dto.OrderInfoDTO(p.serial, p.number, o.dateRegisterOrder, p.surname, p.name, p.lastname, o.amountAward, o.dateStart, o.dateEnd) " +
            "FROM Order o LEFT JOIN o.policyholder p")
    List<OrderInfoDTO> findAllOrdersAndPolicyholders();
    Order findByNumberOrder(String number);
}
