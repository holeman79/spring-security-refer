package com.example.demospringsecurityoauth2session.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public void hello(HttpSession httpSession){
        httpSession.setAttribute("name", "jowonjin");
    }
}
