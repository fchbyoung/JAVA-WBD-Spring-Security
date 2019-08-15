package com.longnguyen.controller;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class UserController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/user")
    public String user(Principal principal) {
        //Get authenticated user name from Principal
        return "user";
    }

    @GetMapping("/admin")
    public String admin() {
        //Get authenticated user name from SecurityContext
        SecurityContext context = SecurityContextHolder.getContext();
        return "admin";
    }

}
