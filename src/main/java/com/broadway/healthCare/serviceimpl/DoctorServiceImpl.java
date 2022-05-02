package com.broadway.healthCare.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.broadway.healthCare.model.Doctor;
import com.broadway.healthCare.repository.DoctorRepository;
import com.broadway.healthCare.service.IDoctorService;

@Service
public class DoctorServiceImpl implements IDoctorService {
@Autowired
private DoctorRepository docRepo;
	@Override
	public void addDoctor(Doctor doctor) {
		docRepo.save(doctor);
		
	}
	@Override
	public List<Doctor> doctorList() {
		
		return docRepo.findAll();
	}
	@Override
	public void deleteDoctor(int id) {
		docRepo.deleteById(id);
		
	}
	@Override
	public Doctor selectByid(int id) {
		
		return docRepo.getById(id);
	}
	@Override
	public void updateDoctor(Doctor doctor) {
		
		docRepo.save(doctor);
	}
	
	

}
