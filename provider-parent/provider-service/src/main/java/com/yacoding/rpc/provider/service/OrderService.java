package com.yacoding.rpc.provider.service;

import com.yacoding.rpc.provider.service.model.Goods;
import com.yacoding.rpc.provider.service.model.Goods;

public interface OrderService {

    /**
     * 根据商品id 查询商品
     * @param id
     * @return
     */
    Goods findGoods(Long id);
}
