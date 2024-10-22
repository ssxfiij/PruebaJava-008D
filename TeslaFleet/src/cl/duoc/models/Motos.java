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
public class Motos extends VehiculosElectricos {
    private double capacidabateria;
    private boolean asistenciamodoeco;

    public Motos(double capacidabateria, boolean asistenciamodoeco) {
        this.capacidabateria = capacidabateria;
        this.asistenciamodoeco = asistenciamodoeco;
    }

    public Motos(double capacidabateria, boolean asistenciamodoeco, boolean serviciomantenimiento, int tiempouso) {
        super(serviciomantenimiento, tiempouso);
        this.capacidabateria = capacidabateria;
        this.asistenciamodoeco = asistenciamodoeco;
    }

    public double getCapacidabateria() {
        return capacidabateria;
    }

    public void setCapacidabateria(double capacidabateria) {
        this.capacidabateria = capacidabateria;
    }

    public boolean isAsistenciamodoeco() {
        return asistenciamodoeco;
    }

    public void setAsistenciamodoeco(boolean asistenciamodoeco) {
        this.asistenciamodoeco = asistenciamodoeco;
    }

    @Override
    public String toString() {
        return "Motos{" + "capacidabateria=" + capacidabateria + ", asistenciamodoeco=" + asistenciamodoeco + '}';
    }
  
    public int costoalquiler(int tiempouso){
        int costo = VALOR_HORA_ALQUILER * tiempouso ;
        if(asistenciamodoeco == true ){
            costo *= 1.08;
        }
        return costo;
    }
    
}
