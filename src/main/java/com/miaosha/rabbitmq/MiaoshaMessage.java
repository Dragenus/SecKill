package com.miaosha.rabbitmq;

import com.miaosha.domain.MiaoshaUser;
import lombok.Data;
/*
* 发送的秒杀信息
* */
@Data
public class MiaoshaMessage {
    private MiaoshaUser user;
    private long goodsId;
}
