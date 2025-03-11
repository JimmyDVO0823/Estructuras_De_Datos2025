/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3PilasColas;

import EstructurasImplementadas.Cola;
import EstructurasImplementadas.Pila;

/**
 *
 * @author LENOVO LOQ
 */
public final class PilasColasMetodos {

    public static void reemplazar(Pila<Integer> pila, int viejo, int nuevo) {
        Pila<Integer> pilaAuxiliar = new Pila<>();

        while (!pila.isEmpty()) {
            if (pila.peek() == viejo) {
                pila.setTope(nuevo);
            }
            pilaAuxiliar.push(pila.pop());
        }

        while (!pilaAuxiliar.isEmpty()) {
            pila.push(pilaAuxiliar.pop());
        }

    }

    public static void menorAlFondo(Pila<Integer> pila) {
        Pila<Integer> pilaAuxiliar = new Pila<>();
        int menor = Integer.MAX_VALUE;

        while (!pila.isEmpty()) {
            if (pila.peek() < menor) {
                menor = pila.peek();
            }
            pilaAuxiliar.push(pila.pop());
        }

        pila.push(menor);

        while (!pilaAuxiliar.isEmpty()) {
            if (pilaAuxiliar.peek() != menor) {
                pila.push(pilaAuxiliar.pop());
            } else {
                pilaAuxiliar.pop();
            }
        }
    }

    public static void reorganizarPila(Pila<Integer> pila, int numero) {
        Pila<Integer> pilaAuxiliar = new Pila();

        while (pila.getTope() != null) {
            if (pila.peek() == numero)pila.pop();
            else pilaAuxiliar.push(pila.pop());
        }

        while (pilaAuxiliar.getTope() != null) {
            pila.push(pilaAuxiliar.pop());
        }

        pila.push(numero);
    }

    public static void reorganizarCola(Cola<Integer> cola, int numero) {
        Cola<Integer> colaAuxiliar = new Cola<>();
        
        while(!cola.isEmpty()){
            if(cola.peek() == numero) cola.dequeue();
            else colaAuxiliar.enqueue(cola.dequeue());
        }
        
        cola.enqueue(numero);
        while(!colaAuxiliar.isEmpty()){
            cola.enqueue(colaAuxiliar.dequeue());
        }
    }

}
