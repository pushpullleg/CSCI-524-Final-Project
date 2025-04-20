package com.etamu.stms;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserLogin {

    @Id
    @Column
    private String cwid;

    @Column
    private String password;

    @Column(name = "EmailID")
    private String emailId;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @Column
    private String type;

    // Getters
    public String getCwid() {
        return cwid;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getType() {
        return type;
    }

    // Setters
    public void setCwid(String cwid) {
        this.cwid = cwid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setType(String type) {
        this.type = type;
    }
}
