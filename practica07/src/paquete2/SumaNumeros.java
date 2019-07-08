/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author rober
 */
public class SumaNumeros {

    public static int obtenerSumaUno(int v) {
        int suma = 0;
        for (int i = 0; i <= v; i++) {
            suma = suma + i;
        }
        return suma;
    }
    
    public static int obtenerSumaDos(int valor) {
        if (valor <= 0) {
            return 0;
        } else {
            return valor + obtenerSumaDos(valor - 1);
        }
    }
}
