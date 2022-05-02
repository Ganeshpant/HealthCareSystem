package com.broadway.healthCare.service;

import java.util.List;

import com.broadway.healthCare.model.Admin;

public interface IAdminService {

	void addAdmin(Admin admin );
    void deleteAdmin(int id);
    Admin validAdmin(String name, String pass);
    List<Admin> showAdminList();
}
