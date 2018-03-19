package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhouhaishui on 2017/5/2.
 */
@Controller
public class pageController {

    /**
     * 首页
     * @return
     */
    @RequestMapping("/")
    public ModelAndView page(){
        return new ModelAndView("system/index");
    }


    /**
     * 跳转
     * @return
     */
    @RequestMapping("/redirect")
    public ModelAndView page2(){
        return new ModelAndView("redirect/redirect");
    }


    /**
     *视图
     * @param model
     * @return
     */
    @RequestMapping("/model")
    public ModelAndView page3(Model model){
        model.addAttribute("name","seawater");
        return new ModelAndView("hello");
    }
}
