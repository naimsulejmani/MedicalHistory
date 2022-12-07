package com.example.medicalhistory.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity(name = "Appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private LocalDate date;

    @Column(length = 4000)
    private String reason;

    @ManyToOne()
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
