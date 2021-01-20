package com.csy.chain.web;

import com.csy.chain.biz.bo.CreateOrderRequest;
import com.csy.chain.biz.bo.CreateOrderResponse;
import com.csy.chain.biz.service.CreateOrderService;
import com.csy.chain.chain.CreditApplyMqChain;
import com.csy.chain.chain.CreditTradeMqChainHandler;
import com.csy.chain.chain.Request;
import com.csy.chain.chain.TradeContext;
import com.csy.chain.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private CreateOrderService createOrderService;

    @Autowired
    @Qualifier("creditApplyMqHandlerList")
    @Lazy
    private List<CreditApplyMqChain> creditApplyMqChainList;

    @PostMapping("/createOrder")
    public Result<CreateOrderResponse> createOrder(@RequestBody CreateOrderRequest request) {
        return createOrderService.createOrder(request);
    }

    @PostMapping("/chainTest")
    public void createOrder1() {
        List<CreditApplyMqChain> chains = creditApplyMqChainList;
        Request request = new Request();
        TradeContext response = new TradeContext();
        CreditTradeMqChainHandler creditTradeMqChainHandler = new CreditTradeMqChainHandler(chains, 0, request, response);
        response = creditTradeMqChainHandler.process(request, response);
    }


}
