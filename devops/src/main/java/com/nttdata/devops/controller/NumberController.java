package com.nttdata.devops.controller;

import com.nttdata.devops.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

    @Autowired private NumberService service;

    @GetMapping("/division")
    public ResponseEntity<Float> divideTwoNumbers(@RequestParam Float dividend, @RequestParam Float divisor){
        if(dividend == null || divisor == null){
            return ResponseEntity.badRequest().body(-1F);
        } else{
            return ResponseEntity.ok(service.divideTwoNumbers(dividend, divisor));
        }
    }
}
