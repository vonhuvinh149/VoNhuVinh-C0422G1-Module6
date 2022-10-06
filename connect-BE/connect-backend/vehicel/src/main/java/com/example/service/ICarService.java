package com.example.service;

import com.example.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICarService {
    Page<Car> findAllCar(Pageable pageable);

    void deleteCar(Integer id);

    Optional<Car> findCarId(Integer id);
}
