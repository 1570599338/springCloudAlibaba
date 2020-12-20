package com.lquan.controller;


import com.lquan.clients.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ProductClient client;


    @GetMapping("/user/getProductList")
    public Map<String,Object> getProduct(){
        Map promap =  client.getProductList();
        promap.put("stateUser","200");
        promap.put("msgUser","这里是商品列表,端口号是"+port);
        System.out.println(promap.get("state")+"--"+promap.get("msg"));

        return  promap;
    }
}
