/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

/**
 *
 * @author reroes
 */
public class Rombo extends Figura{
    double diagonal_menor;
    double diagona_mayor;
    
    public Rombo(double diaMayor,double diaMenor){
        diagona_mayor = diaMayor;
        diagonal_menor = diaMenor;
    }
    public void establecerDiaMayor(double diaMayor){
        diagona_mayor = diaMayor;
    }
    public void establecerDiaMenor(double diaMenor){
        diagonal_menor = diaMenor;
    }
    @Override
    public void calcular_area(){
        area = (diagona_mayor*diagonal_menor)/2;
    } 
    public double obtenerDiaMayor(){
        return diagona_mayor;
    }
    public double obtenerDiaMenor(){
        return diagonal_menor;
    }
    public double obtenerArea(){
        return area;
    }
    
    @Override
    public String toString(){ 
        String cadenaFinal = String.format("%s\n", super.toString());
        cadenaFinal = String.format("--Rombo--"
                + "%s\n"
                + "Area: %.2f\n",
                cadenaFinal,
                obtenerArea());
        
        return cadenaFinal;
    }
}
