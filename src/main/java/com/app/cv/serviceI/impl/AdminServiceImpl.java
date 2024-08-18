package com.app.cv.serviceI.impl;

import com.app.cv.exception.InvalidCredentialsException;
import com.app.cv.exception.NotFountException;
import com.app.cv.mapper.AdminMapperI;
import com.app.cv.model.Admin;
import com.app.cv.model.AdminLoginRequest;
import com.app.cv.model.AdminLoginResponse;
import com.app.cv.repository.AdminRepository;
import com.app.cv.serviceI.AdminServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminServiceI {

    @Autowired
    AdminRepository adminRepository;

    @Autowired
    AdminMapperI adminMapperI;

    @Override
    public AdminLoginResponse adminLogin(AdminLoginRequest adminLoginRequest) {
        Admin admin = adminRepository.findByEmail(adminLoginRequest.getUsername());
        if (admin == null) {
            System.out.println("Admin not found");
            throw new NotFountException("Admin not found");
        }else if(admin.getPassword().equals(adminLoginRequest.getPassword())){
            System.out.println("Admin logged in");
            AdminLoginResponse adminLoginResponse = new AdminLoginResponse();
            adminLoginResponse.setStatus("Success");
            adminLoginResponse.setMessage("Admin logged in");
            return adminLoginResponse;
//            return  adminMapperI.adminModelToGeneratedAdminResponse(admin);
        }else{
            System.out.println("Password Not Matched");
            throw new InvalidCredentialsException("Invalid Credentials");
        }
    }
}
