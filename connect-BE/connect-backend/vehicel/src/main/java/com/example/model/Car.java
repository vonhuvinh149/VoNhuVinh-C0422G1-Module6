package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "id_number")
    private String idNumber;
    @Column(name = "house_car_name")
    private String houseCarName;
    private String phone;
    private String email;
    @Column(name = "start_time")
    private String startTime;
    @Column(name = "end_time")
    private String endTime;

    @ManyToOne
    @JoinColumn(name = "car_type")
    private CarType carType;

    @ManyToOne
    @JoinColumn(name = "start_address")
    private Address startAddress;

    @ManyToOne
    @JoinColumn(name = "end_address")
    private Address endAddress;

    public Car() {
    }

    public Car(Integer id, String idNumber, String houseCarName, String phone, String email, String startTime, String endTime, CarType carType, Address startAddress, Address endAddress) {
        this.id = id;
        this.idNumber = idNumber;
        this.houseCarName = houseCarName;
        this.phone = phone;
        this.email = email;
        this.startTime = startTime;
        this.endTime = endTime;
        this.carType = carType;
        this.startAddress = startAddress;
        this.endAddress = endAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getHouseCarName() {
        return houseCarName;
    }

    public void setHouseCarName(String houseCarName) {
        this.houseCarName = houseCarName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Address getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(Address startAddress) {
        this.startAddress = startAddress;
    }

    public Address getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(Address endAddress) {
        this.endAddress = endAddress;
    }
}
