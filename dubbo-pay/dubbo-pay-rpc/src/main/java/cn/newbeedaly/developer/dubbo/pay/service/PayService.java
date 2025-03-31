package cn.newbeedaly.developer.dubbo.pay.service;

import cn.newbeedaly.developer.dubbo.pay.dto.res.PayQueryResDTO;

public interface PayService {

    PayQueryResDTO getPayById(String payId);

}
