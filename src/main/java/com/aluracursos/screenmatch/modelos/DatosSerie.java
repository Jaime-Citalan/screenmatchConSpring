//CLASE PARA MAPEAR DATOS DE LA SERIE o para deserealizar datos
package com.aluracursos.screenmatch.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)//ANOTACION PARA IGNORAR TODOS LOS ATRIBUTOS QUE NO NECESITAMOS DE LA API
public record DatosSerie(
        //AGREAGR ANOTACIÓN SE COLOCA EL ARROBA "@JsonAlias" ó "@JsonProperty" PARA MAPEAR LOS ATRIBUTOS DE LA API
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons") Integer totalDeTemporadas,
        @JsonAlias("imdbRating") String evaluacion) {

}
