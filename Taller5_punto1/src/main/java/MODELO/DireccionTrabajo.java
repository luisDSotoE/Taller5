/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author luisc
 */
public class DireccionTrabajo {
    private String direccion = null;
    private String barrio= null;
    private String Códigopostal= null;
    
public DireccionTrabajo(String barrio, String direccion,  String Códigopostal){
    this.direccion = direccion;
    this.barrio = barrio;
    this.Códigopostal = Códigopostal;
}

    public void MostrarDireccionTrabajo(){
        System.out.println("\n");
        System.out.println("DIRECCION TRABAJO");
        System.out.println("Ciudad: " + direccion);
        System.out.println("barrio: " + barrio);
        System.out.println("Códigopostal: " + Códigopostal);
    }
}
