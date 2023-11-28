package com.сontractсalculation.dto;

import java.time.LocalDate;

public class OrderInfoDTO {
    private String serial;
    private String number;
    private LocalDate dateRegisterOrder;
    private String surname;
    private String name;
    private String lastname;
    private double amountAward;
    private LocalDate dateStart;
    private LocalDate dateEnd;

    public OrderInfoDTO(String serial, String number, LocalDate dateRegisterOrder, String surname, String name, String lastname, double amountAward, LocalDate dateStart, LocalDate dateEnd) {
        this.serial = serial;
        this.number = number;
        this.dateRegisterOrder = dateRegisterOrder;
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.amountAward = amountAward;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public LocalDate getDateRegisterOrder() {
        return dateRegisterOrder;
    }

    public void setDateRegisterOrder(LocalDate dateRegisterOrder) {
        this.dateRegisterOrder = dateRegisterOrder;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate dateRegisterOrder() {
        return dateRegisterOrder;
    }

    public void setDateCalculate(LocalDate dateRegisterOrder) {
        this.dateRegisterOrder = dateRegisterOrder;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getAmountAward() {
        return amountAward;
    }

    public void setAmountAward(double amountAward) {
        this.amountAward = amountAward;
    }
}
