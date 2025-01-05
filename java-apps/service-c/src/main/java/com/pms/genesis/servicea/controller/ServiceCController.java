package com.pms.genesis.servicea.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pms.genesis.servicea.entity.ServiceCRecords;
import com.pms.genesis.servicea.service.ServiceCRecordsService;

@RestController(value = "serviceAController")

@RequestMapping("/service-c")
public class ServiceCController {

    @Autowired
    ServiceCRecordsService serviceCRecordsService;

    @GetMapping("/multiply")
    public Map<String, Object> getMultiply(@RequestParam(name="a") int a, @RequestParam(name="b") int b) {
        int multiply = a * b;
        Map<String, Object> response = new HashMap<>();
        response.put("a", a);
        response.put("b", b);
        response.put("multiply", multiply);
    
    ServiceCRecords record = new ServiceCRecords();
    record.setOperation("multiply");
    record.setA(a);
    record.setB(b);
    record.setResult(multiply);
    serviceCRecordsService.saveRecord(record);
    
        return response;
    }
}
