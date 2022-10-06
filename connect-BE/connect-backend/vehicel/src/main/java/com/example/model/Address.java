package com.example.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "address")
public class Address {
    @Id
    private Integer id;

    @Column(name = "address_name")
    private String addressName;

    @OneToMany(mappedBy = "startAddress", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Car> cars;

    @OneToMany(mappedBy = "endAddress", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Car> car;

    public Address() {
    }

    public Address(Integer id, String addressName, List<Car> cars, List<Car> car) {
        this.id = id;
        this.addressName = addressName;
        this.cars = cars;
        this.car = car;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }
}
