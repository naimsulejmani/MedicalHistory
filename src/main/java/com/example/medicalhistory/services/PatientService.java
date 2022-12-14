package com.example.medicalhistory.services;

import com.example.medicalhistory.dtos.CreatePatientDto;
import com.example.medicalhistory.dtos.PatientDto;

import java.util.List;

public interface PatientService {
    public List<PatientDto> getAll();
    public PatientDto create(CreatePatientDto patientDto);
    public List<PatientDto> getAllByInsuranceCarriers(String insuranceCarrier);
    public PatientDto getById(long patientId);
}







