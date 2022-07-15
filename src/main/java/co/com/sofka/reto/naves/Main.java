package co.com.sofka.reto.naves;

import co.com.sofka.reto.naves.controlador.NoTripuladosControlador;
import co.com.sofka.reto.naves.modelo.CoheteLanzadero;
import co.com.sofka.reto.naves.modelo.Nave;
import co.com.sofka.reto.naves.modelo.NaveTripulada;
import co.com.sofka.reto.naves.modelo.NoTripulados;
import co.com.sofka.reto.naves.utils.Buscar;
import co.com.sofka.reto.naves.utils.Inventario;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int op;
        int opNave;
        int canNaves;
        int opBusqueda;
        int opcBuscar;
        Scanner teclado = new Scanner(System.in);


        System.out.println("*******Nave Tripulada***********");


        System.out.println("**** Bienvenido al sistema ******");
        List<CoheteLanzadero> listNavesCoheteLanzadero = Inventario.cargarDatosCoheteLanzadero();
        List<NoTripulados> listNavesNoTripuladas = Inventario.cargarDatosNoTripulados();
        List<NaveTripulada> listNavesNaveTripuladas = Inventario.cargarDatosNaveTripulada();


        do {
            System.out.println("\n");
            System.out.println("Menu");
            System.out.println("1.Crear Nave ");
            System.out.println("2.Consultar Nave ");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    do {
                        System.out.println("Tipo Nave");
                        System.out.println("1.Cohete Lanzador ");
                        System.out.println("2.Cohete no Tripulado ");
                        System.out.println("3.Cohete Tripulado ");
                        System.out.println("4.Salir ");
                        opNave = teclado.nextInt();
                        if (opNave < 4) {
                            System.out.println("Cantidad de naves a crear");
                            canNaves = teclado.nextInt();
                            switch (opNave) {
                                case 1:
                                    for (int i = 0; i < canNaves; i++) {
                                        CoheteLanzadero coheteLanzadero = new CoheteLanzadero();
                                        System.out.println("Ingrese el nombre de la nave " + i + 1);
                                        coheteLanzadero.setNombre(teclado.next());

                                        System.out.println("Ingrese el peso");
                                        coheteLanzadero.setPeso(teclado.next());


                                        System.out.println("Tipo de Combustible");
                                        coheteLanzadero.setCombustible(teclado.next());


                                        System.out.println("Tipo de Cargamento");
                                        coheteLanzadero.setTipoCargamento(teclado.next());


                                        System.out.println("Ingrese la potencia de la nave");
                                        coheteLanzadero.setPotencia(teclado.next());

                                        System.out.println("Desea cargar la nave: 1 SI o 2 NO");
                                        if (teclado.next().equals("1")) {
                                            System.out.println("Ingrese el nombre de la carga");
                                            coheteLanzadero.cargar(teclado.next());
                                        }

                                    }
                                    break;
//                                listNavesCoheteLanzadero.add(coheteLanzadero);


                                case 2:
                                    for (int i = 0; i < canNaves; i++) {
                                        NoTripulados noTripulados = new NoTripulados();
                                        System.out.println("Ingrese el nombre de la nave: " + (i + 1));
                                        noTripulados.setNombre(teclado.next());

                                        System.out.println("Ingrese el peso:");
                                        noTripulados.setPeso(teclado.next());


                                        System.out.println("Tipo de Combustible:");
                                        noTripulados.setCombustible(teclado.next());

                                        System.out.println("Ingrese la velocidad:");
                                        noTripulados.setVelocidad(teclado.nextInt());
                                        listNavesNoTripuladas.add(noTripulados);

                                    }
                                    break;

                                case 3:
                                    for (int i = 0; i < canNaves; i++) {
                                        NaveTripulada naveTripulada = new NaveTripulada();
                                        System.out.println("Ingrese el nombre de la nave: " + (i + 1));
                                        naveTripulada.setNombre(teclado.next());

                                        System.out.println("Ingrese el peso:");
                                        naveTripulada.setPeso(teclado.next());


                                        System.out.println("Tipo de Combustible:");
                                        naveTripulada.setCombustible(teclado.next());

                                        System.out.println(" Cantidad de personas para cargar abordo:");
                                        naveTripulada.setCantidadPersonas(teclado.next());
                                        listNavesNaveTripuladas.add(naveTripulada);

                                    }
                                    break;
                                default:
                            }
                        }

                    } while (opNave < 4);
                 break;
                case 2:
                    do {
                        System.out.println("Busqueda Naves");
                        System.out.println("1. Buscar todas las naves");
                        System.out.println("2. Buscar Todas las naves tripuladas");
                        System.out.println("3. Buscar Todas las naves Cohete Lanzadero");
                        System.out.println("4. Buscar Todas las naves no tripuladas");
                        System.out.println("5. Volver");

                        opBusqueda = teclado.nextInt();

                        switch (opBusqueda) {
                            case 1:
                                if (!Buscar.buscar(listNavesCoheteLanzadero)) {
                                    System.out.println("No hay disponible cohetes lanzaderos");
                                }
                                if (!Buscar.buscar(listNavesNoTripuladas)) {
                                    System.out.println("No hay disponible nave no tripulada");
                                }
                                if (!Buscar.buscar(listNavesNaveTripuladas)) {
                                    System.out.println("No hay disponible naves tripuladas");
                                }
                                break;
                            case 2:
                                if (!Buscar.buscar(listNavesNaveTripuladas)) {
                                    System.out.println("No hay disponible naves tripuladas");
                                }
                                break;

                            case 3:
                                if (!Buscar.buscar(listNavesCoheteLanzadero)) {
                                    System.out.println("No hay disponible cohetes lanzaderos");
                                }
                                break;

                            case 4:
                                if (!Buscar.buscar(listNavesNoTripuladas)) {
                                    System.out.println("No hay disponible nave no tripulada");
                                }
                                break;
                            default:
                        }


                    break;
                    }while (op < 5);
            }

        }  while (op < 3) ;

    }
}




//    public static void buscarPorNombreCoheteLanzadero(List<CoheteLanzadero> list, String nombre){
//        if (list.isEmpty()){
//            System.out.println("No hay disponible cohetes lanzaderos");
//        }else{
//            for (int i=0; list.isEmpty();i++){
//                if(list.get(i).getNombre()==nombre) {
//                    System.out.println(list.get(0)+"\n");
//                }
//            }
//        }
//    }
//    public static void buscarPorNombreNoTripuladas(List<NoTripulados> list, String nombre){
//        if (list.isEmpty()){
//            System.out.println("No hay disponible cohetes lanzaderos");
//        }else{
//            for (int i=0; list.isEmpty();i++){
//                if(list.get(i).getNombre()==nombre) {
//                    System.out.println(list.get(0)+"\n");
//                }
//            }
//        }
//    }




