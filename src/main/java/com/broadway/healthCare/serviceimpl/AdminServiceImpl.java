package com.broadway.healthCare.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.broadway.healthCare.model.Admin;
import com.broadway.healthCare.repository.AdminRepository;
import com.broadway.healthCare.service.IAdminService;
@Service
public class AdminServiceImpl implements IAdminService{
@Autowired
private AdminRepository adminRepo;
	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdmin(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Admin validAdmin(String name, String pass) {
		
		return adminRepo.findByNameAndPassword(name, pass) ;
	}

	@Override
	public List<Admin> showAdminList() {
		
		return adminRepo.findAll();
	}

}
