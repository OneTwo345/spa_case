package com.example.casestudy.controller;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/services")
@AllArgsConstructor
public class ServiceController {
    @GetMapping
    public ModelAndView index() {
        ModelAndView view2 = new ModelAndView("service");
//        view.addObject("categories", categoryService.findAll());
//        view.addObject("types", typeService.findAll());
        return view2;
    }
}

