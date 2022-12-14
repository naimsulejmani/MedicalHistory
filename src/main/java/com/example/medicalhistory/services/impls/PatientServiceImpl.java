package com.example.medicalhistory.services.impls;

import com.example.medicalhistory.dtos.CreatePatientDto;
import com.example.medicalhistory.dtos.PatientDto;
import com.example.medicalhistory.entities.Patient;
import com.example.medicalhistory.mappers.PatientMappers;
import com.example.medicalhistory.repositories.PatientRepository;
import com.example.medicalhistory.services.PatientService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Patient patient = mappers.convertToEntity(patientDto);
        Patient newPatient = repository.save(patient);
        return mappers.convertFromEntity(newPatient);
    }

    @Override
    public List<PatientDto> getAllByInsuranceCarriers(String insuranceCarrier) {
        var patients = repository.findAllByInsuranceCarrier(insuranceCarrier);
        return patients.stream().map(mappers::convertFromEntity).toList();
    }

    @Override
    public PatientDto getById(long patientId) {
        var optionalPatient = repository.findById(patientId);
        if (optionalPatient.isEmpty())
            throw new EntityNotFoundException(String.format("Patient with id=%d not found!", patientId));
        return mappers.convertFromEntity(optionalPatient.get());
    }
}








