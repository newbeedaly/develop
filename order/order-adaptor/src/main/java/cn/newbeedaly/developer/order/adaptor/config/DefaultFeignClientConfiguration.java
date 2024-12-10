package cn.newbeedaly.developer.order.adaptor.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * 提取到web模块中
 */
public class DefaultFeignClientConfiguration {

    @Bean
    Logger.Level level() {
        return Logger.Level.FULL;
    }

}
