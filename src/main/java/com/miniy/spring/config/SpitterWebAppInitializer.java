package com.miniy.spring.config;

import com.miniy.spring.filter.MyFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * Created by Administrator on 2017/6/17.
 * 注册 DispatcherServlet
 *  基于 AbstractAnnotationConfigDispatcherServletInitalizer 创建DispatcherServlet和ContextLoaderListener
 *
 */
public class SpitterWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    /**
     * 引入 Spring 配置
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ RootConfig.class};
    }

    /**
     * 引入Spring mvc 配置
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{ WebConfig.class };
    }

    /**
     * 配置 DispatcherServlet 映射到 请求"/"
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * 设置过滤器 映射到 DispatcherServlet
     * @return
     */
    @Override
    protected Filter[] getServletFilters() {
        return new Filter[]{ new MyFilter()};
    }

}
