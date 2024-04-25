package br.com.xt.dio.springboot.beans;

import br.com.xt.dio.springboot.beans.app.Conversor;
import br.com.xt.dio.springboot.beans.app.Response;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IocDiBeansAutowiredApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocDiBeansAutowiredApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(Conversor conversor) throws Exception {
		return args -> {
			Response response = new Response("Hello, world!");
			System.out.println(conversor.toJson(response));
		};
	}
}
