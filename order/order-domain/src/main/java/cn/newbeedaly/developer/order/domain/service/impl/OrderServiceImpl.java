package cn.newbeedaly.developer.order.domain.service.impl;

import cn.newbeedaly.developer.order.adaptor.pay.PayFeignClient;
import cn.newbeedaly.developer.order.adaptor.pay.vo.res.PaymentResVO;
import cn.newbeedaly.developer.order.api.client.dto.req.OrderQueryReqDTO;
import cn.newbeedaly.developer.order.domain.service.OrderService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private PayFeignClient payFeignClient;

    @Override
    public String getOrderPayByOrderId(OrderQueryReqDTO dto) {
        // 根据订单ID查询出支付ID
        String payId = getPayIdByOrderId(dto.getOrderId());
        // 查询支付信息
        PaymentResVO pay = payFeignClient.getPaymentById(payId);
        return JSON.toJSONString(pay);
    }

    @Override
    public String getPayIdByOrderId(String orderId) {
        // 用于模拟
        return "PAY-" + orderId;
    }
}
