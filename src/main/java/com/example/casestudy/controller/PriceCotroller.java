package com.example.casestudy.controller;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/prices")
@AllArgsConstructor
public class PriceCotroller {
    @GetMapping
    public ModelAndView index() {
        ModelAndView view3  = new ModelAndView("price");
//        view.addObject("categories", categoryService.findAll());
//        view.addObject("types", typeService.findAll());
        return view3;
    }
}
