package com.pms.genesis.servicea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.genesis.servicea.entity.ServiceDRecords;

import jakarta.transaction.Transactional;

import com.pms.genesis.servicea.repository.ServiceDRecordsRepository;

@Service
public class ServiceDRecordsService {
    @Autowired
    private ServiceDRecordsRepository serviceARecordsRepository;
    @Transactional
    public void saveRecord(ServiceDRecords record) {
        serviceARecordsRepository.save(record);
    }
}
