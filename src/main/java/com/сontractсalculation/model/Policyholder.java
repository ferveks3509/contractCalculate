package com.сontractсalculation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "policyholders")
public class Policyholder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "cannot be empty name")
    private String name;
    @NotBlank(message = "cannot be empty surname")
    private String surname;
    @NotBlank(message = "cannot be empty lastname")
    private String lastname;
    @NotNull(message = "cannot be empty birthday")
    private LocalDate birthday;
    @NotBlank(message = "cannot be empty serial")
    private String serial;
    @NotBlank(message = "cannot be empty number")
    private String number;

    public Policyholder() {
    }

    public Policyholder(String name, String surname, String lastname, LocalDate birthday, String serial, String number) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.serial = serial;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policyholder that = (Policyholder) o;
        return Objects.equals(serial, that.serial) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial, number);
    }
}
