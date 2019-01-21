package com.eureka.ribbon.eurekaribbon.contorller;

import com.eureka.ribbon.eurekaribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Console;
import java.io.Writer;

/**
 *
 * @param:
 * @return: 
 * @auther: YW
 * @date: 2019/1/21 10:36
 */
@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    @ResponseBody
    public String hi(@RequestParam String name){
        System.out.println("进入："+name);
        return helloService.hiService(name);
    }

}
