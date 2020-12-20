package com.lquan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
//@Slf4j
public class ProductController {

    @Value("${server.port}")
    private String port;


    @GetMapping("/product/getProductList")
    public Map<String,Object> getProduct(){
        Map promap =  new HashMap();

        promap.put("state","200");
        promap.put("msg","这里是商品列表,端口号是"+port);

        return  promap;
    }


}
