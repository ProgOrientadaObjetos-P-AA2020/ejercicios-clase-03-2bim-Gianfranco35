/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double diaMay,diaMen,bas,alt,lad;
        // inicio de la solución
        ArrayList<Figura> figuras = new ArrayList<>();
        
        System.out.println("Datos para Cuadrado");
        for(int i =0;i < 4;i++){
        System.out.println("Ingrese el tamaño del lado: "+ (i+1));
        lad = entrada.nextInt();
        Cuadrado cuadrado = new Cuadrado(lad);
        cuadrado.calcular_area();
        figuras.add(cuadrado);
        }
        System.out.println("Datos para Rombo");
        for(int i=0;i<3;i++){
        System.out.println("Ingrese tamaño del Diagonal Mayor: "+ (i+1));
        diaMay = entrada.nextDouble();
        System.out.println("Ingrese tamaño de la Diagonal Menor: "+ (i+1));
        diaMen = entrada.nextDouble();
        Rombo romb = new Rombo(diaMay,diaMen);
        romb.calcular_area();
        figuras.add(romb);
        }
        System.out.println("Datos para Triangulo");
        for(int i=0;i<3;i++){
        System.out.println("Ingrese el tamaño de la Base: "+ (i+1));
        bas = entrada.nextDouble();
        System.out.println("Ingrese el tamaño de la Altura: "+ (i+1));
        alt = entrada.nextDouble();
        Triangulo trian = new Triangulo(bas,alt);
        trian.calcular_area();
        figuras.add(trian);
        }
        
        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcular_area();
            
            System.out.printf("Datos de Figura\n"
                        + "%s\n",                        
                  figuras.get(i));
        }
    }
}
