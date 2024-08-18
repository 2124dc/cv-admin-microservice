package com.app.cv.mapper;

import com.app.cv.model.Admin;
import com.app.cv.model.AdminLoginResponse;
import org.springframework.stereotype.Service;

public interface AdminMapperI {
    AdminLoginResponse adminModelToGeneratedAdmin(Admin admin);

    AdminLoginResponse adminModelToGeneratedAdminResponse(Admin admin);
}
