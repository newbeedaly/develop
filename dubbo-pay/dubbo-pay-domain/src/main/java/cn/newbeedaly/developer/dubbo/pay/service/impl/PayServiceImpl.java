package cn.newbeedaly.developer.dubbo.pay.service.impl;

import cn.newbeedaly.developer.dubbo.pay.dto.res.PayQueryResDTO;
import cn.newbeedaly.developer.dubbo.pay.service.PayService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class PayServiceImpl implements PayService {

    @Override
    public PayQueryResDTO getPayById(String payId) {
        return PayQueryResDTO.builder().payId(payId).orderId("O-001").payStatus("SUCCESS").build();
    }

}
