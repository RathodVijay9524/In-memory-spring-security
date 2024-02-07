package com.vijay.securityjpa.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/product")
public class HomeController {


    @GetMapping("/home")
    public String home(){

        return "Your Home page";
    }

    @GetMapping("/welcome")
    public String welcome(){

        return "Welcomet to spring boot";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String hi(){

        return "You are a admin user";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String user(){

        return "You are a User AS Role";
    }



    @GetMapping("/normal")
    @PreAuthorize("hasAuthority('ROLE_NORMAL')")
    public String hello(){

        return "You are a normal user";
    }
}
