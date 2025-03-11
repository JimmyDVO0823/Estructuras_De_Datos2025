/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3PilasColas;
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
        
        //PilasColasMetodos.reemplazar(pila, 1, 999);
        PilasColasMetodos.menorAlFondo(pila);
        
        pila.printStack();
    }
}
