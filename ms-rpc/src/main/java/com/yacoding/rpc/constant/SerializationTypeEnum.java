package com.yacoding.rpc.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author yaCoding
 * @create 2022-06-28 下午 7:14
 */
@AllArgsConstructor
@Getter
public enum SerializationTypeEnum {
    //读取协议这的序列化类型，来此枚举进行匹配
    PROTO_STUFF((byte) 0x01, "protoStuff");

    private final byte code;

    private final String name;

    public static String getName(byte code) {
        for (SerializationTypeEnum c :SerializationTypeEnum.values()) {
            if (c.getCode() == code) {
                return c.name;
            }
        }
        return null;
    }
}