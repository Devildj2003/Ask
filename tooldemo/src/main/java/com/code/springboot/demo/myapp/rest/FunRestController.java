package com.code.springboot.demo.myapp.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FunRestController {
    // expose "/" that return "Hello World"
    @RequestMapping("/")
    public String sayHello()
    {
        return "logout.html";
    }
    // expose a new endpoint for workout

    @GetMapping("/workout")
    public String getdailyworkout()
    {
        return "run a hard to the end Hard 5k";
    }
}
