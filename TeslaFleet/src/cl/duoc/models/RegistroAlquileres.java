/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class RegistroAlquileres {
    public List<VehiculosElectricos> registro = new ArrayList<>();
    
    
    public RegistroAlquileres(){
    registro = new ArrayList<>();
     }    
    
    
   public void agregarVehiculo(VehiculosElectricos vehiculo){
       registro.add(vehiculo);
       System.out.println("Vehiculo agregado con exito");
   }
   
   public boolean codigo(String codigo){
       for(VehiculosElectricos i : registro){
           if(i.getCodigo().equals(codigo)){
               return false;
           }
       }
       return true;
   }
   
   public void listarVehiculosElectronicos(){
       for(VehiculosElectricos i): registro{
       System.out.println("codigoalfanumerico" + VehiculosElectricos.getcodigoalfanumerico());
       System.out.println("serviciomantenimiento" + VehiculosElectricos.getserviciomantenimiento());
       System.out.println("serviciomantenimiento" + VehiculosElectricos.gettiempouso);
   }
   }
    
   public void cantidadVehiculos(){
       System.out.println("el total de vehiculos en la flota es :" + registro.size());
   }
    
    
    
    
    
}
