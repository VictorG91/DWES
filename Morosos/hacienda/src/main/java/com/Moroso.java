package com;

public class Moroso {

    private int id;
    private String nombre;
    private double deuda;
    private int dias;
    private static int contadorId = 1;
    
    public Moroso(String nombre, double deuda, int dias) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.deuda = deuda;
        this.dias = dias;
    }

    public Moroso(double deuda, int dias) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.dias = dias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getContadorId() {
        return contadorId;
    }

    public void setContadorId(int contadorId) {
        this.contadorId = contadorId;
    }

    
    
}
