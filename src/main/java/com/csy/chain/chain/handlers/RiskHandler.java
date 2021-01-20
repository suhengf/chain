package com.csy.chain.chain.handlers;

import com.csy.chain.chain.CreditApplyMqChain;
import com.csy.chain.chain.Request;
import com.csy.chain.chain.TradeContext;
import org.springframework.stereotype.Component;

@Component("riskHandler")
public class RiskHandler implements CreditApplyMqChain {
    @Override
    public TradeContext process(Chain<Request, TradeContext> chain) {
        TradeContext response = chain.response();
        return chain.process(chain.request(),response);
    }
}
