package com.miaosha.vo;

import com.miaosha.domain.MiaoshaUser;
import lombok.Data;
/*
* 商品详情
* */
@Data
public class GoodsDetailVo {
    private int miaoshaStatus = 0;
    private int remainSeconds = 0;
    private GoodsVo goods ;
    private MiaoshaUser user;
}
