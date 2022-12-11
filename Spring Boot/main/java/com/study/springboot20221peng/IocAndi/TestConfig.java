package com.study.springboot20221peng.IocAndi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //객체 설정
public class TestConfig {

    @Bean
    public Test1 t1() {
        return new Test1(); //빈에 등록됨
    }

    @Bean
    public Test2 t2() {
        return new Test2();
    }
}
