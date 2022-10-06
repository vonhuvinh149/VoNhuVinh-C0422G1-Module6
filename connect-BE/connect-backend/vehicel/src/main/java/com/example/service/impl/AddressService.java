package com.example.service.impl;

import com.example.model.Address;
import com.example.repository.IAddressRepository;
import com.example.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements IAddressService {
    @Autowired
    private IAddressRepository addressRepository;
    @Override
    public List<Address> findAllAddress() {
        return this.addressRepository.findAllAddress();
    }
}
