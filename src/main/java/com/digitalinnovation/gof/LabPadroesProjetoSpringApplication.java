package com.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Projeto Spring Boot gerado via Spring Initializr
 * Os seguintes módulos foram selecionados
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - Open Feign
 *
 * @author: Júnior Moura
 */

@EnableFeignClients
@SpringBootApplication
@ComponentScan({"com.digitalinovation.gof.service"})
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
