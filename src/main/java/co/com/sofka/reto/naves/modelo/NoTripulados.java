package co.com.sofka.reto.naves.modelo;

import co.com.sofka.reto.naves.interfaces.INoTripulados;

public class NoTripulados extends Nave implements INoTripulados {
    private int velocidad;
    private boolean estado;

    public NoTripulados(String nombre, String peso,
                        String combustible, int velocidad) {
        super(nombre, peso, combustible);
        this.velocidad = velocidad;

    }

    public NoTripulados() {
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    @Override
    public void abastecer(String zona) {
        System.out.println("Abastecio la zona "+zona);
    }

    @Override
    public void limpiar(String zona) {
        System.out.println("Limpio la zona "+zona);

    }

    @Override
    public void regular(String zona) {
        System.out.println("Regulo la zona "+zona);

    }

    @Override
    public void investigar(String cuerpoCeleste) {
        System.out.println("Investigo el celeste: "+cuerpoCeleste);
    }

    @Override
    public String toString() {
        return "NoTripulados{ nombre= '" + getNombre() + '\'' +
                ", peso='" + getPeso() + '\'' +
                ", combustible='" + getCombustible() + '\''+
                "velocidad=" + velocidad +
                ", estado=" + estado +
                '}';
    }
}
