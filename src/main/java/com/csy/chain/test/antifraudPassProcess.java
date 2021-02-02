package com.csy.chain.test;

import org.springframework.stereotype.Component;

@Component
public class antifraudPassProcess extends passProcess {

    @Override
    public EnumBusinessType businessType() {
        return EnumBusinessType.anti;
    }
}
