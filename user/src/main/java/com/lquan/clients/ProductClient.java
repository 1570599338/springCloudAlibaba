package com.lquan.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient("product666") // 是product的服务的服务名/服务id ，把想要调用的服务的服务接口可以直接复制过来，feign会自动的把接口注册到工厂中,通过@Autowride调用
public interface ProductClient {

    @GetMapping("/product/getProductList")
    Map<String,Object> getProductList();

}
