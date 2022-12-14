package com.example.medicalhistory.controllers;

import com.example.medicalhistory.dtos.CreatePatientDto;
import com.example.medicalhistory.dtos.PatientDto;
import com.example.medicalhistory.services.PatientService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/patients")
@CrossOrigin // i bjen me leju
// localhost:8080
// localhost:9090
public class PatientController {
    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<PatientDto>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PatientDto> getById(@PathVariable long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping("/insuranceCarriers")
    public ResponseEntity<List<PatientDto>> getAllBy(@RequestParam String name) {
        return ResponseEntity.ok(service.getAllByInsuranceCarriers(name));
    }

    @PostMapping
    public ResponseEntity<PatientDto> create(@RequestBody CreatePatientDto patientDto) {
        return ResponseEntity.status(201).body(service.create(patientDto));
    }
}












