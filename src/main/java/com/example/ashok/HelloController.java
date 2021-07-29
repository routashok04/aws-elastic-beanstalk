package com.example.ashok;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/hello")
@RestController
public class HelloController {

    public String ShowAws(){
        return "This is AWS Elastic beanStalk2";
    }
}
