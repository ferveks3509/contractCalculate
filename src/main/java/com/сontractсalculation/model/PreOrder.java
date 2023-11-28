package com.сontractсalculation.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class PreOrder {
    @NotNull(message = "cannot be empty increase amount")
    private float increaseAmount;
    @NotBlank(message = "cannot be empty estate type")
    private String estateType;
    @NotNull(message = "cannot be empty ears building")
    private int earsBuilding;
    @NotNull(message = "cannot be empty area square")
    private float areaSquare;
    @NotNull(message = "cannot be empty date start")
    private LocalDate dateStart;
    @NotNull(message = "cannot be empty date end")
    private LocalDate dateEnd;
    private LocalDate dateCalculate;
    private double amountAward;

    public PreOrder() {
    }

    public PreOrder(float increaseAmount, String estateType, int earsBuilding, float areaSquare, LocalDate dateStart, LocalDate dateEnd,
                    LocalDate dateCalculate, double amountAward) {
        this.increaseAmount = increaseAmount;
        this.estateType = estateType;
        this.earsBuilding = earsBuilding;
        this.areaSquare = areaSquare;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.dateCalculate = dateCalculate;
        this.amountAward = amountAward;
    }

    public float getIncreaseAmount() {
        return increaseAmount;
    }

    public void setIncreaseAmount(float increaseAmount) {
        this.increaseAmount = increaseAmount;
    }

    public String getEstateType() {
        return estateType;
    }

    public void setEstateType(String estateType) {
        this.estateType = estateType;
    }

    public int getEarsBuilding() {
        return earsBuilding;
    }

    public void setEarsBuilding(int earsBuilding) {
        this.earsBuilding = earsBuilding;
    }

    public float getAreaSquare() {
        return areaSquare;
    }

    public void setAreaSquare(float areaSquare) {
        this.areaSquare = areaSquare;
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

    public LocalDate getDateCalculate() {
        return dateCalculate;
    }

    public void setDateCalculate(LocalDate dateCalculate) {
        this.dateCalculate = dateCalculate;
    }

    public double getAmountAward() {
        return amountAward;
    }

    public void setAmountAward(double amountAward) {
        this.amountAward = amountAward;
    }
}
