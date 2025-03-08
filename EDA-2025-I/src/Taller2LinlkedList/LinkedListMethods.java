/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2LinlkedList;

import LinkedList.LinkedList;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author LENOVO LOQ
 */
public final class LinkedListMethods {

    public static void divideList(LinkedList<Integer> list, int divider) {
        LinkedList<Integer> menores = new LinkedList<>(); // Almacena elementos < divider
        LinkedList<Integer> mayoresIguales = new LinkedList<>(); // Almacena elementos >= divider
        LinkedList<Integer> listaOrdenada = new LinkedList<>();
        Iterator<Integer> iterador = list.iterator();
        while (iterador.hasNext()) {
            Integer elemento = iterador.next();
            if (elemento < divider) {
                menores.aniadirInicio(elemento);
            } else {
                mayoresIguales.aniadirInicio(elemento);
            }
        }
        list.makeVoid();
        list.addAll(menores);
        list.addAll(mayoresIguales);
    }

    public static void invertList(LinkedList list) {
        LinkedList tempList = new LinkedList();
        int i = list.getSize();
        Iterator<Integer> iterador = list.iterator();
        while (iterador.hasNext()) {
            Integer elemento = iterador.next();
            tempList.aniadirInicio(elemento);
        }
        System.out.println("probando");
        tempList.imprimirLista();
    }

    public static boolean LEXICORD(LinkedList L1, LinkedList L2) {
        //completar este método
        boolean mayor = false;
        Iterator<Integer> iterador1 = L1.iterator();
        Iterator<Integer> iterador2 = L2.iterator();
        
        System.out.println("imprimiendo elementos");
        
        while(iterador1.hasNext() || iterador2.hasNext()){
            Integer elemento1 = iterador1.hasNext() ? iterador1.next(): null;
            Integer elemento2 = iterador2.hasNext() ? iterador2.next(): null;
            System.out.println("elemento 1: " + elemento1);
            System.out.println("elemento 2: " + elemento2);
            if(elemento1 == null && elemento2 == null) break;
            if(elemento1 != null && elemento2 == null || elemento1 > elemento2) {
                mayor = true;
                break;
            }
            if(Objects.equals(elemento1, elemento2)) continue;
            else break;
        }
        System.out.println("fin de la impresion");
        return mayor;
    }
}
