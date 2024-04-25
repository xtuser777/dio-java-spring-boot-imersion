package br.com.xt.dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class App implements CommandLineRunner {

    @Autowired
    private Calculator calc;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é " + calc.sum(1.0, 2.0));
    }
}
