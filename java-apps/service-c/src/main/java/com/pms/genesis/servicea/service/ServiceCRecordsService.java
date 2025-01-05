package com.pms.genesis.servicea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.genesis.servicea.entity.ServiceCRecords;

import jakarta.transaction.Transactional;

import com.pms.genesis.servicea.repository.ServiceCRecordsRepository;

@Service
public class ServiceCRecordsService {
    @Autowired
    private ServiceCRecordsRepository serviceARecordsRepository;
    @Transactional
    public void saveRecord(ServiceCRecords record) {
        serviceARecordsRepository.save(record);
    }
}
