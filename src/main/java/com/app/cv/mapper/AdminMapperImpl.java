package com.app.cv.mapper;

import com.app.cv.model.Admin;
import com.app.cv.model.AdminLoginResponse;
import org.springframework.stereotype.Service;

@Service
public class AdminMapperImpl implements  AdminMapperI{
    @Override
    public AdminLoginResponse adminModelToGeneratedAdmin(Admin admin) {
        return null;
    }

    @Override
    public AdminLoginResponse adminModelToGeneratedAdminResponse(Admin admin) {

        return null;
    }
}
