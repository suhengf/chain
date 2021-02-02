package com.csy.chain.test;

import org.springframework.stereotype.Component;

@Component
public class antifraudfailProcess extends rejectProcess {


    @Override
    public EnumBusinessType businessType() {
        return EnumBusinessType.anti;
    }
}
