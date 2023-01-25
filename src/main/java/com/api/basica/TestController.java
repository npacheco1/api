package com.api.basica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
    @GetMapping("/hello")
    public String hello(){
    return "Hello Spring";
    }

    @GetMapping("/bye")
    public String bye(){
        return "bye Spring";
    }
}
