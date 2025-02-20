/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasImplementadas;

/**
 *
 * @author LENOVO LOQ
 */
public class LinkedList {
    Nodo head;
    Nodo tial;

    public LinkedList(int elemento) {
        Nodo nodo = new Nodo(elemento);
        head = nodo;
        tial = nodo;
    }
    
    
    static class Nodo{
        int data;
        Nodo next;
        
        Nodo(int data){
            this.data = data;
            next = null;
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj); 
        }
        
        
    }
    
    public void aniadirFinal(int ultimo){
        
        Nodo ultimoNodo = new Nodo(ultimo);
        
        if(tial == null){
        head = ultimoNodo;
        tial = ultimoNodo;
        return;
        }
        
        tial.next = ultimoNodo;
        tial = ultimoNodo;
        
    }
    
    public void aniadirInicio(int primero){
        
        Nodo primeroNodo = new Nodo(primero);
        
        if(tial == null){
        head = primeroNodo;
        tial = primeroNodo;
        return;
        }

        primeroNodo.next = head;
        head = primeroNodo;
        
    }
    
    public void aniadirEnPosicion(int posicion, int nuevo){
        Nodo nodoActual = head;
        Nodo nodoSiguienteActual;
        Nodo nuevoNodo = new Nodo(nuevo);
        
        if(tial == null){
            head = nuevoNodo;
            tial = nuevoNodo;
            return;
        }
        
        for (int i = 0; i <= posicion; i++) {
            if(i == posicion-1){
                nodoSiguienteActual = nodoActual.next;
                nuevoNodo.next = nodoSiguienteActual;
                nodoActual.next = nuevoNodo;
            }
            
            nodoActual = nodoActual.next;
        }
        
    }
    
    public void eliminarInicio(){
        if(head != null) head = head.next;
    }
    
    public void eliminarFinal(){
        Nodo nodoActual = head;
        boolean continuarBucle = true;

        if(tial == null) return;
        while(continuarBucle){
            if(nodoActual.next.next == null){
                tial = nodoActual.next;
                continuarBucle = false;
            }
        }
    }
    
    public void imprimirLista(){
        Nodo nodoActual = head;
        boolean continuar = nodoActual != null ;
        while(continuar){
            System.out.println(nodoActual.data);
            nodoActual = nodoActual.next;
            continuar = nodoActual != null;
        }
    }
}
