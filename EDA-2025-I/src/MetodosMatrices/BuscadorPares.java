/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosMatrices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LENOVO LOQ
 */
public class BuscadorPares {

    public static int[][] encontrarPares(int[] nums, int objetivo) {
        nums = RemoverDuplicados.removeDuplicates(nums); // Eliminar duplicados (asume que ordena)
        
        int izquierda = 0;
        int derecha = nums.length - 1;
        List<List<Integer>> paresLista = new ArrayList<>();  // Lista temporal para almacenar pares

        // Algoritmo de dos punteros
        while (izquierda < derecha) {
            int sumaActual = nums[izquierda] + nums[derecha];

            if (sumaActual < objetivo) {
                izquierda++;
            } else if (sumaActual > objetivo) {
                derecha--;
            } else {
                // Añadir par a la lista temporal
                paresLista.add(Arrays.asList(nums[izquierda], nums[derecha]));

                // Saltar duplicados
                while (izquierda < derecha && nums[izquierda] == nums[izquierda + 1]) izquierda++;
                while (izquierda < derecha && nums[derecha] == nums[derecha - 1]) derecha--;

                izquierda++;
                derecha--;
            }
        }

        // Convertir la lista a matriz bidimensional
        int[][] paresMatriz = new int[paresLista.size()][2];
        for (int i = 0; i < paresLista.size(); i++) {
            List<Integer> par = paresLista.get(i);
            paresMatriz[i][0] = par.get(0);  // Primer elemento del par
            paresMatriz[i][1] = par.get(1);  // Segundo elemento del par
        }

        return paresMatriz;
    }
}
