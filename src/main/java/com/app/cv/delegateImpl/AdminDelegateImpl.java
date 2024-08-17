package com.app.cv.delegateImpl;

import com.app.cv.api.AdminApiDelegate;
import com.app.cv.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@Service
public class AdminDelegateImpl implements AdminApiDelegate {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return AdminApiDelegate.super.getRequest();
    }

    @Override
    public ResponseEntity<Void> addHotel(AddHotelRequest addHotelRequest) {
        return AdminApiDelegate.super.addHotel(addHotelRequest);
    }

    @Override
    public ResponseEntity<AdminLoginResponse> adminLogin(AdminLoginRequest adminLoginRequest) {
        return AdminApiDelegate.super.adminLogin(adminLoginRequest);
    }

    @Override
    public ResponseEntity<List<AdminRequest>> getRequest(String status) {
        return AdminApiDelegate.super.getRequest(status);
    }

    @Override
    public ResponseEntity<Void> updateRequest(String requestId, UpdateRequestRequest updateRequestRequest) {
        return AdminApiDelegate.super.updateRequest(requestId, updateRequestRequest);
    }
}
