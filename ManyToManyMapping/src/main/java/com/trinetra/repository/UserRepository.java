package com.trinetra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinetra.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
