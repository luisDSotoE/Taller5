/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;



/**
 *
 * @author luisc
 */
public class Clase_Persona {
    private final String nombre;
    private final String apellido;
    private int edad= 0;
    
    DireccionDomicilio direccion;
    DireccionTrabajo direccionT;
    FechaNacimiento fecha;
    
	
		 

    public Clase_Persona(String nombre, String apellido, int edad, DireccionDomicilio direccion, DireccionTrabajo direccionT, FechaNacimiento fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.direccionT = direccionT;
        this.fecha = fecha;
    }
    public  void Mostrar(){
        System.out.println("INFORMACION");
        System.out.println("Nombre y Apellido: " + nombre + " " + apellido );
        System.out.println("Edad: " + edad);
        direccion.MostrarDireccionDomicilio();
        direccionT.MostrarDireccionTrabajo();
        fecha.Mfecha();
        System.out.println("-------------------------------------------------------------------------------------------------------------/");
        System.out.println("-------------------------------------------------------------------------------------------------------------/");
        System.out.println("");
        
    }

    }
          
