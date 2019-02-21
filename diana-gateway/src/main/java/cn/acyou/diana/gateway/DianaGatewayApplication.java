package cn.acyou.diana.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DianaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DianaGatewayApplication.class, args);
    }

}
