package cn.newbeedaly.developer.dubbo.pay;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo(scanBasePackages = "cn.newbeedaly")
@SpringBootApplication(scanBasePackages = "cn.newbeedaly")
public class DubboPayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboPayApplication.class, args);
    }
}
