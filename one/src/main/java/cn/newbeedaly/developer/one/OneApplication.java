package cn.newbeedaly.developer.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@EnableFeignClients(basePackages = "cn.newbeedaly")
@ComponentScan(basePackages = "cn.newbeedaly")
@SpringBootApplication
public class OneApplication {

    // 参考 https://blog.csdn.net/weixin_43641119/article/details/111658469
    public static void main(String[] args) {
        SpringApplication.run(OneApplication.class, args);
    }

}
