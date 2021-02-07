package com.trinetra.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinetra.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Serializable>{

}
