package co.com.sofka.reto.naves.controlador;

import co.com.sofka.reto.naves.implementar.NoTripuladosImp;
import co.com.sofka.reto.naves.interfaces.INoTripulados;
import co.com.sofka.reto.naves.modelo.NoTripulados;

public class NoTripuladosControlador {

    private NoTripulados noTripulados;

    public NoTripuladosControlador(NoTripulados noTripulados) {
        this.noTripulados = noTripulados;
    }

        public void abastecer(String zona) {
            noTripulados.abastecer(zona);
        }

        public void limpiar(String zona) {
            noTripulados.limpiar(zona);

        }

        public void regular(String zona) {
            noTripulados.regular(zona);

        }

        public void investigar(String cuerpoCeleste) {
            noTripulados.investigar(cuerpoCeleste);

        }

    public void despegar() {
        noTripulados.despegar();
    }


    public void aterrizar() {
        noTripulados.aterrizar();
    }

    }


