package com.pms.genesis.servicea.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pms.genesis.servicea.entity.ServiceBRecords;
import com.pms.genesis.servicea.service.ServiceBRecordsService;

@RestController(value = "serviceAController")

@RequestMapping("/service-b")
public class ServiceBController {

    @Autowired
    ServiceBRecordsService serviceARecordsService;

    @GetMapping("/sub")
    public Map<String, Object> getSum(@RequestParam(name="a") int a, @RequestParam(name="b") int b) {
        int sub = a - b;
        Map<String, Object> response = new HashMap<>();
        response.put("a", a);
        response.put("b", b);
        response.put("sub", sub);
    
    ServiceBRecords record = new ServiceBRecords();
    record.setOperation("sub");
    record.setA(a);
    record.setB(b);
    record.setResult(sub);
    serviceARecordsService.saveRecord(record);
    
        return response;
    }
}
