package com.plm.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        // 封装对象，放入ModelAndView
        modelAndView.addObject("msg","hello springmvc test !");
        // 封装要跳转的视图，放入ModelAndView
        // 此时跳转视图自动拼接为：/WEB-INF/jsp/hello.jsp
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
