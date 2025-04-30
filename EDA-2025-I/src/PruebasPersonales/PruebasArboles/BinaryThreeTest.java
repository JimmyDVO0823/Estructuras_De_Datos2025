package PruebasPersonales.PruebasArboles;

import EstructurasImplementadas.BinaryTree;

public class BinaryThreeTest {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree();
        binaryTree.add(50);
        binaryTree.add(38);
        binaryTree.add(41);
        binaryTree.add(16);
        binaryTree.add(23);
        binaryTree.add(7);
        binaryTree.add(12);
        binaryTree.add(80);
        binaryTree.add(93);
        binaryTree.add(75);
        binaryTree.add(69);

        System.out.println("ALGORITMO IN-ORDER");
        binaryTree.inOrder();

        BinaryTree<Integer> binaryTree2 = new BinaryTree();
        binaryTree2.add(50);
        binaryTree2.add(25);
        binaryTree2.add(20);
        binaryTree2.add(30);
        binaryTree2.add(75);
        binaryTree2.add(70);
        binaryTree2.add(80);
        binaryTree2.add(90);
        binaryTree2.add(10);
        binaryTree2.add(45);
        binaryTree2.add(55);

        System.out.println("ALGORITMO PRE-ORDER");
        binaryTree2.preOrder();

        BinaryTree<Integer> binaryTree3 = new BinaryTree();
        binaryTree3.add(50);
        binaryTree3.add(25);
        binaryTree3.add(20);
        binaryTree3.add(30);
        binaryTree3.add(75);
        binaryTree3.add(70);
        binaryTree3.add(80);
        binaryTree3.add(90);
        binaryTree3.add(10);
        binaryTree3.add(45);
        binaryTree3.add(55);

        System.out.println("ALGORITMO POST-ORDER");
        binaryTree3.postOrder();



        BinaryTree<Integer> tree = new BinaryTree<>();

        // Insertamos valores de manera controlada
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);

        System.out.println("Recorrido Preorden (raíz, izquierda, derecha):");
        tree.preOrder();

        System.out.println("\nRecorrido Inorden (izquierda, raíz, derecha):");
        tree.inOrder();

        System.out.println("\nRecorrido Postorden (izquierda, derecha, raíz):");
        tree.postOrder();
    }
}
