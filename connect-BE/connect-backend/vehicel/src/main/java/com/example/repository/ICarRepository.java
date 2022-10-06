package com.example.repository;

import com.example.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import javax.websocket.server.PathParam;
import java.util.Optional;

@Transactional
public interface ICarRepository extends JpaRepository<Car, Integer> {

    @Query(value = "select * from car", nativeQuery = true)
    Page<Car> findAllCar(Pageable pageable);

    @Modifying
    @Query(value = "delete from car c where c.id =  ?1", nativeQuery = true)
    void deleteCar(@PathParam("id") Integer id);

    @Query(value = "SELECT * FROM car where id = ?1", nativeQuery = true)
    Optional<Car> findCarId(Integer id);

}
