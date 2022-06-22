package com.yacoding.rpc.config;

import lombok.Data;

/**
 * @Author yaCoding
 * @create 2022-06-22 下午 4:56
 */

@Data
public class MsRpcConfig {

    private String nacosHost = "localhost";

    private int nacosPort = 8848;

    private int providerPort = 13567;

    /**
     * 同一个组内 互通，并组成集群
     */
    private String nacosGroup = "ms-rpc-group";

}
