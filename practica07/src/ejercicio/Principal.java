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
public class Principal {
    
    public static void main(String[] args) {
        
        int arreglo[] = {10, 20, 30, 1, 2, 3, 40, 4};
        //  llamo el metodo con recursividad y lo presento
        int tamanio = MiMetodo.obtenerTamanioArreglo(arreglo, arreglo.length);
        System.out.printf("Con recursividad: %d\n", tamanio);
        
        //  llamo a mi metodo y lo presento
        int tamanio2 = MiMetodo.miMetodo(arreglo, arreglo.length);
        System.out.printf("Mi metodo: %d\n", tamanio2);
    }
    
}
