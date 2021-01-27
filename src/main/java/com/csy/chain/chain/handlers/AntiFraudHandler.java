package com.csy.chain.chain.handlers;

import com.csy.chain.chain.CreditApplyMqChain;
import com.csy.chain.chain.Request;
import com.csy.chain.chain.TradeContext;
import org.springframework.stereotype.Component;

@Component("antiFraudHandler")
public class AntiFraudHandler implements CreditApplyMqChain {
    @Override
    public TradeContext process(Chain<Request, TradeContext> chain) {
        TradeContext response = chain.response();
        response.setCheckSuccess(true);
        response.setErrorCode("成功");
        response.setErrorMsg("000000");
        response.setHandUp(false);
        response.setNodeName("antiFraudHandler");
        return chain.process(chain.request(),response);
    }
}
