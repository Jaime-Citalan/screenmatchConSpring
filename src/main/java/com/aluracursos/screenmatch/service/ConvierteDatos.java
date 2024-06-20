package com.aluracursos.screenmatch.service;

import com.aluracursos.screenmatch.modelos.DatosSerie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos{
    //CREAR UNA INSTANCIA DE UN OBJECTMAPPER, SERVIRA PARA MAPEAR LOS VALORES QUE VIENEN DE LA API
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json,clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    //CREAMOS interfazpara los datos de la pelicula en el nuevo paquete SERVICE
}
