package com.example.gestionpistas;

// Clase que representa una pista de pádel
public class Pista {
    private String nombrePista;
    private String horasDisponibles;

    public Pista(String nombrePista, String horasDisponibles) {
        this.nombrePista = nombrePista;
        this.horasDisponibles = horasDisponibles;
    }

    // Getters
    public String getNombrePista() {
        return nombrePista;
    }

    public String getHorasDisponibles() {
        return horasDisponibles;
}
}
