/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VISTA;

import MODELO.Clase_Persona;
import MODELO.DireccionDomicilio;
import MODELO.DireccionTrabajo;
import MODELO.FechaNacimiento;





/**
 *
 * @author luisc
 */
public class Prueba_persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DireccionDomicilio d1 = new DireccionDomicilio ("valledupar", "carrera 67p - 57", "200004");
        //
        DireccionTrabajo d2 = new DireccionTrabajo ("carrera 5c - 46", "bogota", "200007");
        //
        FechaNacimiento f = new FechaNacimiento(1, 5, 2020);
        ///
        Clase_Persona p0 = new Clase_Persona("andres", "romero", 26, d1, d2, f);
        p0.Mostrar();
    }

    
    }
    

