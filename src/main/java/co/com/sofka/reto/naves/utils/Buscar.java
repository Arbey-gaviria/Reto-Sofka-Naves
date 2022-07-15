package co.com.sofka.reto.naves.utils;

import co.com.sofka.reto.naves.modelo.CoheteLanzadero;
import co.com.sofka.reto.naves.modelo.NaveTripulada;
import co.com.sofka.reto.naves.modelo.NoTripulados;

import java.util.List;

public class Buscar {
    public static boolean buscar(List list){
        if(list.isEmpty()){
            return false;
        }else{
            for(int i = 0; i<list.size(); i++){
                System.out.println(list.get(i)+"\n");
            }
            return true;
        }
    }
    public static void buscarPorNombre(List<CoheteLanzadero>coheteLanzaderos,String name){

    };



}
