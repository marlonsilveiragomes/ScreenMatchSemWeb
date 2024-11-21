package br.com.marlon.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie (@JsonAlias("Title") String titulo,
                          @JsonAlias("totlaSeasons") Integer totalTemporadas,
                          @JsonAlias("imdbRating") String avaliacao) {
}

