package com.example.SpringJdbc;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarClass, Integer>  {

}
