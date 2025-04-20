package com.etamu.stms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.etamu.stms.UserLogin;
import com.etamu.stms.service.StudentLoginService;

import java.util.List;


@RestController
@RequestMapping("/studentlogin")
public class StudentLoginController {
    
    @Autowired
    private StudentLoginService service;  // You'll need to create this service interface
    
    @PostMapping
    @CrossOrigin(origins = "http://localhost:5173")
    @ResponseStatus(HttpStatus.CREATED)
    public List<UserLogin> authenticate() {  // You'll need to create Foo class
        
        return service.authenticate();
    }
}
