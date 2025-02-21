/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasImplementadas;

/**
 *
 * @author LENOVO LOQ
 */
public class LinkedList<T> { // <-- Añade el parámetro genérico T
    Nodo<T> head;
    Nodo<T> tail; // Corregí el nombre de "tial" a "tail"

    public LinkedList(T elemento) {
        Nodo<T> nodo = new Nodo<>(elemento);
        head = nodo;
        tail = nodo;
    }
    
    public LinkedList() {} // Constructor vacío
    
    static class Nodo<T> { // Clase Nodo genérica
        T data; // Tipo genérico para el dato
        Nodo<T> next;
        
        Nodo(T data) {
            this.data = data;
            next = null;
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj); 
        }
    }
    
    public void aniadirFinal(T ultimo) {
        Nodo<T> ultimoNodo = new Nodo<>(ultimo);
        
        if (tail == null) {
            head = ultimoNodo;
            tail = ultimoNodo;
            return;
        }
        
        tail.next = ultimoNodo;
        tail = ultimoNodo;
    }
    
    public void aniadirInicio(T primero) {
        Nodo<T> primeroNodo = new Nodo<>(primero);
        
        if (tail == null) {
            head = primeroNodo;
            tail = primeroNodo;
            return;
        }

        primeroNodo.next = head;
        head = primeroNodo;
    }
    
    public void aniadirEnPosicion(int posicion, T nuevo) {
        Nodo<T> nodoActual = head;
        Nodo<T> nuevoNodo = new Nodo<>(nuevo);
        
        if (tail == null) {
            head = nuevoNodo;
            tail = nuevoNodo;
            return;
        }
        
        if (posicion == 0) {
            aniadirInicio(nuevo);
            return;
        }
        
        for (int i = 0; i < posicion - 1; i++) {
            if (nodoActual == null) return; // Evita NullPointerException
            nodoActual = nodoActual.next;
        }
        
        if (nodoActual != null) {
            nuevoNodo.next = nodoActual.next;
            nodoActual.next = nuevoNodo;
            if (nuevoNodo.next == null) {
                tail = nuevoNodo;
            }
        }
    }
    
    public void eliminarInicio() {
        if (head != null) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }
    
    public void eliminarFinal() {
        if (head == null) return;
        
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        
        Nodo<T> nodoActual = head;
        while (nodoActual.next != tail) {
            nodoActual = nodoActual.next;
        }
        nodoActual.next = null;
        tail = nodoActual;
    }
    
    public void imprimirLista() {
        Nodo<T> nodoActual = head;
        while (nodoActual != null) {
            System.out.println(nodoActual.data.toString());
            nodoActual = nodoActual.next;
        }
    }
    
    public void makeVoid(){
        head = null;
        tail = null;
    }
}