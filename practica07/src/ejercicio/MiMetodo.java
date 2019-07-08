/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author rober
 */
public class MiMetodo {
    //  metodo utilizando recursividad
    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2, tamanio - 1);
        }
    }
    //  Metodo utilizando ciclo while
    public static int miMetodo(int arreglo[], int tamanio) {
        int c = 0;
        int suma = 0;
        
        while (c != 8) {
            suma = suma + arreglo[c];
            c = c + 1;
        }
        return suma;
    }

}
