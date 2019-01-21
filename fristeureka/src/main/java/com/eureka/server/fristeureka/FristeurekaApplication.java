package com.eureka.server.fristeureka;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * 功能描述:注册中心
 *
 * @param:
 * @return: 
 * @auther: YW
 * @date: 2019/1/21 10:05
 */
@SpringBootApplication
@EnableEurekaServer ////@EnableEurekaServer注解启动一个服务注册中心提供给其他应用进行对话
public class FristeurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FristeurekaApplication.class, args);
		System.out.println("注册中心:::111111");
	}

}
