package br.com.xt.dio.springboot.scopes.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    @Bean
    @Scope("prototype")
    public Answer answer() {
        System.out.println("New Object");
        Answer answer = new Answer("noreply@dio.me", "DIO");
        return answer;
    }
}
