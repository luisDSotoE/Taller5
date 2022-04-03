/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author luisc
 */
public class DireccionDomicilio {
    private final String DCiudad;
    private final String Dbarrio; 
    private final String DCódigopostal;
    
public DireccionDomicilio( String Ciudad, String barrio,  String Códigopostal){
    this.DCiudad = Ciudad;
    this.Dbarrio = barrio;
    this.DCódigopostal = Códigopostal;
}

   

    
    public void MostrarDireccionDomicilio(){
        System.out.println("\n");
        System.out.println("DIRECCION DOMICILIO");
        System.out.println("Ciudad: " + DCiudad);
        System.out.println("barrio: " + Dbarrio);
        System.out.println("Códigopostal: " + DCódigopostal);
}
}