package co.com.sofka.reto.naves.controlador;

import co.com.sofka.reto.naves.modelo.NaveTripulada;

public class NaveTripuladaControlador {

    private NaveTripulada naveTripulada;
    public NaveTripuladaControlador(NaveTripulada naveTripulada) {
        this.naveTripulada = naveTripulada;
    }
    public void mantenimiento(String zona) {
        naveTripulada.mantenimiento(zona);
    }
    public void reparacion(String zona) {
        naveTripulada.reparacion(zona);
    }

    public void investigacion(String zona) {
        naveTripulada.investigacion(zona);
    }
    public void despegar() {
        naveTripulada.despegar();
    }


    public void aterrizar() {
        naveTripulada.aterrizar();
    }
}
