package com.сontractсalculation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "cannot be empty increase amount")
    @Column(name = "increase_amount")
    private float increaseAmount;
    @NotBlank(message = "cannot be empty estate type")
    @Column(name = "estate_type")
    private String estateType;
    @NotNull(message = "cannot be empty ears building")
    @Column(name = "ears_building")
    private int earsBuilding;
    @NotNull(message = "cannot be empty area square")
    @Column(name = "area_square")
    private float areaSquare;
    @NotNull(message = "cannot be empty date start")
    @Column(name = "date_start")
    private LocalDate dateStart;
    @NotNull(message = "cannot be empty date end")
    @Column(name = "date_end")
    private LocalDate dateEnd;
    @NotNull(message = "cannot be empty date calculate")
    @Column(name = "date_calculate")
    private LocalDate dateCalculate;
    @Column(name = "amount_award")
    private double amountAward;
    @NotNull(message = "cannot be empty policyholder")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "policyholder_id")
    private Policyholder policyholder;
    @NotNull(message = "cannot be empty estate info")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "estate_info_id")
    private EstateInfo estateInfo;
    @NotBlank(message = "cannot be empty №order")
    @Column(name = "number_order")
    private String numberOrder;
    @Column(name = "date_register_order")
    private LocalDate dateRegisterOrder;
    @NotBlank(message = "cannot be empty comment")
    @Column(name = "comment_for_order")
    private String commentForOrder;

    public Order() {
    }

    public Order(float increaseAmount, String estateType, int earsBuilding, float areaSquare, LocalDate dateStart, LocalDate dateEnd,
                 LocalDate dateCalculate, double amountAward, Policyholder policyholder, EstateInfo estateInfo, String numberOrder,
                 LocalDate dateRegisterOrder, String commentForOrder) {
        this.increaseAmount = increaseAmount;
        this.estateType = estateType;
        this.earsBuilding = earsBuilding;
        this.areaSquare = areaSquare;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.dateCalculate = dateCalculate;
        this.amountAward = amountAward;
        this.policyholder = policyholder;
        this.estateInfo = estateInfo;
        this.numberOrder = numberOrder;
        this.dateRegisterOrder = dateRegisterOrder;
        this.commentForOrder = commentForOrder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Policyholder getPolicyholder() {
        return policyholder;
    }

    public void setPolicyholder(Policyholder policyholder) {
        this.policyholder = policyholder;
    }

    public EstateInfo getEstateInfo() {
        return estateInfo;
    }

    public void setEstateInfo(EstateInfo estateInfo) {
        this.estateInfo = estateInfo;
    }

    public String getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(String numberOrder) {
        this.numberOrder = numberOrder;
    }

    public LocalDate getDateRegisterOrder() {
        return dateRegisterOrder;
    }

    public void setDateRegisterOrder(LocalDate dateRegisterOrder) {
        this.dateRegisterOrder = dateRegisterOrder;
    }

    public String getCommentForOrder() {
        return commentForOrder;
    }

    public void setCommentForOrder(String commentForOrder) {
        this.commentForOrder = commentForOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(numberOrder, order.numberOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOrder);
    }

}
