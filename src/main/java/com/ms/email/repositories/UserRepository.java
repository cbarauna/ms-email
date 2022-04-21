package com.ms.email.repositories;

import com.ms.email.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "select * from user_ inner join address a on user_.id = a.user_id", nativeQuery = true)
    List<User> findFirstByAddressUser();

}
