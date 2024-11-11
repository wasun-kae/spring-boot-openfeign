package kpd.wasun.sbt.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootOpenFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOpenFeignApplication.class, args);
    }
}
