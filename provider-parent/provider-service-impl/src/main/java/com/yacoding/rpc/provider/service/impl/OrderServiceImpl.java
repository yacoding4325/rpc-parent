package com.yacoding.rpc.provider.service.impl;

import com.yacoding.rpc.provider.service.OrderService;
import com.yacoding.rpc.provider.service.model.Goods;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author yaCoding
 * @create 2022-06-29 上午 10:53
 */

@Service
//把GoodsService这个服务 发布，消费方 就可以进行调用了
public class OrderServiceImpl implements OrderService {
    @Override
    public Goods findGoods(Long id) {
        return new Goods(id,"服务提供方订单商品", BigDecimal.valueOf(99));
    }
}