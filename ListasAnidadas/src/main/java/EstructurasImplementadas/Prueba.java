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
        list.aniadirFinal(2.0);
        list.aniadirFinal(3.0);
        list.aniadirFinal(5.0);
        list.aniadirEnPosicion(3, 4.0);
        list.removeData(5.0);
        list.imprimirLista();
        System.out.println(list.contains(9.0));
        list.updateData(1.0, 10.0);
        list.imprimirLista();
        list.makeVoid();
        list.imprimirLista();
    }
}
