/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2LinlkedList;
import LinkedList.LinkedList;
import Taller2LinlkedList.LinkedListMethods;

/**
 *
 * @author LENOVO LOQ
 */
public class Pruebas {
    public static void main(String[]args){
        LinkedList<Integer> lista = new LinkedList<>(1);
        lista.aniadirFinal(2);
        lista.aniadirFinal(3);
        lista.aniadirEnPosicion(3, 4);
        lista.aniadirFinal(5);
        
        
        LinkedList<Integer> lista1 = new LinkedList<>(1);
        lista1.aniadirFinal(2);
        lista1.aniadirFinal(3);
        lista1.aniadirFinal(4);
        lista1.aniadirFinal(5);
        
        LinkedList<Integer> lista2 = new LinkedList<>(1);
        lista.aniadirFinal(2);
        lista.aniadirFinal(3);
        lista.aniadirFinal(4);
        lista.aniadirFinal(5);
        
        
        
        System.out.println("Antes");
        lista.imprimirLista();
        
        LinkedListMethods.divideList(lista, 3);
        System.out.println("despues");
        lista.imprimirLista();
        
        LinkedListMethods.invertList(lista);
        
        System.out.println("probando comparador");
        System.out.println(LinkedListMethods.LEXICORD(lista1, lista2));
    }
}
