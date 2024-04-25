package br.com.xt.dio.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public Double sum(Double a, Double b) {
        return a + b;
    }
}
