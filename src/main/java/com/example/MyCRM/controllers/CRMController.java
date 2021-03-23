package com.example.MyCRM.controllers;

import com.example.MyCRM.models.roles.Administrator;
import com.example.MyCRM.models.roles.Manager;
import com.example.MyCRM.models.roles.Support;
import com.example.MyCRM.services.CRMService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CRMController {
    private CRMService service;

    public CRMController(CRMService service){
        this.service = service;
    }

//    @PostMapping("/crm")
//    public int calculate(@RequestBody Calculator calculator) {
//        int result = service.calculate(calculator.getExpression());
//        return result;
//    }
//
//    @PostMapping("/crm/administrator")
//    @ResponseBody
//    public List<Administrator> showLogByDate(@RequestBody Map<String,String> param) {
//        List<Administrator> dataDate = service.showLogByDate(param.get("fromDate"), param.get("toDate"));
//        return dataDate;
//    }
//
//    @PostMapping("/crm/manager")
//    @ResponseBody
//    public List<Manager> showLogByExpressions(@RequestBody Map<String,String> params) {
//        List<Manager> dataExpression = service.showLogByExpression(params.get("expression"));
//        return dataExpression;
//    }
//
//    @PostMapping("/crm/support")
//    @ResponseBody
//    public List<Support> showLogByExpression(@RequestBody Map<String,String> params) {
//        List<Support> dataExpression = service.showLogByExpression(params.get("expression"));
//        return dataExpression;
//    }
}