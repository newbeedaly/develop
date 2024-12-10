package cn.newbeedaly.developer.order.api.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface InitiatePayClient {

    @GetMapping("/pay/{key}")
    String get(@PathVariable("key") String key);

    @PostMapping("/pay")
    Boolean pay();
}
