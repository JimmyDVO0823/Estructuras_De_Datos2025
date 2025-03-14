/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasImplementadas;

import java.util.NoSuchElementException;

/**
 *
 * @author LENOVO LOQ
 */
public class Cola<T> {

    private static class Nodo<T> {

        T dato;
        Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }

        public T getDato() {
            return dato;
        }

        public void setDato(T dato) {
            this.dato = dato;
        }

        public Nodo<T> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo<T> siguiente) {
            this.siguiente = siguiente;
        }

    }

    Nodo<T> tail;
    Nodo<T> head;

    public Cola() {
    }

    public Cola(T tail) {
        Nodo<T> nodo = new Nodo(tail);
        this.tail = nodo;
        head = nodo;
    }
    
    

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        T data = getHead().getDato();
        return data;
    }

    public void empezar(T element) {
        tail = new Nodo<>(element);
        head = tail;
    }

    public void enqueue(T element) {
        if (isEmpty()) {
            empezar(element);
        } else {
            Nodo<T> nodo = new Nodo<>(element);
            tail.setSiguiente(nodo);
            tail = nodo;
        }
    }

    public T dequeue() {
    if (isEmpty()) {
        throw new NoSuchElementException("La cola está vacía");
    }
    T dataReturn = head.getDato();
    head = head.getSiguiente();
    
    // Actualizar tail si la cola queda vacía
    if (head == null) {
        tail = null;
    }
    
    return dataReturn;
}

    public boolean isEmpty() {
        return head == null;
    }

    public void printQueue() {
        Cola<T> colaAuxiliar = new Cola();

        while (getHead() != null) {
            System.out.println(peek());
            colaAuxiliar.enqueue(this.dequeue());
        }

        while (colaAuxiliar.getHead() != null) {
            enqueue(colaAuxiliar.dequeue());
        }

    }

    //GETTERS SETTERS
    public Nodo<T> getTail() {
        return tail;
    }

    public void setTail(Nodo<T> tail) {
        this.tail = tail;
    }

    public Nodo<T> getHead() {
        return head;
    }

    public void setHead(Nodo<T> head) {
        this.head = head;
    }

}
