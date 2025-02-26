/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1MetodosMatrices;

import java.util.Arrays;

/**
 *
 * @author LENOVO LOQ
 */
public class RemoverDuplicados {

    public static int[] removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return new int[0]; // Devuelve array vacío, no el original
        }

        int[] copiaNums = Arrays.copyOf(nums, nums.length); // Evita modificar el array original
        Arrays.sort(copiaNums);

        int i = 0; // Puntero para elementos únicos

        for (int j = 1; j < copiaNums.length; j++) {
            if (copiaNums[j] != copiaNums[i]) {
                i++;
                copiaNums[i] = copiaNums[j];
            }
        }

        // Crear nuevo array con los elementos únicos
        int[] numsOrdenado = new int[i + 1];
        for (int j = 0; j <= i; j++) {
            numsOrdenado[j] = copiaNums[j]; // Copiar desde 0 hasta i (inclusive)
        }

        return numsOrdenado;
    }
}
