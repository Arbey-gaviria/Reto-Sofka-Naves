package co.com.sofka.reto.naves.utils;

import co.com.sofka.reto.naves.modelo.CoheteLanzadero;
import co.com.sofka.reto.naves.modelo.NaveTripulada;
import co.com.sofka.reto.naves.modelo.NoTripulados;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    public static List<CoheteLanzadero> cargarDatosCoheteLanzadero(){
        List<CoheteLanzadero> listCoheteLanzadero = new ArrayList<>();
        CoheteLanzadero coheteLanzadero = new CoheteLanzadero("Lucy","2000kg","Quimicos","Satelite","2000cc",true);
        listCoheteLanzadero.add(coheteLanzadero);
        coheteLanzadero = new CoheteLanzadero("Ring","2500kg","Gasolina","nave","2000cc",false);
        listCoheteLanzadero.add(coheteLanzadero);
        coheteLanzadero = new CoheteLanzadero("aser","3500kg","Gasolina","nave","2020cc",true);
        listCoheteLanzadero.add(coheteLanzadero);
        return  listCoheteLanzadero;
    }
    public static List<NoTripulados> cargarDatosNoTripulados() {
        List<NoTripulados> listNoTripulados = new ArrayList<>();

        NoTripulados noTripulados = new NoTripulados("Arbey", "1200kg", "Quimicos", 5);
        listNoTripulados.add(noTripulados);
        noTripulados = new NoTripulados("Juan", "3000kg", "Gasolina", 2000);
        listNoTripulados.add(noTripulados);
        noTripulados = new NoTripulados("Emer", "4000kg", "Gasolina", 3000);
        listNoTripulados.add(noTripulados);
        return  listNoTripulados;
    }
    public static  List<NaveTripulada> cargarDatosNaveTripulada(){
        List<NaveTripulada> listNaveTripulada = new ArrayList<>();

        NaveTripulada naveTripulada = new NaveTripulada("ters","3000kg","Quimicos","6");
        listNaveTripulada.add(naveTripulada);
        naveTripulada = new NaveTripulada("hee","3000kg","Quimicos","4");
        listNaveTripulada.add(naveTripulada);
        naveTripulada = new NaveTripulada("you","24000kg","gasolina","7");
        listNaveTripulada.add(naveTripulada);
        return  listNaveTripulada;
    }
}
