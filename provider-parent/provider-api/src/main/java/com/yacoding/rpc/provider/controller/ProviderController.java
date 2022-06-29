package com.yacoding.rpc.provider.controller;

import com.yacoding.rpc.provider.service.GoodsService;
import com.yacoding.rpc.provider.service.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yaCoding
 * @create 2022-06-29 上午 10:47
 */

@RestController
@RequestMapping("provider")
public class ProviderController {

    @Autowired
    private GoodsService goodsService;

    @Value("${server.port}")
    private int port;

    @GetMapping("/goods/{id}")
    public Goods findGood(@PathVariable Long id) {
        Goods goods = goodsService.findGoods(id);
        goods.setGoodsName(goods.getGoodsName() + ":" + port);
        return goods;
    }
}