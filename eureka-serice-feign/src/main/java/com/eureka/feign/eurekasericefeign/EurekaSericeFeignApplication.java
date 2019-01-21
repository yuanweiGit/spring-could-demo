package com.eureka.feign.eurekasericefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @param:
 * @return:
 * @auther: YW
 * @date: 2019/1/21 10:04
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaSericeFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSericeFeignApplication.class, args);
		System.out.println(":::::11111111111111111111");
	}

}
