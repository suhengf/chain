package com.csy.chain.test;

public abstract class passProcess  implements VerifyResult {


    @Override
    public void resultProcess() {

    }

    @Override
    public EnumResultType resultTypename() {
        return EnumResultType.pass;
    }
}
