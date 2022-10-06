package com.example.controller;


import com.example.model.Car;
import com.example.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/vehicle")
public class VehicleRestController {

    @Autowired
    private ICarService carService;


    @GetMapping("/list")
    public ResponseEntity<Page<Car>> listCar(Pageable pageable) {
        Page<Car> cars = this.carService.findAllCar(pageable);
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<?> removeCar(@PathVariable Integer id){
        Optional<Car> car = carService
    }
}
