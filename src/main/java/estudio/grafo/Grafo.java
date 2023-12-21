package main.java.estudio.grafo;

public class Grafo {
    private Nodo[] nodos;

    public Grafo(int cantidadNodos) {
        nodos = new Nodo[cantidadNodos];
        for (int i = 0; i < cantidadNodos; i++) {
            nodos[i] = new Nodo(i);
        }
    }

    // Método para agregar una arista ponderada al grafo
    public void agregarArista(int origen, int destino, int peso) {
        if (origen >= 0 && origen < nodos.length && destino >= 0 && destino < nodos.length) {
            nodos[origen].aristas.agregarArista(destino, peso);
        } else {
            System.out.println("Nodos de origen o destino fuera de rango.");
        }
    }

    // Método para iterar e imprimir los nodos y aristas del grafo
    public void iterarGrafo() {
        System.out.println("Iteración:");
        for (Nodo nodo : nodos) {
            System.out.print("Nodo " + nodo.valor + ": ");
            Arista actual = nodo.aristas.cabeza;
            while (actual != null) {
                System.out.print("(" + actual.destino + ", " + actual.peso + ") ");
                actual = actual.siguiente;
            }
            System.out.println();
        }
    }

    // Método para eliminar una arista del grafo
    public void eliminarArista(int origen, int destino) {
        if (origen >= 0 && origen < nodos.length && destino >= 0 && destino < nodos.length) {
            nodos[origen].aristas.eliminarArista(destino);
        } else {
            System.out.println("Nodos de origen o destino fuera de rango.");
        }
    }

}
