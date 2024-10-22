/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teslafleet;

import cl.duoc.models.Autos;
import cl.duoc.models.Bicicletas;
import cl.duoc.models.Motos;
import cl.duoc.models.RegistroAlquileres;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class TeslaFleet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RegistroAlquileres lista = new RegistroAlquileres();
        
        Autos auto1 = new Autos(3, true, true, 5);
        Autos auto2 = new Autos(2, true, true, 1);
        Autos auto3 = new Autos(4, true, true, 6);
        
        Motos moto1 = new Motos(20, true, true, 9);
        Motos moto2 = new Motos(40, false, true, 4);
        
       
        Bicicletas bicicleta1 = new Bicicletas("bacanes", 60, true, 7);
        Bicicletas bicicleta2 = new Bicicletas("flow", 90, true, 8);
        
        
        
        Scanner entrada = new Scanner(system.in);
        int opcion = 0;
        
        while(opcion != 4){
            System.out.println("----MENU----");
            System.out.println("[1] ver vehiculos");
            System.out.println("[2] alquiler");
            System.out.println("[3] total a pagar");
            System.out.println("salir");
            
            opcion = entrada.nextInt();
            
            System.out.println("codigoalfanumerico");
            String codigo = entrada.nextLine();
           
            System.out.println("serviciomantenimiento");
            boolean serviciomantenimiento = entrada.nextBoolean();
            
            System.out.println("tiempouso");
            int tiempouso = entrada.nextInt();
            
            
           
            
            
            
        }
            
        
        
        
    }
    
}
