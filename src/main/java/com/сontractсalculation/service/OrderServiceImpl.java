package com.сontractсalculation.service;

import com.сontractсalculation.dto.OrderInfoDTO;
import com.сontractсalculation.model.Order;
import com.сontractсalculation.model.PreOrder;
import com.сontractсalculation.repository.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<OrderInfoDTO> findAll() {
        return orderRepository.findAllOrdersAndPolicyholders();
    }

    @Override
    public Optional<Order> findByNumberOrder(String number) {
        return Optional.ofNullable(orderRepository.findByNumberOrder(number));
    }

    @Transactional
    @Override
    public Order createOrUpdate(Order order) {
        order.setDateRegisterOrder(LocalDate.now());
        return orderRepository.save(order);
    }

    public PreOrder calculatePreorder(PreOrder preOrder) {
        preOrder.setDateCalculate(LocalDate.now());
        double value = insurancePremium(preOrder);
        preOrder.setAmountAward(value);
        return preOrder;
    }

    /*
    расчет страховой премии
     */
    private double insurancePremium(PreOrder order) {
        long valueDays = ChronoUnit.DAYS.between(order.getDateStart(), order.getDateEnd());
        double value = (order.getIncreaseAmount() / valueDays) *
                coefficientForTypeOfEstate(order) *
                coefficientForYearOfConstruction(order) *
                coefficientForArea(order);
        return value;
    }

    /*
    Коэффициент за тип недвижимости
     */
    private float coefficientForTypeOfEstate(PreOrder order) {
        if (order.getEstateType().equals("Квартира")) {
            return 1.7f;
        } else if (order.getEstateType().equals("Дом")) {
            return 1.5f;
        } else if (order.getEstateType().equals("Комната")) {
            return 1.3f;
        }
        return 0;
    }

    /*
    Коэффициент за год постройки
     */
    private float coefficientForYearOfConstruction(PreOrder order) {
        if (order.getEarsBuilding() < 2000) {
            return 1.3f;
        } else if (order.getEarsBuilding() >= 2000 && order.getEarsBuilding() <= 2014) {
            return 1.6f;
        } else if (order.getEarsBuilding() == 2015) {
            return 2f;
        }
        return 0;
    }

    /*
    Коэффициент за площадь
     */
    private float coefficientForArea(PreOrder order) {
        if (order.getAreaSquare() > 50) {
            return 1.2f;
        } else if (order.getAreaSquare() >= 50 && order.getAreaSquare() <= 100) {
            return 1.5f;
        } else {
            return 2f;
        }
    }
}
