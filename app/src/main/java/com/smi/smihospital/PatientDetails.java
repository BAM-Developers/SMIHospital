package com.smi.smihospital;

import android.location.Address;

import java.util.Date;

public class PatientDetails {
    public String name_title, gender, name, phone_number, email, referenceNo, bloodGrp, emergency_Conatact, dob, address, city, zip, state;

    public PatientDetails() {

    }

    public PatientDetails(String name_title,
                          String gender,
                          String bloodGrp,
                          String name,
                          String address,
                          String state,
                          String city,
                          String zip,
                          String phone_number,
                          String emergency_Contact,
                          String email,
                          String dob,
                          String referenceNo) {
        this.gender = gender;
        this.name_title = name_title;
        this.name = name;
        this.bloodGrp = bloodGrp;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.dob = dob;
        this.email = email;
        this.phone_number = phone_number;
        this.emergency_Conatact = emergency_Contact;
        this.referenceNo = referenceNo;
    }
}

