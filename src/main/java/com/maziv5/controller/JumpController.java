package com.maziv5.controller;
/*
 * @author maziV5
 * @version 1.0
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class JumpController {
    @RequestMapping ("/jump")
    public String jumpTo2(){
        return "pages/test2.html";
    }
}
