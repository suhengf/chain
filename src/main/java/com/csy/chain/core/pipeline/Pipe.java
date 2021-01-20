package com.csy.chain.core.pipeline;

public interface Pipe<T, S> {

    void invoke(InvocationChain<T, S> invocationChain);

}
