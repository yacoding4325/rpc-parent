package com.yacoding.rpc.consumer;

import com.yacoding.rpc.annontation.EnableRpc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author yaCoding
 * @create 2022-06-22 上午 10:24
 */

@SpringBootApplication
@EnableRpc(nacosGroup = "ms-rpc")
public class ConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class,args);
    }
}
