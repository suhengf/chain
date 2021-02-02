package com.csy.chain.test;

public abstract class rejectProcess implements VerifyResult {


    @Override
    public void resultProcess() {

    }

    @Override
    public EnumResultType resultTypename() {
        return EnumResultType.fail;
    }
}
