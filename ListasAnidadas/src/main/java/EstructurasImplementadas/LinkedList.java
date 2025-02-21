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
    int size;
    Nodo<T> head;
    Nodo<T> tail; // Corregí el nombre de "tial" a "tail"

    public LinkedList(T elemento) {
        Nodo<T> nodo = new Nodo<>(elemento);
        head = nodo;
        tail = nodo;
        size = 1;
    }

    public LinkedList() {
        size = 0;
    } // Constructor vacío

    static class Nodo<T> { // Clase Nodo genérica

        T data; // Tipo genérico para el dato
        Nodo<T> next;

        Nodo(T data) {
            this.data = data;
            next = null;
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
        size++;
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
        size++;
    }

    public void aniadirEnPosicion(int posicion, T nuevo) {
        size++;
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
            if (nodoActual == null) {
                return; // Evita Null
            }
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
            size--;
        }
    }

    public void eliminarFinal() {
        if (head == null) {
            return;
        }
        size--;

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

    public void removeData(T data) {
        Nodo<T> currentNode = head;
        Nodo<T> previousNode = null;

        if(currentNode == null) return;
        
        size--;
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        while (currentNode != null) {
            if (currentNode.next.data.equals(data)) {
                previousNode = currentNode;
                previousNode.next = currentNode.next.next;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    public boolean contains(T data) {
        Nodo<T> currentNode = head;
        boolean contains = false;

        if (head.data.equals(data) || tail.data.equals(data)) {
            return true;
        } else {
            while (currentNode != null) {
                if (currentNode.data.equals(data)) {
                    contains = true;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
        return contains;
    }

    public void updateData(T old, T now) {
        Nodo<T> nodoActual = head;

        while (nodoActual != null) {
            if (nodoActual.data.equals(old)) {
                nodoActual.data = now;
                break;
            }
            nodoActual = nodoActual.next;
        }
    }

    public void makeVoid() {
        head = null;
        tail = null;
    }
}

/*
Nodo<T> nodoActual = head;
while (nodoActual != null) {
            nodoActual = nodoActual.next;
        }
 */
