package com.omkesh.learn.spring.controller;

import com.omkesh.learn.spring.entity.Address;
import com.omkesh.learn.spring.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/info-by-id")
    public Address getAddressInfoById(Long id) {
        return addressService.getAddressById(id);
    }

    @PostMapping("/save")
    public Address saveAddress(Address address) {
        return addressService.saveAddress(address);
    }

}
