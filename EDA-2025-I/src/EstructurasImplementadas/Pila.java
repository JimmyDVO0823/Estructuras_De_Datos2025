/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasImplementadas;

/**
 *
 * @author LENOVO LOQ
 */
public class Pila<T> {
    
    // Clase interna que representa cada nodo de la pila.
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
        
    }
    
    // Referencia al nodo que está en la cima de la pila.
    private Nodo<T> tope;
    
    // Constructor que inicializa la pila vacía.
    public Pila() {
        this.tope = null;
    }
    
    // Constructor para inicializar con un valor

    public Pila(T tope) {
        Nodo<T> nodo = new Nodo<>(tope);
        this.tope = nodo;
    }
    
    
    // Método para agregar un elemento a la pila.
    public void push(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }
    
    // Método para eliminar y retornar el elemento en la cima de la pila.
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        T dato = tope.dato;
        tope = tope.siguiente;
        return dato;
    }
    
    // Método para obtener el elemento en la cima de la pila sin removerlo.
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        return tope.dato;
    }
    
    // Método que indica si la pila está vacía.
    public boolean isEmpty() {
        return tope == null;
    }
    
    // Método para imprimir la pila
    public void printStack(){
        Pila<T> pilaAuxiliar = new Pila<>();
        while(this.getTope() != null){
            pilaAuxiliar.push(pop());
            System.out.println(pilaAuxiliar.getTope().getDato());
        }
        while (pilaAuxiliar.getTope() != null) {            
            push(pilaAuxiliar.pop());
        }
    }
    
    //GETTERS SETTERS

    public Nodo<T> getTope() {
        return tope;
    }

    public void setTope(Nodo<T> tope) {
        this.tope = tope;
    }
    
    public void setTope(T tope) {
        this.tope.setDato(tope);
    }
    
}

