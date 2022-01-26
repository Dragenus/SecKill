package com.miaosha.vo;

import com.miaosha.domain.Goods;
import lombok.Data;

import java.util.Date;
/*
* 秒杀商品信息和商品信息整合
* */
@Data
public class GoodsVo extends Goods {
    private Double miaoshaPrice;
    private Integer stockCount;
    private Date startDate;
    private Date endDate;
}
