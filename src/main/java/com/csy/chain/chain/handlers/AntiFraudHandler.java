package com.csy.chain.chain.handlers;

import com.csy.chain.chain.CreditApplyMqChain;
import com.csy.chain.chain.Request;
import com.csy.chain.chain.TradeContext;
import com.csy.chain.common.exception.BizException;
import com.csy.chain.core.aop.ServerCatch;
import com.csy.chain.core.pipeline.rollback.RollBack;
import com.csy.chain.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component("antiFraudHandler")
public class AntiFraudHandler implements CreditApplyMqChain {


    @Autowired
    private UserService userService;

    @Retryable(value= Exception.class,maxAttempts = 2,backoff = @Backoff(delay = 2000L))
    @Transactional(rollbackFor = BizException.class)
    @Override
    public TradeContext process(Chain<Request, TradeContext> chain) {
        log.info("尝试. .........1");
        TradeContext response = chain.response();
        response.setCheckSuccess(true);
        response.setErrorCode("成功");
        response.setErrorMsg("000000");
        response.setHandUp(false);
        response.setNodeName("antiFraudHandler");
        userService.insert();
        if(true){
            throw new BizException("222222222");
        }
        return chain.process(chain.request(),response);
    }



    @Override
    public TradeContext recover(Exception e, Chain<Request, TradeContext> chain) {
        TradeContext response = chain.response();
        log.info("补偿机制");
        return chain.process(chain.request(),response);
    }


}
