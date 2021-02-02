package com.csy.chain.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 引擎解析器。
 * <p>通过spring的特性策略模式初始化EngineExecutorMap</p>
 *
 * @author liuulingfeng
 * @since $Revision:1.0.0, $Date: 2021年1月27日 上午10:59:49 $
 */
@Component
public class EngineResolver1 implements InitializingBean, ApplicationContextAware {

    private ApplicationContext applicationContext;

    private Map<String, VerifyResult> EngineExecutorMap = new HashMap<>();
    private Map<String, VerifyResult> EngineExecutorMapa = new HashMap<>();
    private Map<String,Map<String, VerifyResult> >allEngineExecutorMapa = new HashMap<>();

    @Override
    public void afterPropertiesSet() {
        Map<String, VerifyResult> beanMap = applicationContext.getBeansOfType(VerifyResult.class);
        for (VerifyResult executor : beanMap.values()) {
            //成功 通过
            EnumResultType enumResultType = executor.resultTypename();
            //业务
            EnumBusinessType businessType= executor.businessType();
            this.EngineExecutorMap.clear();
            //如果成功 失败 重复
            if (EngineExecutorMap.containsKey(enumResultType.getCode())) {
                this.EngineExecutorMap.put(enumResultType.getCode(),executor);
            }else{
                this.EngineExecutorMap.put(enumResultType.getCode(),executor);
            }

            allEngineExecutorMapa.put(businessType.getCode(),EngineExecutorMap);

        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public VerifyResult getExecutor(String orderType) {
        return EngineExecutorMap.get(orderType);
    }

    public VerifyResult getExecutor1(String orderType) {
        return EngineExecutorMapa.get(orderType);
    }

}
