package com.example.SpringJdbc;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentClass, Integer> {

}
