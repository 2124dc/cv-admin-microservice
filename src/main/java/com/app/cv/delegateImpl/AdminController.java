package com.app.cv.delegateImpl;

import com.app.cv.api.AdminApiDelegate;
import com.app.cv.common.classes.Common;
import com.app.cv.model.*;
import com.app.cv.serviceI.AdminServiceI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AdminController implements AdminApiDelegate {

    @Autowired
    AdminServiceI adminService;
    
    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Override
    public ResponseEntity<SuccessResponse> registerAdmin(AuthRegisterRequest authRegisterRequest) {
        logger.info("AuthController -> authRegisterPost : {}", authRegisterRequest);
        Admin admin = adminService.saveAdmin(authRegisterRequest);
        return new ResponseEntity<>(Common.getSuccessResponse("Data Saved Successfully", admin), HttpStatus.OK);
    }
}

