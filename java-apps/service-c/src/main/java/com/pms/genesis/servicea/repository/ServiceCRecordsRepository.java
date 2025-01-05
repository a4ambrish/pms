package com.pms.genesis.servicea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.genesis.servicea.entity.ServiceCRecords;


@Repository
public interface ServiceCRecordsRepository extends JpaRepository<ServiceCRecords, Long> 
{
}