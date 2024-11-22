package br.com.marlon.screenmatch;

import br.com.marlon.screenmatch.model.DadosEpisodio;
import br.com.marlon.screenmatch.model.DadosSerie;
import br.com.marlon.screenmatch.model.DadosTemporada;
import br.com.marlon.screenmatch.principal.Principal;
import br.com.marlon.screenmatch.service.ConsumoApi;
import br.com.marlon.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}

}

