package com.broadway.healthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.broadway.healthCare.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	Admin findByNameAndPassword(String un, String pass);
}
