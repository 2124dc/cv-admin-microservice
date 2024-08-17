package com.app.cv.delegateImpl;

import com.app.cv.api.AdminApiDelegate;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@Service
public class AdminDelegateImpl implements AdminApiDelegate {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return AdminApiDelegate.super.getRequest();
    }
}
