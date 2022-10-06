package com.example.repository;

import com.example.model.CarType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICarTypeRepository extends JpaRepository<CarType, Integer> {

    @Query(value = "select * from car_type", nativeQuery = true)
    List<CarType> findAllCarType();
}
