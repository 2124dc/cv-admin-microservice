package com.app.cv.serviceI;

import org.springframework.stereotype.Service;

import com.app.cv.model.Admin;
import com.app.cv.model.AuthRegisterRequest;

@Service
public interface AdminServiceI {

    Admin saveAdmin(AuthRegisterRequest authRegisterRequest);

}
