/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public abstract class VehiculosElectricos {

    private String codigoalfanumerico;
    private boolean serviciomantenimiento;
    private int tiempouso;

    public VehiculosElectricos() {
    }

    public VehiculosElectricos(boolean serviciomantenimiento, int tiempouso) {
        this.serviciomantenimiento = serviciomantenimiento;
        this.tiempouso = tiempouso;
    }

    public String getCodigoalfanumerico() {
        return codigoalfanumerico;
    }

    public void setCodigoalfanumerico(String codigoalfanumerico) {
        this.codigoalfanumerico = codigoalfanumerico;
    }

    public boolean isServiciomantenimiento() {
        return serviciomantenimiento;
    }

    public void setServiciomantenimiento(boolean serviciomantenimiento) {
        this.serviciomantenimiento = serviciomantenimiento;
    }

    public int getTiempouso() {
        return tiempouso;
    }

    public void setTiempouso(int tiempouso) {
        this.tiempouso = tiempouso;
    }
    
    @Override
    public abstract String toString();
   
   
}
