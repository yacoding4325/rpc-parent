package com.yacoding.rpc.consumer.controller;

import com.yacoding.rpc.annontation.MsReference;
import com.yacoding.rpc.consumer.rpc.GoodsHttpRpc;
import com.yacoding.rpc.provider.service.GoodsService;
import com.yacoding.rpc.provider.service.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yaCoding
 * @create 2022-06-22 上午 10:37
 */

@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @MsReference(version = "1.0")
    private GoodsService goodsService;

    @GetMapping("/find/{id}")
    public Goods find(@PathVariable Long id){
        //通过http调用 去访问provider提供的商品查询服务
        return goodsService.findGoods(id);
    }

}
