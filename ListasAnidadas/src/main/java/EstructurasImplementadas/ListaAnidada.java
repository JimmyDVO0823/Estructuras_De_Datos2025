/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasImplementadas;

/**
 *
 * @author LENOVO LOQ
 */
public class ListaAnidada {
    Nodo cabeza;
    
    static class Nodo{
        int data;
        Nodo next;
        
        Nodo(int data){
            this.data = data;
            next = null;
        }
    }
    
    public void aniadirFinal(Nodo ultimo){
        Nodo n = cabeza;
        
        if(n == null){
        cabeza = ultimo;
        }
        else{
            while(n.next != null){
                n = n.next;
            }
            n.next = ultimo;
        }
        
        
    }
    
    
}
