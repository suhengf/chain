package com.csy.chain.biz.pipe;

import com.csy.chain.core.pipeline.AbstractPipe;
import com.csy.chain.biz.bo.CreateOrderContext;
import com.csy.chain.biz.bo.CreateOrderRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CartPipe extends AbstractPipe<CreateOrderRequest, CreateOrderContext> {

    @Override
    protected boolean isFilter(CreateOrderRequest createOrderRequest, CreateOrderContext createOrderContext) {
        return createOrderRequest.getCartId() == null;
    }

    @Override
    protected void bizHandler(CreateOrderRequest createOrderRequest, CreateOrderContext createOrderContext) {

    }

}
