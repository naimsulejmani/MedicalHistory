package com.example.medicalhistory.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "Patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String surname;

    @Column(length = 255)
    private String address;

    @Column(length = 50)
    private String phone;

    @Column
    private double amount;

    @Column
  //  @Enumerated() e definon indexion ose text
    private String insuranceCarrier;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;

}






