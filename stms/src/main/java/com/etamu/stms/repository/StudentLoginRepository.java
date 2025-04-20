package com.etamu.stms.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.etamu.stms.UserLogin;

@Repository
public interface StudentLoginRepository extends CrudRepository<UserLogin, String> {
    
}

