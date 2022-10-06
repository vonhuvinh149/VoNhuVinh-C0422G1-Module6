package com.example.service.impl;

import com.example.model.Car;
import com.example.repository.ICarRepository;
import com.example.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

@Service
public class CarService implements ICarService {

    @Autowired
    private ICarRepository carRepository;

    @Override
    public Page<Car> findAllCar(Pageable pageable) {
        return this.carRepository.findAllCar(pageable);
    }

    @Override
    public void deleteCar(Integer id) {
        this.carRepository.deleteCar(id);
    }

    @Override
    public Optional<Car> findCarId(Integer id) {
        return this.carRepository.findCarId(id);
    }

    @Override
    public void save(Car car) {
        this.carRepository.save(car);
    }



}
