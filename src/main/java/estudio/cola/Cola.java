package main.java.estudio.cola;

public class Cola {
    private static final int CAPACIDAD_MAXIMA = 100;
    private int[] elementos;
    private int frente, fin, tamanio;

    public Cola() {
        elementos = new int[CAPACIDAD_MAXIMA];
        frente = 0;
        fin = -1;
        tamanio = 0;
    }

    // Método para agregar un elemento al final de la cola
    public void enqueue(int elemento) {
        if (tamanio == CAPACIDAD_MAXIMA) {
            System.out.println("La cola está llena. No se puede agregar más elementos.");
            return;
        }

        fin = (fin + 1) % CAPACIDAD_MAXIMA;
        elementos[fin] = elemento;
        tamanio++;
    }

    // Método para eliminar y obtener el elemento en el frente de la cola
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("La cola está vacía. No se puede eliminar ningún elemento.");
            return -1; // Valor sentinela o manejo de errores según tu necesidad
        }

        int elementoEliminado = elementos[frente];
        frente = (frente + 1) % CAPACIDAD_MAXIMA;
        tamanio--;
        return elementoEliminado;
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return tamanio == 0;
    }

    // Método para iterar e imprimir los elementos de la cola
    public void iterarCola() {
        System.out.println("Iteración:");
        for (int i = 0; i < tamanio; i++) {
            int indice = (frente + i) % CAPACIDAD_MAXIMA;
            System.out.println(elementos[indice]);
        }
    }

}
