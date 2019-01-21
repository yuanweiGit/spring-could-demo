package com.eureka.ribbon.eurekaribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @param: 
 * @return: 
 * @auther: YW
 * @date: 2019/1/21 10:36
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        System.out.println("进入service:"+name);
        String forObject = restTemplate.getForObject("http://EUREKA-CLIENT-TOW/hi?name=" + name, String.class);
        System.out.println(forObject);
        return forObject;
    }

}