package br.com.xt.dio.springboot.properties.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageService implements CommandLineRunner {

    @Autowired
    private Answer answer;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + answer.getName()
        + "\nE-mail: " + answer.getEmail()
        + "\nCom telefones para contato: " + answer.getPhones());
        System.out.println("Seu cadastro foi aprovado");
    }
}
