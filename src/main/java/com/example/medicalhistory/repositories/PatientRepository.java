package com.example.medicalhistory.repositories;

import com.example.medicalhistory.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    //SELECT * FROM Patients where InsurenceCarrier = ${}
    public List<Patient> findAllByInsuranceCarrier(String insuranceCarrier);

    @Query(value = "SELECT * FROM Patients WHERE address=?", nativeQuery = true)
    public List<Patient> findTest(String address);

}









