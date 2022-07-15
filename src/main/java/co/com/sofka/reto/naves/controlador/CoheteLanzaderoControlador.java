package co.com.sofka.reto.naves.controlador;

import co.com.sofka.reto.naves.implementar.CoheteLanzaderoImp;
import co.com.sofka.reto.naves.modelo.CoheteLanzadero;

public class CoheteLanzaderoControlador {
    private CoheteLanzaderoImp coheteLanzaderoImp;
    private CoheteLanzadero coheteLanzadero;

    public CoheteLanzaderoControlador(CoheteLanzaderoImp coheteLanzaderoImp, CoheteLanzadero coheteLanzadero) {
        this.coheteLanzaderoImp = coheteLanzaderoImp;
        this.coheteLanzadero = coheteLanzadero;
    }

}
