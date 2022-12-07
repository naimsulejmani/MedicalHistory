package com.example.medicalhistory.dtos;

import lombok.Data;

@Data
public class PatientDto {
    private long id;


    private String name;


    private String surname;


    private String address;


    private String phone;

    private double amount;


    private String insuranceCarrier;



}
