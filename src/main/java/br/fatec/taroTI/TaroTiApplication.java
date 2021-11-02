package br.fatec.taroTI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("br.fatec.taroTI.repositorios")
public class TaroTiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaroTiApplication.class, args);
	}

}
