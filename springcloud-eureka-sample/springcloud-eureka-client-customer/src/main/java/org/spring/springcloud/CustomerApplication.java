package org.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Spring Boot Eureka Server 应用启动类
 *
 * Created by bysocket on 21/06/17.
 */

//TODO 但是使用   @EnableEurekaClient     的情景，就是在服务采用eureka作为注册中心的时候
@EnableDiscoveryClient // Eureka Discovery Client 标识    使用其他的注册中心后，都可以使用@EnableDiscoveryClient注解
@SpringBootApplication // Spring Boot 应用标识
public class CustomerApplication {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(CustomerApplication.class,args);

    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
