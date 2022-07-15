package co.com.sofka.reto.naves.modelo;

import co.com.sofka.reto.naves.interfaces.INave;

public class Nave implements INave {
    private String nombre;
    private String peso;
    private String combustible;


    public Nave(String nombre, String peso, String combustible) {
        this.nombre = nombre;
        this.peso = peso;
        this.combustible = combustible;

    }

    public Nave() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }


    @Override
    public void despegar() {
        System.out.println("La nave despego");
    }

    @Override
    public void aterrizar() {
        System.out.println("La nave aterrizo");
    }

    @Override
    public String toString() {
        return "Nave{" +
                "nombre='" + nombre + '\'' +
                ", peso='" + peso + '\'' +
                ", combustible='" + combustible + '\'' +
                '}';
    }
}

