package com.example.repository;

import com.example.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAddressRepository extends JpaRepository<Address, Integer> {

    @Query(value = "select * from address",nativeQuery = true)
    List<Address> findAllAddress();
}
