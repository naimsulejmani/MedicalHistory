package com.example.medicalhistory.mappers;

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
}
