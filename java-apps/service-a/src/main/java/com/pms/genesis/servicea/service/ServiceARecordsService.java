package com.pms.genesis.servicea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.genesis.servicea.entity.ServiceARecords;
import com.pms.genesis.servicea.repository.ServiceARecordsRepository;

import jakarta.transaction.Transactional;

@Service
public class ServiceARecordsService {
    @Autowired
    private ServiceARecordsRepository serviceARecordsRepository;
    @Transactional
    public void saveRecord(ServiceARecords record) {
        serviceARecordsRepository.save(record);
    }
}
