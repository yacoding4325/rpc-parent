package com.yacoding.rpc.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author yaCoding
 * @create 2022-06-28 下午 7:07
 */
@AllArgsConstructor
@Getter
public enum MessageTypeEnum {

    REQUEST((byte) 0x01, "request"),
    RESPONSE((byte) 0x02, "response"),
    HEARTBEAT_PING((byte) 0x03, "heart ping"),
    HEARTBEAT_PONG((byte) 0x04, "heart pong");


    private final byte code;
    private final String name;

    public static String getName(byte code) {
        for (MessageTypeEnum c : MessageTypeEnum.values()) {
            if (c.getCode() == code) {
                return c.name;
            }
        }
        return null;
    }
}
