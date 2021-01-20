package com.csy.chain.chain;

public interface CreditApplyMqTradeChain <T,R>{

    R process(Chain<T,R>chain);

    interface Chain<T,R>{
        T request();

        R response();

        R process(T request,R response);
    }

}
