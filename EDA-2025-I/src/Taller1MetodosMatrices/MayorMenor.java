/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1MetodosMatrices;

/**
 *
 * @author LENOVO LOQ
 */
public class MayorMenor {
    public static int[] encontrarMaxMin(int[] matriz) {
        if (matriz == null || matriz.length == 0) {
            throw new IllegalArgumentException("La matriz está vacía o es nula");
        }

        int max = matriz[0];
        int min = matriz[0];

        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i] > max) {
                max = matriz[i];
            } else if (matriz[i] < min) {
                min = matriz[i];
            }
        }

        return new int[]{max, min};
    }
}
