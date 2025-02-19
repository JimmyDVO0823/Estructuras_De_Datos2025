/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnlazadaSimple;

/**
 *
 * @author LENOVO LOQ
 */
public class LinkedList {
    Nodo head;
    Nodo tial;
    
    static class Nodo{
        int data;
        Nodo next;
        
        Nodo(int data){
            this.data = data;
            next = null;
        }
    }
    
    public void aniadirFinal(Nodo ultimo){
        
        aniadirVacio(ultimo);
        if (tial != null){
            tial.next = ultimo;
            tial = ultimo;
        }
    }
    
    public void aniadirInicio(Nodo primero){
        aniadirVacio(primero);
        if (tial != null){
            primero.next = head;
            head = primero;
        }
    }
    
    public void aniadirEnPosicion(int posicion, Nodo nuevo){
        Nodo nodoActual = head;
        Nodo nodoSiguienteActual;
        
        
        aniadirVacio(nuevo);
        for (int i = 0; i <= posicion; i++) {
            if(i == posicion-1){
                nodoSiguienteActual = nodoActual.next;
                nuevo.next = nodoSiguienteActual;
                nodoActual.next = nuevo;
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
        if(tial != null){
            while(continuarBucle){
                if(nodoActual.next.next == null){
                    tial = nodoActual.next;
                    continuarBucle = false;
                }
            }
        }
    }
    
    
    
    public void aniadirVacio(Nodo nuevoNodo){
        if(tial == null){
        head = nuevoNodo;
        tial = nuevoNodo;
        }
    }
    
}
