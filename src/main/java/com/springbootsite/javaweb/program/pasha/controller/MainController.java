package com.springbootsite.javaweb.program.pasha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController{

//    @RequestMapping(value="/")
//    public String showStartPage()
//    {
//          return "index";
//    }

    @RequestMapping(value="/about")
    public String showStartPage1()
    {
        return "index";
    }

    @RequestMapping(value="/blog")
    public String showStartPage2()
    {
        return "blog";
    }

    @RequestMapping(value="/blog_post")
    public String showStartPage3()
    {
        return "blog_post";
    }

    @RequestMapping(value="/contact")
    public String showStartPage4()
    {
        return "contact";
    }

    @RequestMapping(value="/portfolio")
    public String showStartPage5()
    {
        return "portfolio";
    }


}
