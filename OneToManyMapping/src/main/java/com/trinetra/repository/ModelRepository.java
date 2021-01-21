package com.trinetra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinetra.entity.Model;

public interface ModelRepository extends JpaRepository<Model, Integer>  {

}
