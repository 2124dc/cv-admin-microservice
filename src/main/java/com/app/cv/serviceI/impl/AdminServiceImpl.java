package com.app.cv.serviceI.impl;

import com.app.cv.exception.UserAlreadyExistException;
import com.app.cv.mapper.IAdminMapper;
import com.app.cv.model.Admin;
import com.app.cv.model.AuthRegisterRequest;
import com.app.cv.serviceI.AdminServiceI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.cv.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminServiceI {

    // Create a logger instance for the class
    private static final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

    @Autowired
    AdminRepository adminRepository;

    @Autowired
    IAdminMapper mapper;

    @Override
    public Admin saveAdmin(AuthRegisterRequest authRegisterRequest) {
        logger.info("AuthDetailsService -> saveAdmin : {}", authRegisterRequest);
        if (adminRepository.existsByEmail(authRegisterRequest.getUsername())) {
            logger.error("AuthDetailsService -> saveAdmin -> existsByEmail: {}", authRegisterRequest.getUsername());
            throw new UserAlreadyExistException("Email already exists. Please choose a different email.");
        }
        Admin admin = mapper.mapAdminData(authRegisterRequest);
        return adminRepository.save(admin);
    }

    
}
