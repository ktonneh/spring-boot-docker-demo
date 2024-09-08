package com.thexpertdev.docker_demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("testdocker")
    public String testDocker(){
        return "Hello World from Docker";
    }
}
