package com.yacoding.rpc.provider.service.impl;

import com.yacoding.rpc.annontation.MsService;
import com.yacoding.rpc.provider.service.GoodsService;
import com.yacoding.rpc.provider.service.model.Goods;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author yaCoding
 * @create 2022-06-29 上午 10:53
 */

@Service
//把GoodsService这个服务 发布，消费方 就可以进行调用了
@MsService(version = "1.0")
public class GoodsServiceImpl implements GoodsService {
    @Value("${server.port}")
    private int port;
    @Override
    public Goods findGoods(Long id) {
        return new Goods(id,"服务提供方商品：" + port, BigDecimal.valueOf(100));
    }
}