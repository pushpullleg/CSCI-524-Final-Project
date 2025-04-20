package com.etamu.stms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.etamu.stms.UserLogin;
import com.etamu.stms.repository.StudentLoginRepository;


@Service
public class StudentLoginService {
    
    @Autowired
    private StudentLoginRepository repo;

    public List<UserLogin> authenticate() {
        
        Iterable<UserLogin> records = repo.findAll();


        List<UserLogin> users = new ArrayList<>();

        for (UserLogin element : records) {
            // Process each element
            System.out.println(element.getCwid());

            users.add(element);
        }
        


        return users;
    }

}
