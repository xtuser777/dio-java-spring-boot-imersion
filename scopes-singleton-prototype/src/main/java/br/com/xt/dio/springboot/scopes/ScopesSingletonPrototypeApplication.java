package br.com.xt.dio.springboot.scopes;

import br.com.xt.dio.springboot.scopes.app.MessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ScopesSingletonPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScopesSingletonPrototypeApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(MessageService service) throws Exception {
		return args -> {
			service.sendRegisterConfirmation();
			service.sendWelcomeMessage();
		};
	}

}
