package com.example.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "car_type")
public class CarType {

    @Id
    private Integer id;
    @Column(name = "car_type_name")
    private String carTypeName;

    @OneToMany(mappedBy = "carType", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Car> cars;

    public CarType() {
    }

    public CarType(Integer id, String carTypeName, List<Car> cars) {
        this.id = id;
        this.carTypeName = carTypeName;
        this.cars = cars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
