package com.wisrc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {


    @RequestMapping(value = {
            "/",
            "/web/ui/welcome/**",
            "/web/ui/admin/**"
    })
    public String index(){
        return "index";
    }
}
