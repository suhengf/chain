package com.csy.chain.test;

import org.springframework.stereotype.Component;

@Component
public class riskfailProcess extends rejectProcess {
    @Override
    public EnumBusinessType businessType() {
        return EnumBusinessType.risk;
    }
}
