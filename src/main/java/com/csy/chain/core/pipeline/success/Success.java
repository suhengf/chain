package com.csy.chain.core.pipeline.success;

import com.csy.chain.core.pipeline.InvocationChain;

/**
 * 整个流程成功后需要做的事
 */
public interface Success<T, S> {

    void success(InvocationChain<T, S> invocationChain);

}
