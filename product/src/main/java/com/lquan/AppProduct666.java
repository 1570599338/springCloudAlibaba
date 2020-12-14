package com.lquan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient // 开启服务注册与发现，可写可不写
@EnableFeignClients
public class AppProduct666 {
    public static void main( String[] args ){
        SpringApplication.run(AppProduct666.class,args);
    }
}
