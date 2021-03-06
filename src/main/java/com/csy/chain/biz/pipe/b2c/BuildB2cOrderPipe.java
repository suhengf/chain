package com.csy.chain.biz.pipe.b2c;

import com.csy.chain.core.pipeline.AbstractPipe;
import com.csy.chain.biz.bo.CreateOrderContext;
import com.csy.chain.biz.bo.CreateOrderRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 *   {
 * "addressId" : 1,
 * "bargainInfoId" :1,
 * "cartId": 2,
 *   "orderType": 1,
 *  "skuInfoList" :[
 * {
 *  "num": 1,
 *  "skuId":2
 *  }
 *  ],
 *   "userId":llf
 *   }
 */

@Slf4j
@Component
public class BuildB2cOrderPipe extends AbstractPipe<CreateOrderRequest, CreateOrderContext> {

    @Override
    protected boolean isFilter(CreateOrderRequest createOrderRequest, CreateOrderContext createOrderContext) {
        return false;
    }

    @Override
    protected void bizHandler(CreateOrderRequest createOrderRequest, CreateOrderContext createOrderContext) {

    }

}
