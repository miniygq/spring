package com.miniy.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/6/17.
 */
@Controller
@RequestMapping
public class HomeController {

    @RequestMapping(value = "/home",method= RequestMethod.GET)
    public String home(){
        return "home";
    }
}
