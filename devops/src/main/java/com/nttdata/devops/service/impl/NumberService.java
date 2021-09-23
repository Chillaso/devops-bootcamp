package com.nttdata.devops.service.impl;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NumberService implements com.nttdata.devops.service.NumberService {
    @Override
    public Float divideTwoNumbers(Float dividend, Float divisor) {
        if(divisor == 0){
            throw new ArithmeticException("Can't divide by 0");
        }
        return dividend/divisor;
    }
}
