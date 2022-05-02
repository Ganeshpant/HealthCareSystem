package com.broadway.healthCare.service;

import java.util.List;

import com.broadway.healthCare.model.Doctor;

public interface IDoctorService {
	
	void addDoctor(Doctor doctor);
	List<Doctor> doctorList();
    void deleteDoctor(int id);
    Doctor selectByid(int id);
    void updateDoctor(Doctor doctor);
}
