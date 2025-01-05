package com.pms.genesis.servicea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.genesis.servicea.entity.ServiceBRecords;

import jakarta.transaction.Transactional;

import com.pms.genesis.servicea.repository.ServiceBRecordsRepository;

@Service
public class ServiceBRecordsService {
    @Autowired
    private ServiceBRecordsRepository serviceARecordsRepository;
    @Transactional
    public void saveRecord(ServiceBRecords record) {
        serviceARecordsRepository.save(record);
    }
}
