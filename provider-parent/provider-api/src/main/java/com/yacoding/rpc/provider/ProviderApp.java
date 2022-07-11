package com.yacoding.rpc.provider;

import com.yacoding.rpc.annontation.EnableRpc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author yaCoding
 * @create 2022-06-29 上午 10:44
 */

@SpringBootApplication
@EnableRpc(nacosGroup = "ms-rpc",serverPort = 13568)
public class ProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class, args);
    }
}
