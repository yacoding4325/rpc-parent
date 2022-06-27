package com.yacoding.rpc.compress;

import com.yacoding.rpc.constant.CompressTypeEnum;

/**
 * @Author yaCoding
 * @create 2022-06-27 下午 10:15
 */

public class OtherCompress implements Compress{
    @Override
    public String name() {
        return CompressTypeEnum.OTHER.getName();
    }

    @Override
    public byte[] compress(byte[] bytes) {
        return new byte[0];
    }

    @Override
    public byte[] decompress(byte[] bytes) {
        return new byte[0];
    }
}
