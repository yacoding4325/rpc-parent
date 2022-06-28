package com.yacoding.rpc.constant;

/**
 * @Author yaCoding
 * @create 2022-06-28 下午 7:11
 */

public class MsRpcConstants {

    public static final int TOTAL_LENGTH = 16;

    public static final byte[] MAGIC_NUMBER = {(byte)'m',(byte)'s',(byte)'n',(byte)'b'};

    public static final byte VERSION = 1;

    public static final int HEAD_LENGTH = 16;

    public static final String HEART_PING = "ping";

    public static final String HEART_PONG = "pong";

}