package com.yacoding.rpc.utils;

/**
 * @Author yaCoding
 * @create 2022-06-28 下午 7:35
 */

public class RuntimeUtil {

    public static int cpus() {
        return Runtime.getRuntime().availableProcessors();
    }


}
