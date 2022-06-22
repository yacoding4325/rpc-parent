package com.yacoding.rpc.consumer.rpc;

import com.yacoding.rpc.annontation.MsHttpClient;
import com.yacoding.rpc.annontation.MsMapping;
import com.yacoding.rpc.consumer.controller.Goods;

/**
 * @Author yaCoding
 * @create 2022-06-22 上午 10:38
 */

@MsHttpClient(value = "goodsHttpRpc")
public interface GoodsHttpRpc {
    //发起网络调用 调用provider 商品查询服务
    @MsMapping(url = "http://localhost:7777",api = "/provider/goods/{id}")
    Goods findGoods(Long id);
}
