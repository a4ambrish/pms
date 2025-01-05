package com.pms.genesis.servicea.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity(name = "service_c_records")
@Data
public class ServiceCRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "operation")
    String operation;
    @Column(name = "a")
    double a;
    @Column(name = "b")
    double b;
    @Column(name = "result")
    double result;
    
}

/*
CREATE TABLE service_a_records (
    id SERIAL PRIMARY KEY,
    operation VARCHAR(255),
    a DOUBLE PRECISION,
    b DOUBLE PRECISION,
    result DOUBLE PRECISION
);
*/