package com.mailshine.spring.hystrix.logging;

import org.slf4j.MDC;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;


@Component
public class RequestFilterMDC extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        MDC.clear();
        double price = 90000;
        String model = null;
        if (price > 100000) {
            model = "Tesla Model X";
        } else if (price <= 100000) {
            model = "Tesla Model S";
        }
        System.out.println(model);
        MDC.put("customMDCTradeId", UUID.randomUUID().toString());
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }

}
