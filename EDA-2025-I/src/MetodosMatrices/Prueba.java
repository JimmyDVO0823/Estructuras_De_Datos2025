/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosMatrices;

import MetodosMatrices.NumeroDuplicado.*;
import MetodosMatrices.NumeroFaltante.*;
import MetodosMatrices.RemoverDuplicados.*;

/**
 *
 * @author LENOVO LOQ
 */
public class Prueba {

    public static void imprimirMatriz(int[][] matriz) {
        if (matriz == null) {
            System.out.println("La matriz es nula.");
            return;
        }

        for (int[] fila : matriz) {
            if (fila == null || fila.length < 2) {
                System.out.println("[]"); // Fila inválida o incompleta
            } else {
                System.out.printf("[%d, %d]%n", fila[0], fila[1]);
            }
        }
    }

    public static void main(String[] args) {

        int[] numeros = new int[100];

        for (int i = 1; i < 101; i++) {
            numeros[i - 1] = i;
        }

        numeros[25] = 0;

        System.out.println(NumeroFaltante.numeroFaltante(numeros));

        int[] numeroDuplicado = {1,2,3,4,5,6,7,8,9,0,1,2,1,4,1,1,12,44,1,1,4,5,6,78,82,5,6,7,8};
        System.out.println(NumeroDuplicado.numeroDuplicado(numeroDuplicado));

        System.out.println(MayorMenor.encontrarMaxMin(numeroDuplicado)[0] + " " + MayorMenor.encontrarMaxMin(numeroDuplicado)[1]);

        int[] duplciadosRemovidos = RemoverDuplicados.removeDuplicates(numeroDuplicado);
        for (int i = 0; i < duplciadosRemovidos.length; i++) {
            System.out.println("- " + duplciadosRemovidos[i]);
        }
        
        int [][] matrizPares = BuscadorPares.encontrarPares(numeroDuplicado, 9);
        imprimirMatriz(matrizPares);
    }
}
