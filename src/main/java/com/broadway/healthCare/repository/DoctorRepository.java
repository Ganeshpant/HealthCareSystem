package com.broadway.healthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.broadway.healthCare.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

}
