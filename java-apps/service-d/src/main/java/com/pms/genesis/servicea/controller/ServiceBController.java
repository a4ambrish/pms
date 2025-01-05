package com.pms.genesis.servicea.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pms.genesis.servicea.entity.ServiceDRecords;
import com.pms.genesis.servicea.service.ServiceDRecordsService;

@RestController(value = "serviceAController")

@RequestMapping("/service-d")
public class ServiceBController {

    @Autowired
    ServiceDRecordsService serviceDRecordsService;

    @GetMapping("/div")
    public Map<String, Object> getSum(@RequestParam(name="a") int a, @RequestParam(name="b") int b) {
        int div = a / b;
        Map<String, Object> response = new HashMap<>();
        response.put("a", a);
        response.put("b", b);
        response.put("div", div);
    
    ServiceDRecords record = new ServiceDRecords();
    record.setOperation("div");
    record.setA(a);
    record.setB(b);
    record.setResult(div);
    serviceDRecordsService.saveRecord(record);
    
        return response;
    }
}
