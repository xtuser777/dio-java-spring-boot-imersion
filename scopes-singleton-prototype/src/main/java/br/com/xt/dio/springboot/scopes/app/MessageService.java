package br.com.xt.dio.springboot.scopes.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

    @Autowired
    private Answer noreply;

    @Autowired
    private Answer techTeam;

    public void sendRegisterConfirmation() {
        System.out.println(noreply);
        System.out.println("Cadastro aprovado!");
    }

    public void sendWelcomeMessage() {
        techTeam.setEmail("Tech@dio.me");
        System.out.println(techTeam);
        System.out.println("Bem vindo a TEch");
    }
}
