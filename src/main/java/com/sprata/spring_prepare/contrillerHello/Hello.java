package com.sprata.spring_prepare.contrillerHello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/api/hello")
    public  String hello(){
        return  "hi";
    }
}
