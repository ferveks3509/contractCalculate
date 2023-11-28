package com.сontractсalculation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

@Entity
@Table(name = "estate_info")
public class EstateInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "cannot be empty state")
    private String state;
    @NotBlank(message = "cannot be empty index")
    private String index;
    @NotBlank(message = "cannot be empty region")
    private String region;
    @NotBlank(message = "cannot be empty distinct")
    private String district;
    @NotBlank(message = "cannot be empty city")
    private String city;
    @NotBlank(message = "cannot be empty street")
    private String street;
    @NotBlank(message = "cannot be empty house numb")
    @Column(name = "house_numb")
    private String houseNumb;
    @NotBlank(message = "cannot be empty corpus")
    private String corpus;
    @NotBlank(message = "cannot be empty building")
    private String building;
    @NotBlank(message = "cannot be empty apartment numb")
    @Column(name = "apartment_numb")
    private String apartmentNumb;

    public EstateInfo() {
    }

    public EstateInfo(String state, String index, String region, String district, String city, String street, String houseNumb,
                      String corpus, String building, String apartmentNumb) {
        this.state = state;
        this.index = index;
        this.region = region;
        this.district = district;
        this.city = city;
        this.street = street;
        this.houseNumb = houseNumb;
        this.corpus = corpus;
        this.building = building;
        this.apartmentNumb = apartmentNumb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumb() {
        return houseNumb;
    }

    public void setHouseNumb(String houseNumb) {
        this.houseNumb = houseNumb;
    }

    public String getCorpus() {
        return corpus;
    }

    public void setCorpus(String corpus) {
        this.corpus = corpus;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartmentNumb() {
        return apartmentNumb;
    }

    public void setApartmentNumb(String apartmentNumb) {
        this.apartmentNumb = apartmentNumb;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstateInfo that = (EstateInfo) o;
        return Objects.equals(state, that.state) && Objects.equals(region, that.region) && Objects.equals(city, that.city) && Objects.equals(street, that.street) && Objects.equals(houseNumb, that.houseNumb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, region, city, street, houseNumb);
    }
}
