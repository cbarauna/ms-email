package com.ms.email.controllers;


import com.ms.email.models.Address;
import com.ms.email.models.User;
import com.ms.email.service.AddressService;
import com.ms.email.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private AddressService adService;

    @GetMapping("/user")
    ResponseEntity<List<User>> getAll() {

        List<User> t = service.findAll();

        return ResponseEntity.ok().body(t);
    }

    @GetMapping("/user1")
    ResponseEntity<List<User>> getUserAddres() {

        List<User> t = service.findAllAddres();

        return ResponseEntity.ok().body(t);
    }

    @GetMapping("/addres")
    ResponseEntity<List<Address>> getAllAddress() {

        List<Address> t = adService.getAll();

        return ResponseEntity.ok().body(t);
    }

    @GetMapping("/addres1")
    ResponseEntity<List<String>> getStreet() {

        List<String> t = adService.getStreet();

        return ResponseEntity.ok().body(t);
    }
}
