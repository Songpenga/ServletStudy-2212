package com.study.springboot20221peng.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {

    //@RequestMapping(value="/page1, method - RequestMethod.GET")

    @GetMapping("/page1")
    public ModelAndView page1(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("page1");
        mav.addObject("key", "value");
        return mav;
    }
    /*
    public String page1(){
        return "page1";
//        controller class
    }
*/
    @GetMapping("/page2")
    public String page2(){
        return "page1";

    }
}
