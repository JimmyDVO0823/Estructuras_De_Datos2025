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
    
    public void aniadirFinal(Nodo ultimo){
        
        if(tial == null){
        head = ultimo;
        tial = ultimo;
        return;
        }
        
        tial.next = ultimo;
        tial = ultimo;
        
    }
    
    public void aniadirInicio(Nodo primero){
        if(tial == null){
        head = primero;
        tial = primero;
        return;
        }

        primero.next = head;
        head = primero;
        
    }
    
    public void aniadirEnPosicion(int posicion, Nodo nuevo){
        Nodo nodoActual = head;
        Nodo nodoSiguienteActual;
        
        if(tial == null){
            head = nuevo;
            tial = nuevo;
            return;
        }
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

        if(tial == null) return;
        while(continuarBucle){
            if(nodoActual.next.next == null){
                tial = nodoActual.next;
                continuarBucle = false;
            }
        }
    }
    
    public void buscarElemento(){
        
    }
}
