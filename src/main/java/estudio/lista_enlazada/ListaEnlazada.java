package main.java.estudio.lista_enlazada;

public class ListaEnlazada {
    Nodo cabeza;

    // Método para agregar un nuevo nodo al final de la lista
    public void agregarElemento(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    // Método para iterar e imprimir los elementos de la lista
    public void iterarLista() {
        Nodo actual = cabeza;
        System.out.println("Iteración:");
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    // Método para actualizar un nodo en la lista
    public void actualizarElemento(int indice, int nuevoValor) {
        Nodo actual = cabeza;
        int contador = 0;
        while (actual != null) {
            if (contador == indice) {
                actual.dato = nuevoValor;
                break;
            }
            actual = actual.siguiente;
            contador++;
        }
    }

    // Método para eliminar un nodo de la lista
    public void eliminarElemento(int indice) {
        if (indice == 0) {
            cabeza = cabeza.siguiente;
        } else {
            Nodo actual = cabeza;
            int contador = 0;
            while (actual != null) {
                if (contador == indice - 1) {
                    actual.siguiente = actual.siguiente.siguiente;
                    break;
                }
                actual = actual.siguiente;
                contador++;
            }
        }
    }

}
