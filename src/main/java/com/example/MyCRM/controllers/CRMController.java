package com.example.MyCRM.controllers;

import com.example.MyCRM.services.CRMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CRMController {
    private CRMService service;

    @Autowired
    public CRMController(CRMService service) {
        this.service = service;
    }

    //TODO
//    @PostMapping("/crm")
//    public int calculate(@RequestBody Calculator calculator) {
//        int result = service.calculate(calculator.getExpression());
//        return result;
//    }
}