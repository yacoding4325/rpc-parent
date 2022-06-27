package com.yacoding.rpc.exception;

/**
 * @Author yaCoding
 * @create 2022-06-27 下午 10:24
 */

public class MsRpcException extends RuntimeException{

    public MsRpcException(String msg) {
        super(msg);
    }

    public MsRpcException(String msg, Exception e) {
        super(msg, e);
    }

}