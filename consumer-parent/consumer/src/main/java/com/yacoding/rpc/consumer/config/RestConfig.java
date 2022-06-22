package com.yacoding.rpc.consumer.config;

import com.yacoding.rpc.annontation.EnableHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yaCoding
 * @create 2022-06-22 上午 10:35
 */

@Configuration
@EnableHttpClient(basePackage = "com.yacoding.rpc.consumer.rpc")
public class RestConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
