/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasImplementadas;

import java.util.List;

/**
 * @author LENOVO LOQ
 */
public class BinaryThree<T extends Number & Comparable<T>> {

    private Node<T> root;
    private int size;

    // Node interno
    private static class Node<T> {
        private T data;
        private Node<T> left;
        private Node<T> right;

        Node(T data) {
            this.data = data;
        }

        public Node() {
        }
    }

    // Inserta un data en el árbol
    // Retorna true si fue insertado (no existía), false si ya existía

    /**
     * @param valor El valor a añadir
     * @return retorna si se añadió el valor o no
     */
    public boolean add(T valor) {
        if (root == null) {
            // Si el árbol está vacío, creamos la raíz
            root = new Node<>(valor);
            size++;
            return true;
        }
        // Si no está vacío, delegamos en add2
        boolean inserted = add2(root, valor);
        if (inserted) {
            size++;
        }
        return inserted;
    }

    /**
     * @param nodo Nodo raiz actual
     * @param valor Valor a comparar
     * @return retorna si se pudo añadir
     */
    private boolean add2(Node<T> nodo, T valor) {
        int cmp = valor.compareTo(nodo.data);
        if (cmp < 0) {
            if (nodo.left == null) {
                nodo.left = new Node<>(valor);
                return true;
            }
            return add2(nodo.left, valor);
        }
        else if (cmp > 0) {
            if (nodo.right == null) {
                nodo.right = new Node<>(valor);
                return true;
            }
            return add2(nodo.right, valor);
        }
        else {
            // cmp == 0 → duplicado, no insertar
            return false;
        }
    }

    // Elimina un valor del árbol
    // Retorna true si se eliminó (existía), false si no se encontró
    /**
     * Elimina un valor del árbol.
     * @param valor dato a eliminar
     * @return true si se eliminó, false si no existía
     */
    public boolean delete(T valor) {
        // Usamos un array para poder mutar el valor dentro de delete2
        boolean[] deleted = { false };
        root = delete2(root, valor, deleted);
        if (deleted[0]) size--;
        return deleted[0];
    }

    /**
     * Recursivo que elimina el valor de la subrama y retorna su nueva raíz.
     * Además, marca `deleted = true` si encuentra y borra el nodo.
     */
    private Node<T> delete2(Node<T> nodo, T valor, boolean[] deleted) {
        if (nodo == null) return null;
        int cmp = valor.compareTo(nodo.data);
        if      (cmp < 0) nodo.left  = delete2(nodo.left,  valor, deleted);
        else if (cmp > 0) nodo.right = delete2(nodo.right, valor, deleted);
        else {
            deleted[0] = true;  // marcamos que sí se eliminó
            if (nodo.left == null)  return nodo.right;
            if (nodo.right == null) return nodo.left;
            // Dos hijos: reemplazo por sucesor
            Node<T> succ = nodo.right;
            while (succ.left != null) succ = succ.left;
            nodo.data = succ.data;
            nodo.right = delete2(nodo.right, succ.data, deleted);
        }
        return nodo;
    }


    /**
     * Busca un nodo que contenga el valor dado.
     * @param valor el dato a buscar
     * @return el Node que contiene el valor, o null si no se encuentra
     */
    public Node<T> search(T valor) {
        return search2(root, valor);
    }

    /**
     * Recursivo que recorre el subárbol para encontrar el valor.
     * @param nodo raíz de la subrama actual
     * @param valor dato a buscar
     * @return el Node que lo contiene, o null si no existe en esta rama
     */
    private Node<T> search2(Node<T> nodo, T valor) {
        if (nodo == null) {
            return null;                  // no encontrado
        }
        int cmp = valor.compareTo(nodo.data);
        if (cmp == 0) {
            return nodo;                 // encontrado
        }
        else if (cmp < 0) {
            return search2(nodo.left, valor);   // buscar en izquierda
        }
        else {
            return search2(nodo.right, valor);  // buscar en derecha
        }
    }

    /**
     * Calcula la altura del árbol.
     * @return altura del árbol (0 si está vacío)
     */
    public int height() {
        return height2(root);
    }

    /**
     * Método recursivo que calcula la altura de un subárbol.
     * @param nodo raíz del subárbol
     * @return altura del subárbol
     */
    private int height2(Node<T> nodo) {
        if (nodo == null) return 0;
        int leftHeight = height2(nodo.left);
        int rightHeight = height2(nodo.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Devuelve el número de elementos en el árbol
    public int size() {
        // lógica omitida
        return size;
    }

    /**
     * Recorre el árbol en inorden (izquierda → raíz → derecha).
     */
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node<T> node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);            // Recorrer subárbol izquierdo
        System.out.println(node.data); // Procesar el nodo
        inOrder(node.right);           // Recorrer subárbol derecho
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node<T> node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data); // Procesar el nodo
        preOrder(node.left);           // Recorrer subárbol izquierdo
        preOrder(node.right);          // Recorrer subárbol derecho
    }

    /**
     * Recorre el árbol en postorden (izquierda → derecha → raíz).
     */
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node<T> node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);           // Recorrer subárbol izquierdo
        postOrder(node.right);          // Recorrer subárbol derecho
        System.out.println(node.data);  // Procesar el nodo
    }

    /**
     * Retorna el valor mínimo del árbol.
     * @return el dato más pequeño, o null si está vacío
     */
    public T min() {
        if (root == null) {
            return null;  // árbol vacío
        }
        Node<T> curr = root;
        while (curr.left != null) {
            curr = curr.left;  // desciende a la izquierda hasta la hoja más izquierda
        }
        return curr.data;
    }


    // Encuentra el máximo valor en el árbol
    // Retorna el data máximo, o null si está vacío
    public T max() {
        // lógica omitida
        if (root == null) {
            return null;
        }
        Node<T> curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        return curr.data;
    }

    /**
     * Limpia todo el árbol, dejándolo vacío.
     */
    public void clean() {
        root = null;
        size = 0;
    }

    // Verifica si el árbol está vacío
    // Retorna true si no contiene elementos
    public boolean isEmpty() {
        // lógica omitida
        return root == null;
    }
    
    //GETTERS SETTERS

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
}