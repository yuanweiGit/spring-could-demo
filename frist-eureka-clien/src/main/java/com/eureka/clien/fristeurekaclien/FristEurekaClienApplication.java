package com.eureka.clien.fristeurekaclien;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 功能描述: 服务消费
 *
 * @param: 
 * @return: 
 * @auther: YW
 * @date: 2019/1/21 10:09
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class FristEurekaClienApplication {

	public static void main(String[] args) {
		SpringApplication.run(FristEurekaClienApplication.class, args);
		System.out.println("服务消费");
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/actuator/info")
	public String home(@RequestParam String name) {
		System.out.println("进入");
		return "hi "+name+",i am from port:" +port;
	}

}
