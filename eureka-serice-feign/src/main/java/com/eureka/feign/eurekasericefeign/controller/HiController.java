package com.eureka.feign.eurekasericefeign.controller;

import com.eureka.feign.eurekasericefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @param:
 * @return: 
 * @auther: YW
 * @date: 2019/1/21 10:04
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        System.out.println("进入feign");
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
