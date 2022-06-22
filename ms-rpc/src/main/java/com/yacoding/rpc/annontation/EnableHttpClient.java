package com.yacoding.rpc.annontation;

import com.yacoding.rpc.bean.MsBeanDefinitionRegistry;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MsBeanDefinitionRegistry.class)
public @interface EnableHttpClient {
    //扫包路径
    String basePackage();
}
