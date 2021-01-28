package com.csy.chain.chain.handlers;

import com.csy.chain.chain.CreditApplyMqChain;
import com.csy.chain.chain.Request;
import com.csy.chain.chain.TradeContext;
import com.csy.chain.common.exception.BizException;
import org.springframework.retry.annotation.Recover;
import org.springframework.stereotype.Component;

@Component("riskHandler")
public class RiskHandler implements CreditApplyMqChain {
    @Override
    public TradeContext process(Chain<Request, TradeContext> chain) {
        TradeContext response = chain.response();
        response.setNodeName("riskHandler");
        return chain.process(chain.request(),response);
    }

    @Override
    public TradeContext recover(Exception e, Chain<Request, TradeContext> chain) {
        return null;
    }


}
