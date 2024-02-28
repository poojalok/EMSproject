package com.example.EMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EMS.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods if needed
}
