package com.yacoding.rpc.compress;

import com.yacoding.rpc.constant.CompressTypeEnum;
import com.yacoding.rpc.exception.MsRpcException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

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
        //压缩
        if (bytes == null) {
            throw new NullPointerException("传入的压缩数据为null。。。");
        }
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gzip = new GZIPOutputStream(os);

            gzip = new GZIPOutputStream(os);
            gzip.write(bytes);
            gzip.flush();
            gzip.finish();
            return os.toByteArray();
        } catch (IOException e) {
            throw new MsRpcException("压缩数据出错", e);
        }
    }

    @Override
    public byte[] decompress(byte[] bytes) {
        if (bytes == null) {
            throw new NullPointerException("传入的解压数据为null");
        }
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            GZIPInputStream gzipInputStream = new GZIPInputStream(new ByteArrayInputStream(bytes));
            byte[] buffer =  new byte[1024 * 4];
            int n;
            while ((n = gzipInputStream.read(buffer)) > -1){
                os.write(buffer,0,n);
            }
            return os.toByteArray();
        } catch (IOException e) {
            throw new MsRpcException("解压缩数据出错", e);
        }

    }
}