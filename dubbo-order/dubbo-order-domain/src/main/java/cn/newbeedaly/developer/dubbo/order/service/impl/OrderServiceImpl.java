package cn.newbeedaly.developer.dubbo.order.service.impl;

import cn.newbeedaly.developer.dubbo.order.dto.req.OrderQueryReqDTO;
import cn.newbeedaly.developer.dubbo.order.service.OrderService;
import cn.newbeedaly.developer.dubbo.pay.dto.res.PayQueryResDTO;
import cn.newbeedaly.developer.dubbo.pay.service.PayService;
import com.alibaba.fastjson.JSON;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    private PayService payService;

    @Override
    public String getOrderPayByOrderId(OrderQueryReqDTO dto) {
        // 根据订单ID查询出支付ID
        String payId = getPayIdByOrderId(dto.getOrderId());
        // 查询支付信息
        PayQueryResDTO pay = payService.getPayById(payId);
        return JSON.toJSONString(pay);
    }

    @Override
    public String getPayIdByOrderId(String orderId) {
        // 用于模拟
        return "PAY-" + orderId;
    }

}
