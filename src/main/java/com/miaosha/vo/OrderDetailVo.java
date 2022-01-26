package com.miaosha.vo;

import com.miaosha.domain.OrderInfo;
import lombok.Data;
/*
* 合成商品信息、订单信息
* */
@Data
public class OrderDetailVo {
    private GoodsVo goods;
    private OrderInfo order;
}
