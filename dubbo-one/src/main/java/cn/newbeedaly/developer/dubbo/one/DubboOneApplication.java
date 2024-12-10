package cn.newbeedaly.developer.dubbo.one;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo(scanBasePackages = "cn.newbeedaly")
@SpringBootApplication(scanBasePackages = "cn.newbeedaly")
public class DubboOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboOneApplication.class, args);
    }

}
