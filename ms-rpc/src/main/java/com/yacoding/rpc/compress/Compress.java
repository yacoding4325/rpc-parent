package com.yacoding.rpc.compress;

/**
 * @Author yaCoding
 * @create 2022-06-27 下午 10:14
 */

public interface Compress  {

    /**
     * 压缩方法名称
     * @return
     */
    String name();

    /**
     * 压缩
     * @param bytes
     * @return
     */
    byte[] compress(byte[] bytes);

    /**
     * 解压缩
     * @param bytes
     * @return
     */
    byte[] decompress(byte[] bytes);

}
