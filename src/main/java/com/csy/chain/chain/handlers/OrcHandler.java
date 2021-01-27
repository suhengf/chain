package com.csy.chain.chain.handlers;

import com.csy.chain.chain.CreditApplyMqChain;
import com.csy.chain.chain.Request;
import com.csy.chain.chain.TradeContext;
import com.csy.chain.core.aop.ServerCatch;
import org.springframework.stereotype.Component;

@Component("orcHandler")
public class OrcHandler implements CreditApplyMqChain {

    @ServerCatch(maxtryCount = 3)
    @Override
    public TradeContext process(Chain<Request, TradeContext> chain) {
        TradeContext response = chain.response();
        response.setCheckSuccess(false);
        response.setErrorCode("失败");
        response.setErrorMsg("000000");
        response.setHandUp(true);
        response.setNodeName("orcHandler");
        return chain.process(chain.request(),response);
    }
}
