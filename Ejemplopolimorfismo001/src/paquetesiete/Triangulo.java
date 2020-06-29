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
public class Triangulo extends Figura {
    double base;
    double altura;
    
    public Triangulo(double bas,double alt){
        base = bas;
        altura=alt;
    }
    public void establecerBase(double bas){
        base=bas;
    }
    public void establecerAltura(double alt){
        altura = alt;
    }
    @Override
    public void calcular_area(){
        area = (base*altura)/2;
    }
    public double obtenerBase(){
        return base;
    }
    public double obtenerAltura(){
        return altura;
    }
    public double obtenerArea(){
        return area;
    }
    @Override
    public String toString(){ 
        String cadenaFinal = String.format("%s\n", super.toString());
        cadenaFinal = String.format("--Triangulo--"
                + "%s\n"
                + "Area:: %.2f\n",
                cadenaFinal,
                obtenerArea());
        
        return cadenaFinal;
    }
}
