package com.mailshine.spring.hystrix.logging;


import com.mailshine.spring.hystrix.controller.EmployeeController;
import org.slf4j.MDC;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component

public class RequestFilterMDC extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        MDC.clear();
        MDC.put("customMDCTradeId", "customMDCTradeId");
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }

}
