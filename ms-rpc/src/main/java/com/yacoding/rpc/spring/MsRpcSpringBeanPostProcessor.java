package com.yacoding.rpc.spring;

/**
 * @Author yaCoding
 * @create 2022-06-22 下午 4:47
 */

import com.yacoding.rpc.config.MsRpcConfig;
import com.yacoding.rpc.netty.client.NettyClient;
import com.yacoding.rpc.register.nacos.NacosTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 在spring 的bean 初始化中 前后进行调用，一般代码都写到 初始化之后
 */
@Slf4j
public class MsRpcSpringBeanPostProcessor implements BeanPostProcessor, BeanFactoryPostProcessor {

    private MsRpcSpringBeanPostProcessor msRpcSpringBeanPostProcessor;
    private MsRpcConfig msRpcConfig;
    private NettyClient nettyClient;
    private NacosTemplate nacosTemplate;

    public MsRpcSpringBeanPostProcessor() {
        //1.防止线程问题 2.便于其他类使用
    }
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {



    }
}
