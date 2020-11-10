/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xcheko51x
 */
public class POO {

    // LISTA CON LOS OBJETOS DE TIPO VEHICULO
    static List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
    
    public static void main(String[] args) {
        
        // CREA EL OBJETO DE TIPO VEHICULO PERO SIN ATRIBUTOS
        Vehiculo carro1 = new Vehiculo();
        
        // CREA EL OBJETO DE TIPO VEHICULO CON ALGUNOS ATRIBUTOS DEBN SER IGUALES A ALGUN CONSTRUCTOR
        Vehiculo carro2 = new Vehiculo("Carro", "HONDA", "CIVIC", 2004);
        
        // CREA EL OBJETO DE TIPO VEHICULO CON TODOS LOS ATRIBUTOS
        Vehiculo carro3 = new Vehiculo("Carro", "CHEVROLET", "ASTRA", 2007, 40000.00, "GRIS", 4);
        
        // AGREGA LOS VEHICULOS A LA LISTA
        listaVehiculos.add(carro1);
        listaVehiculos.add(carro2);
        listaVehiculos.add(carro3);
        
        // ASIGNAMOS ATRIBUTOS AL OBJETO
        carro1.setTipo("Motocicleta");
        carro1.setAnio(2010);
        carro1.setColor("VERDE");
        
        //carro2.acelerar();
        //carro3.frenar();
        
        // CICLO PARA RECORRER Y MOSTRAR LOS DATOS DE LA LISTA
        for(int i = 0 ; i < listaVehiculos.size() ; i++) {
            //listaVehiculos.get(i).mostrarVehiculo();
        }
        
        // MOSTRAMOS EL CARRO3 ANTES DEL CAMBIO DE COLOR
        carro3.mostrarVehiculo();
        
        // CAMBIAMOS EL COLOR AL CARRO3
        carro3.cambiarColor("ROJO");
        
        // MOSTRAMOS EL CARRO3 DESPUES DEL CAMBIO DE COLOR
        carro3.mostrarVehiculo();
        
    }
    
}
