/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosMatrices;

import MetodosMatrices.NumeroDuplicado.*;
import MetodosMatrices.NumeroFaltante.*;

/**
 *
 * @author LENOVO LOQ
 */
public class Prueba {
    public static void main(String[] args){
        
    int[] numeros = new int[100];
    
    for(int i = 1; i < 101; i++){
        numeros[i-1] = i;
    }
    
    numeros[25] = 0;
    
    System.out.println(NumeroFaltante.numeroFaltante(numeros));
    
    int[] numeroDuplicado = {2,4,7,8,21,4,67,423,3,6357,3,4,4,5,6,7,8,1};
    System.out.println(NumeroDuplicado.numeroDuplicado(numeroDuplicado));
    
        System.out.println(MayorMenor.encontrarMaxMin(numeroDuplicado)[0] + " " + MayorMenor.encontrarMaxMin(numeroDuplicado)[1]);
    }   
}
