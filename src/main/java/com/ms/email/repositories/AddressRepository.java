package com.ms.email.repositories;

import com.ms.email.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {


    @Query(value = " SELECT a.street FROM Address a ")
    List<String> getAllFilter();

}
