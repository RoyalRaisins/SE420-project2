package org.feign.provider.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

    @RequestMapping("/hello")
    public String hello(String name){
//        try {
//            Thread.sleep(60 * 1000);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        return  "hello " + name;
    }
}