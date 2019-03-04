package com.zyy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @create 2019/2/26
 * @since 1.0.0
 */
@SpringBootApplication
@RestController
@RefreshScope
@EnableEurekaClient
@EnableDiscoveryClient
public class Application {

    /**
     * http://localhost:8881/actuator/bus-refresh
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
