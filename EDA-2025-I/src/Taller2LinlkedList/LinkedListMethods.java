/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2LinlkedList;

import EstructurasImplementadas.LinkedList;
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
    }
}
