/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;




public class FechaNacimiento {
    private int  dia=0;
    private final int mes;
    int año=0;
    
public FechaNacimiento(int  dia, int mes, int año){
    this.dia = dia;
    this.mes = mes;
    this.año = año;
    
}
public void Mfecha(){
    System.out.println("FECHA: " + dia + " de " + mes + " del " + año);
       
    }
        }