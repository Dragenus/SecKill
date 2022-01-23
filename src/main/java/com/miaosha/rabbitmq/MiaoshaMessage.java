package com.miaosha.rabbitmq;

import com.miaosha.domain.MiaoshaUser;
import lombok.Data;

@Data
public class MiaoshaMessage {
    private MiaoshaUser user;
    private long goodsId;
}
