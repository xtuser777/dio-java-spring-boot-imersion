package br.com.xt.dio.springdatajpa.app;

import br.com.xt.dio.springdatajpa.repository.UserRepository;
import br.com.xt.dio.springdatajpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Main  implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User(0, "Lucas", "lucas", "1234567");

        repository.save(user);

        for (User u: repository.findAll()) {
            System.out.println(u);
        }
    }
}
