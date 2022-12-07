package com.example.medicalhistory.dtos;

import lombok.Data;

@Data
public class CreatePatientDto {
    private String name;
    private String surname;
    private String address;
    private String phone;
    private String insuranceCarrier;
}
