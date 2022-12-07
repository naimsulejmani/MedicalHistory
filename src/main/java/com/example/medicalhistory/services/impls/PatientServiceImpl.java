package com.example.medicalhistory.services.impls;

import com.example.medicalhistory.dtos.CreatePatientDto;
import com.example.medicalhistory.dtos.PatientDto;
import com.example.medicalhistory.mappers.PatientMappers;
import com.example.medicalhistory.repositories.PatientRepository;
import com.example.medicalhistory.services.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    private final PatientRepository repository;
    private final PatientMappers mappers;

    public PatientServiceImpl(PatientRepository repository, PatientMappers mappers) {
        this.repository = repository;
        this.mappers = mappers;
    }

    @Override
    public List<PatientDto> getAll() {
        var patients = repository.findAll();
        // JAVA STREAM
        return patients.stream().map(mappers::convertFromEntity).toList();
    }

    @Override
    public PatientDto create(CreatePatientDto patientDto) {
        return null;
    }
}
