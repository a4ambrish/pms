package com.pms.genesis.servicea.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pms.genesis.servicea.entity.ServiceARecords;
import com.pms.genesis.servicea.service.ServiceARecordsService;

@RestController(value = "serviceAController")

@RequestMapping("/service-a")
public class ServiceAController {

    @Autowired
    ServiceARecordsService serviceARecordsService;

    @GetMapping("/sum")
    public Map<String, Object> getSum(@RequestParam(name="a") int a, @RequestParam(name="b") int b) {
        int sum = a + b;
        Map<String, Object> response = new HashMap<>();
        response.put("a", a);
        response.put("b", b);
        response.put("sum", sum);
    
    ServiceARecords record = new ServiceARecords();
    record.setOperation("sum");
    record.setA(a);
    record.setB(b);
    record.setResult(sum);
    serviceARecordsService.saveRecord(record);
    
        return response;
    }
}
