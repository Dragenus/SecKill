package com.miaosha.domain;

import lombok.Data;
/*
* 秒杀订单实体类
* */
@Data
public class MiaoshaOrder {
    private Long id;
    private Long userId;
    private Long  orderId;
    private Long goodsId;
}
