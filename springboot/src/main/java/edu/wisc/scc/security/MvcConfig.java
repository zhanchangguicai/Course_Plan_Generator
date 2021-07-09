package edu.wisc.scc.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * mvc 配置
 */
@Slf4j
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("登录拦截器");
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/studentInterestInfo/**")
                .addPathPatterns("/studentChooseCourseRecord/**")
                .addPathPatterns("/studentUser/**")
                .addPathPatterns("/courseInfo/**")
                .addPathPatterns("/user/**")
                .excludePathPatterns(
                        "/user/codeImg",
                        "/user/regist",
                        "/user/login",
                        "/user/logout",
                        "/user/refreshToken");
    }


}
