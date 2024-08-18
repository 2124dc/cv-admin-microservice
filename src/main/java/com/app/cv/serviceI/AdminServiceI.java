package com.app.cv.serviceI;

import com.app.cv.model.AdminLoginRequest;
import com.app.cv.model.AdminLoginResponse;
import org.springframework.stereotype.Service;

@Service
public interface AdminServiceI {
    AdminLoginResponse adminLogin(AdminLoginRequest adminLoginRequest);
}
