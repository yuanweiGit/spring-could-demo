package com.eureka.ribbon.eurekaribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRibbonApplication.class, args);
		System.out.println(":::::3333333333333");
	}

	/**
	 *   添加负载均衡支持，很简单，
	 *  只需要在RestTemplate上添加@LoadBalanced注解，
	 *  那么RestTemplate即具有负载均衡的功能,如果不加@LoadBalanced注解的话，
	 *  会报java.net.UnknownHostException:springboot-h2异常，
	 *  此时无法通过注册到Eureka Server上的服务名来调用服务
	 *  ，因为RestTemplate是无法从服务名映射到ip:port的，
	 *  映射的功能是由LoadBalancerClient来实现的。
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
