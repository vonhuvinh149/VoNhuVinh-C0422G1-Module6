package com.example.controller;

import com.example.model.CarType;
import com.example.service.ICarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("car_type")
public class CarTypeRestController {

    @Autowired
    private ICarTypeService carTypeService ;

    @GetMapping("/list")
    public ResponseEntity<List<CarType>> listCar(){
        List<CarType> carTypeList = this.carTypeService.findAllCarType();
        return new ResponseEntity<>(carTypeList, HttpStatus.OK);
    }
}
