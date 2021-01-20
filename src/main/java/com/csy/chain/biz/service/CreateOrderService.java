package com.csy.chain.biz.service;

import com.csy.chain.biz.bo.CreateOrderRequest;
import com.csy.chain.biz.bo.CreateOrderResponse;
import com.csy.chain.common.Result;

public interface CreateOrderService {

    Result<CreateOrderResponse> createOrder(CreateOrderRequest request);

}
