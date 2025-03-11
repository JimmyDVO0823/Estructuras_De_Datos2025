/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3PilasColas;
import EstructurasImplementadas.Cola;
import EstructurasImplementadas.Pila;
import Taller3PilasColas.PilasColasMetodos;

/**
 *
 * @author LENOVO LOQ
 */
public class Pruebas {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>(1);
        pila.push(2);
        pila.push(1);
        pila.push(4);
        pila.push(1);
        pila.push(6);
        pila.push(1);
        pila.push(8);
        pila.push(1);
        pila.push(10);
        
        Cola<Integer> cola = new Cola<>(10);
        cola.enqueue(9);
        cola.enqueue(8);
        cola.enqueue(7);
        cola.enqueue(6);
        cola.enqueue(5);
        cola.enqueue(4);
        cola.enqueue(3);
        cola.enqueue(2);
        cola.enqueue(1);
        
        //PilasColasMetodos.reemplazar(pila, 1, 999);
        //PilasColasMetodos.menorAlFondo(pila);   
        //PilasColasMetodos.reorganizarPila(pila, 1);
        PilasColasMetodos.reorganizarCola(cola, 3);
        
        System.out.println("COLA");
        cola.printQueue();
        
        System.out.println("PILA");
        pila.printStack();
    }
}
