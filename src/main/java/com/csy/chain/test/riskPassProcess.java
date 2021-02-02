package com.csy.chain.test;

import org.springframework.stereotype.Component;

@Component
public class riskPassProcess extends passProcess {
    @Override
    public EnumBusinessType businessType() {
        return EnumBusinessType.risk;
    }
}
