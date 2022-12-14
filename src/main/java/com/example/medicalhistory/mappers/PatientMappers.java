package com.example.medicalhistory.mappers;

import com.example.medicalhistory.dtos.CreatePatientDto;
import com.example.medicalhistory.dtos.PatientDto;
import com.example.medicalhistory.entities.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientMappers {
    public PatientDto convertFromEntity(Patient entity) {
        PatientDto dto = new PatientDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setAddress(entity.getAddress());
        dto.setPhone(entity.getPhone());
        dto.setInsuranceCarrier(entity.getInsuranceCarrier());
        dto.setAmount(entity.getAmount());
        return dto;
    }

    public Patient convertToEntity(CreatePatientDto dto) {
        Patient patient = new Patient();
        patient.setAddress(dto.getAddress());
        patient.setName(dto.getName());
        patient.setSurname(dto.getSurname());
        patient.setPhone(dto.getPhone());
        patient.setInsuranceCarrier(dto.getInsuranceCarrier());
        patient.setAmount(0);
        return patient;
    }
}









