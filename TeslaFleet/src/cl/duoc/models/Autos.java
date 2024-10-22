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
public class Autos extends VehiculosElectricos {
    private int cantidadpasajeros;
    private boolean autopilot;

    public Autos(int cantidadpasajeros, boolean autopilot) {
        this.cantidadpasajeros = cantidadpasajeros;
        this.autopilot = autopilot;
    }

    public Autos(int cantidadpasajeros, boolean autopilot, boolean serviciomantenimiento, int tiempouso) {
        super(serviciomantenimiento, tiempouso);
        this.cantidadpasajeros = cantidadpasajeros;
        this.autopilot = autopilot;
    }

    public int getCantidadpasajeros() {
        return cantidadpasajeros;
    }

    public void setCantidadpasajeros(int cantidadpasajeros) {
        this.cantidadpasajeros = cantidadpasajeros;
    }

    public boolean isAutopilot() {
        return autopilot;
    }

    public void setAutopilot(boolean autopilot) {
        this.autopilot = autopilot;
    }

    @Override
    public String toString() {
        return "Autos{" + "cantidadpasajeros=" + cantidadpasajeros + ", autopilot=" + autopilot + '}';
    }

    public int costoalquiler(int tiempouso){
        int costo = VALOR_HORA_ALQUILER * tiempouso ;
        if(autopilot == true){
            costo *= 1.10;}
        return costo;
    }
    
    
    
    
    
}
