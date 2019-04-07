package com.Retail.Exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignExceptionConfig {

    @Bean
    public CustumErrorDecoder mCustomErrorDecoder(){
        return new CustumErrorDecoder();
    }
}