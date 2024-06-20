package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.modelos.DatosSerie;
import com.aluracursos.screenmatch.service.ConsumoAPI;
import com.aluracursos.screenmatch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {
	//CREAR UNA INSTANCIA


	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		//LA LINEA 20 ES JUSTO PRA CONSUMIR LA API OMDB
		var json = consumoAPI.obtenerDatos("https://www.omdbapi.com/?t=smallville&apikey=fc6e58b1");
		//var json = consumoAPI.obtenerDatos("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);
		//System.out.println("Hola mundo en Spring");
		//CREAR INSTANCIA DE CONVERSOR DE DATOS
		ConvierteDatos conversor = new ConvierteDatos();
		var datos = conversor.obtenerDatos(json, DatosSerie.class);
		System.out.println(datos);

	}
}
