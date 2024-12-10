package cn.newbeedaly.developer.pay.domain.controller;

import cn.newbeedaly.developer.pay.api.client.PayClient;
import cn.newbeedaly.developer.pay.api.vo.req.PaymentReqVO;
import cn.newbeedaly.developer.pay.api.vo.res.PaymentResVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController extends PayBaseController implements PayClient {

    Logger logger = LoggerFactory.getLogger(PayController.class);

    @Override
    public PaymentResVO getPaymentById(String key) {
        logger.info("支付中心：查询支付信息, 支付id {}", key);
        PaymentResVO vo = new PaymentResVO();
        vo.setId(key);
        vo.setMerchantId("M-001");
        vo.setOrderId("O-001");
        vo.setPayStatus("SUCCESS");
        vo.setPayAmount(1);
        return vo;
    }

    @Override
    public Boolean pay(PaymentReqVO pay) {
        logger.info("支付中心：发起支付, 商户:{}, 订单号: {}, 订单支付中", pay.getMerchantId(), pay.getOrderId());
        return Boolean.TRUE;
    }
}
