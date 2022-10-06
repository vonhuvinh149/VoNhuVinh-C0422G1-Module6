package com.example.repository;

import com.example.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ICarRepository extends JpaRepository<Car, Integer> {

    @Query(value = "select * from car", nativeQuery = true)
    Page<Car> findAllCar(Pageable pageable);

    @Query(value = "delete from vehicle_connect_be where id =  ?1", nativeQuery = true)
    void deleteCar(Integer id);

    @Query("")
    Optional<Car> car(Integer id);
}
