package main.java.com;

public class Moroso {

    private String nombre;
    private double deuda;
    private int dias;
    
    public Moroso(String nombre, double deuda, int dias) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.dias = dias;
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

    
    
}
