package com.miniy.spring.config;

import com.miniy.spring.listener.MyListener;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by Administrator on 2017/6/18.
 * 通过Spirng 的 WebApplicationInitializer 注册 监听器
 */
public class MyListenerInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.addListener(MyListener.class);
        System.out.println("启动");
    }
}
