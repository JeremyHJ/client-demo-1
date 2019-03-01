package com.jeremy.client_demo_1;/**
 Created by 胡杰 on 2019/2/28. */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * FileName: com.jeremy.client_damo.EurekaClientApplication.java
 * Author: Jeremy_Hu
 * Date: 2019/2/28 上午12:02
 */

@EnableAutoConfiguration
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {
    public static void main(String args[]){
        SpringApplication.run(EurekaClientApplication.class,args);
    }
}
