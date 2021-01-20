package com.csy.chain.biz.pipe;

import com.csy.chain.core.pipeline.AbstractPipe;
import com.csy.chain.biz.bo.CreateOrderContext;
import com.csy.chain.biz.bo.CreateOrderRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class InsertOrderPipe extends AbstractPipe<CreateOrderRequest, CreateOrderContext> {

    @Override
    protected boolean isFilter(CreateOrderRequest request, CreateOrderContext context) {
        return false;
    }

    @Override
    protected void bizHandler(CreateOrderRequest request, CreateOrderContext context) {
        context.setOrderId(1L);
    }

}
