package cn.newbeedaly.developer.dubbo.pay.service;

import cn.newbeedaly.developer.dubbo.pay.dto.req.PayReqDTO;
import cn.newbeedaly.developer.dubbo.pay.dto.res.PayQueryResDTO;

public interface PayService {

    Boolean pay(PayReqDTO pay);

    PayQueryResDTO getPayById(String payId);

}
