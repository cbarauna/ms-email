package com.ms.email.service;


import com.ms.email.models.User;
import com.ms.email.repositories.AddressRepository;
import com.ms.email.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private AddressRepository ad;

    public List<User> findAll() {
        var list = repository.findAll();
        return list;
    }

    public List<User> findAllAddres() {
        return repository.findFirstByAddressUser();
    }

}
