/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import static cl.duoc.models.Interface.VALOR_HORA_ALQUILER;

/**
 *
 * @author Cetecom
 */
public class Bicicletas extends VehiculosElectricos {
    private String tipofrenos;
    private int bateria;

    public Bicicletas(String tipofrenos, int bateria) {
        this.tipofrenos = tipofrenos;
        this.bateria = bateria;
    }

    public Bicicletas(String tipofrenos, int bateria, boolean serviciomantenimiento, int tiempouso) {
        super(serviciomantenimiento, tiempouso);
        this.tipofrenos = tipofrenos;
        this.bateria = bateria;
    }

    public String getTipofrenos() {
        return tipofrenos;
    }

    public void setTipofrenos(String tipofrenos) {
        this.tipofrenos = tipofrenos;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Bicicletas{" + "tipofrenos=" + tipofrenos + ", bateria=" + bateria + '}';
    }
    
    
    public int costoalquiler(int tiempouso){
        int costo = VALOR_HORA_ALQUILER * tiempouso ;
        if(bateria < 20){
            costo *= 1.05;}
        return costo;
    }
}
