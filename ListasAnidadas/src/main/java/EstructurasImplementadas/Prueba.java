/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasImplementadas;

/**
 *
 * @author LENOVO LOQ
 */
public class Prueba {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1.0);
        list.aniadirFinal(1.5);
        list.aniadirInicio(2.0);
        list.imprimirLista();
        list.makeVoid();
        list.imprimirLista();
    }
}
