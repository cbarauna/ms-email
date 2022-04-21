package com.ms.email.service;

import com.ms.email.models.Address;
import com.ms.email.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    public List<Address> getAll() {

        return repository.findAll();
    }

    public List<String> getStreet() {
        return  repository.getAllFilter();
    }
}
