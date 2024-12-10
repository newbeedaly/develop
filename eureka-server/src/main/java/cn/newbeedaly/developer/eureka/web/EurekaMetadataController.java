package cn.newbeedaly.developer.eureka.web;

import com.alibaba.fastjson.JSON;
import com.netflix.eureka.EurekaServerContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class EurekaMetadataController {

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 查询服务的信息（元数据和自定义的元数据）
     *
     * 自定义元数据，客户端yml配置
     *  eureka:
     *      instance:
     *          metadata-map:
     *              mydata: newbeedaly
     */
    @GetMapping("/metadata")
    public String metadata(){
        EurekaServerContextHolder.getInstance().getServerContext()
                .getRegistry().getSortedApplications();
        return JSON.toJSONString(
                EurekaServerContextHolder.getInstance()
                        .getServerContext()
                        .getApplicationInfoManager()
                        .getEurekaInstanceConfig()
                        .getMetadataMap()
        );
    }

}
