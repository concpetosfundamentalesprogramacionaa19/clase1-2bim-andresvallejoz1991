/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

/**
 *
 * @author andresvallejoz1991
 */
public class ArregloCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] c = {10, 20, 30, 40}; // declaramos la variable
        double operacion = 0;//Declaracion de la operacion 
      
        System.out.printf("%s\t\t%s\t\t%s\n", "Indice", "Valor","Cuadrado");

        for (int contador = 0; contador < c.length; contador++) {
            operacion = Math.pow((c[contador]),2);//Math pow para potencias
            System.out.printf("%d\t\t%d\t\t%.2f\n", contador, c[contador],
                    operacion);
        }
    }

}
