package com.example.controller;

import com.example.model.Address;
import com.example.service.IAddressService;
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
@RequestMapping("/address")
public class AddressRestController {

    @Autowired
    private IAddressService addressService;

    @GetMapping("/list")
    public ResponseEntity<List<Address>> listAddress() {
        List<Address> addressList = this.addressService.findAllAddress();
        return new ResponseEntity<>(addressList, HttpStatus.OK);
    }
}
