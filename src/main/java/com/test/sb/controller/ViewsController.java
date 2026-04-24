package com.test.sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ViewsController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name","박경훈");
        return "views/index"; 
    }
    @GetMapping("/views/**")
    public void goPage() {
    }
}
