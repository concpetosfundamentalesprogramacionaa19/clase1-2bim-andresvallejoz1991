/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Scanner;

/**
 *
 * @author andresvallejo1991
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] datos = new int[6];//Declaracion del arreglo
        boolean bandera = true;//Declaracion de bandera para el ciclo while

        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19", "19.1-20",
            "20.1 en adelante"};

        while (bandera == true) {//Ciclo While para ingreso de datos
            System.out.print("Ingrese la nota\n");//Mensaje de notas
            double cantidad = entrada.nextDouble();
//Entrada de los datos minetras la bandera sea True
//Condicionales para los rangos de "0-8", "8.1-12", "12.1-16","16.1-19",
//"19.1-20" "20.1 en adelante"
            if (cantidad <= 8) {
                datos[0] = datos[0] + 1;
            } else {
                if (cantidad > 8 && cantidad <= 12) {
                    datos[1] = datos[1] + 1;
                } else {
                    if (cantidad > 12 && cantidad <= 16) {
                        datos[2] = datos[2] + 1;
                    } else {
                        if (cantidad > 16 && cantidad <= 19) {
                            datos[3] = datos[3] + 1;
                        } else {
                            if (cantidad > 19 && cantidad <= 20) {
                                datos[4] = datos[4] + 1;
                            } else {
                                if (cantidad >= 19.1 && cantidad <= 20) {
                                    datos[5] = datos[5] + 1;
                                } else {
                                    datos[6] = datos[6] + 1;
                                }
                            }
                        }
                    }
                }

            }

//En caso de que el usuario decida continar ingresando datos presionara 2 
//caso contrario con el 1 saldra del ciclo
            System.out.println("Presione 1 para salir | Presione 2 para continuar ");
            int opcion = entrada.nextInt();//Entrada de los datos
            if (opcion == 1) {
                bandera = false;//bandera en falso
            }
        }
        
        System.out.println("Notas ingresadas\nRangos:");//Impresion del encabezado
        //Impresion de los datos y el rango
        for (int i = 0; i < datos.length; i++) {
            System.out.printf("%s = %d\n", rangos[i], datos[i]);
        }

    }
}
