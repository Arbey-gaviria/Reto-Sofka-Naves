package co.com.sofka.reto.naves.modelo;

import co.com.sofka.reto.naves.interfaces.INaveTripulada;

public class NaveTripulada extends Nave implements INaveTripulada {
    private String cantidadPersonas;

    public NaveTripulada(String nombre, String peso, String combustible, String cantidadPersonas) {
        super(nombre, peso, combustible);
        this.cantidadPersonas = cantidadPersonas;
    }

    public NaveTripulada() {
    }

    public String getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(String cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public void mantenimiento(String zona) {
        System.out.println("Realizando mantenimiento a la zona: "+zona);
    }

    @Override
    public void reparacion(String zona) {
        System.out.println("Haciendo reparaciones en la zona: "+zona);
    }

    @Override
    public void investigacion(String zona) {
        System.out.println("Realizando investigaciones a la zona: "+zona);
    }

    @Override
    public String toString() {
        return "NaveTripulada{nombre= '" + getNombre() + '\'' +
                ", peso='" + getPeso() + '\'' +
                ", combustible='" + getCombustible() + '\''+
                "cantidadPersonas='" + cantidadPersonas + '\'' +
                '}';
    }
}
