package main.java.estudio.pila;

import java.util.EmptyStackException;

public class Pila {
    private static final int CAPACIDAD_INICIAL = 5;
    private int[] elementos;
    private int tamanio;

    public Pila() {
        elementos = new int[CAPACIDAD_INICIAL];
        tamanio = 0;
    }

    // Método para agregar un elemento a la pila
    public void push(int elemento) {
        if (tamanio == elementos.length) {
            // Duplicar la capacidad si la pila está llena
            int[] nuevaArray = new int[elementos.length * 2];
            System.arraycopy(elementos, 0, nuevaArray, 0, tamanio);
            elementos = nuevaArray;
        }

        elementos[tamanio++] = elemento;
    }

    // Método para iterar e imprimir los elementos de la pila
    public void iterarPila() {
        System.out.println("Iteración:");
        for (int i = tamanio - 1; i >= 0; i--) {
            System.out.println(elementos[i]);
        }
    }

    // Método para actualizar el elemento en la cima de la pila
    public void actualizarElementoEnCima(int nuevoValor) {
        if (tamanio == 0) {
            throw new EmptyStackException();
        }

        elementos[tamanio - 1] = nuevoValor;
    }

    // Método para eliminar el elemento en la cima de la pila
    public void pop() {
        if (tamanio == 0) {
            throw new EmptyStackException();
        }

        tamanio--;

        // Opcional: reducir la capacidad si el tamaño es significativamente menor
        if (tamanio > 0 && tamanio == elementos.length / 4) {
            int[] nuevaArray = new int[elementos.length / 2];
            System.arraycopy(elementos, 0, nuevaArray, 0, tamanio);
            elementos = nuevaArray;
        }
    }

}
