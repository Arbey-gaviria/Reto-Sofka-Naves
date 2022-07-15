package co.com.sofka.reto.naves.modelo;

import co.com.sofka.reto.naves.interfaces.ICoheteLanzadero;

public class CoheteLanzadero extends Nave implements ICoheteLanzadero {
    private String tipoCargamento;
    private String potencia;
    private boolean cargado;

    public CoheteLanzadero(String nombre, String peso, String combustible, String tipoCargamento, String potencia, boolean cargado) {
        super(nombre, peso, combustible);
        this.tipoCargamento = tipoCargamento;
        this.potencia = potencia;
        this.cargado = cargado;
    }

    public CoheteLanzadero() {
    }

    public String getTipoCargamento() {
        return tipoCargamento;
    }

    public void setTipoCargamento(String tipoCargamento) {
        this.tipoCargamento = tipoCargamento;
    }

    public String getPotencia() {

        return potencia;
    }

    public void setPotencia(String potencia) {

        this.potencia = potencia;
    }

    public boolean isCargado() {
        return cargado;
    }

    public void setCargado(boolean cargado) {
        this.cargado = cargado;
    }

    @Override
    public void cargar(String cargamento) {
        if(cargado){
            System.out.println("El cohete No se puede cargar, Esta lleno!");
        }else {
            cargado = true;
            System.out.println("Cohete cargado correctamente");
        }
    }

    @Override
    public void descargar() {
    if(cargado){
        cargado= false;
        System.out.println("El cohete se descargo correctamente");
    }else {
        System.out.println("No se puede descargar, cohete vacio");
    }
    }

    @Override
    public String toString() {
        return "CoheteLanzadero{nombre= '" + getNombre() + '\'' +
                ", peso='" + getPeso() + '\'' +
                ", combustible='" + getCombustible() + '\''+
                "tipoCargamento='" + tipoCargamento + '\'' +
                ", potencia='" + potencia + '\'' +
                ", cargado=" + cargado +
                '}';
    }
}
