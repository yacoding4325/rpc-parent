package com.yacoding.rpc.provider.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author yaCoding
 * @create 2022-06-22 上午 10:58
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {

    //商品id
    private Long id;
    //商品名称
    private String goodsName;
    //商品价格
    private BigDecimal price;
}
