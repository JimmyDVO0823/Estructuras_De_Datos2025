/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosMatrices;


/**
 *
 * @author LENOVO LOQ
 */
public final class NumeroFaltante {
    public static int numeroFaltante(int[] numeros){
        int resultadoEsperado = numeros.length * (numeros.length+1) / 2;
        int resultado = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i];
        }
        
        resultado = resultadoEsperado-resultado;
        
        return resultado;
    }
}
