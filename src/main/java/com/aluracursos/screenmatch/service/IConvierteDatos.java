package com.aluracursos.screenmatch.service;

public interface IConvierteDatos {
    //CREAR METODOS DEL TIPO GENERICO QUE RECIBIRA EL STRING JASON
    <T> T obtenerDatos(String json, Class<T> clase);
}

