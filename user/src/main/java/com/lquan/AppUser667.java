package com.lquan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients
public class AppUser667 {
    public static void main( String[] args ){
        SpringApplication.run(AppUser667.class,args);
    }
}
