package com.msb.config;

import com.msb.pojo.Emp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyConfig {
    @Bean
    public Emp getEmp(){
        Emp emp =new Emp();
        emp.setEname("aaa");
        return emp;
    }

}
