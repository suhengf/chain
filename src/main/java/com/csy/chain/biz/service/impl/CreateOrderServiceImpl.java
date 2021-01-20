package com.csy.chain.biz.service.impl;

import com.csy.chain.biz.bo.CreateOrderContext;
import com.csy.chain.biz.bo.CreateOrderRequest;
import com.csy.chain.biz.bo.CreateOrderResponse;
import com.csy.chain.biz.service.CreateOrderService;
import com.csy.chain.common.Result;
import com.csy.chain.core.EngineResolver;
import com.csy.chain.core.aop.ServerCatch;
import com.csy.chain.core.engine.EngineExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateOrderServiceImpl implements CreateOrderService {

    @Autowired
    private EngineResolver engineResolver;

    @ServerCatch
    @Override
    public Result<CreateOrderResponse> createOrder(CreateOrderRequest request) {

        EngineExecutor engineExecutor = engineResolver.getExecutor(request.getOrderType());
        if (engineExecutor == null) {
            throw new RuntimeException("未找到创建订单执行器 orderType = " + request.getOrderType());
        }

        return engineExecutor.execute(request, new CreateOrderContext(), new CreateOrderResponse());
    }

}
