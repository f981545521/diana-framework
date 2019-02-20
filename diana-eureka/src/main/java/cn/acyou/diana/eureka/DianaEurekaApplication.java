package cn.acyou.diana.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DianaEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DianaEurekaApplication.class, args);
    }

}
