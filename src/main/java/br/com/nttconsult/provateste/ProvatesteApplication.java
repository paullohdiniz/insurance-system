package br.com.nttconsult.provateste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.nttconsult.provateste.domain.repository")
public class ProvatesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvatesteApplication.class, args);
	}

}
