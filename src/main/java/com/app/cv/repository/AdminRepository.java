package com.app.cv.repository;

import com.app.cv.model.Admin;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, String> {

    boolean existsByEmail(@NotNull String username);
   
}

