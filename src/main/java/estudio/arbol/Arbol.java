package main.java.estudio.arbol;

public class Arbol {
    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    // Método para agregar un nuevo nodo al árbol
    public void agregarElemento(int valor) {
        raiz = agregarRecursivo(raiz, valor);
    }

    private Nodo agregarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierda = agregarRecursivo(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = agregarRecursivo(nodo.derecha, valor);
        }

        return nodo;
    }

    // Método para iterar e imprimir los elementos del árbol (recorrido inorden)
    public void iterarArbol() {
        System.out.println("Iteración (inorden):");
        inordenRecursivo(raiz);
    }

    private void inordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            inordenRecursivo(nodo.izquierda);
            System.out.println(nodo.valor);
            inordenRecursivo(nodo.derecha);
        }
    }

    // Método para buscar un elemento en el árbol
    public boolean buscarElemento(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return false;
        }

        if (valor == nodo.valor) {
            return true;
        } else if (valor < nodo.valor) {
            return buscarRecursivo(nodo.izquierda, valor);
        } else {
            return buscarRecursivo(nodo.derecha, valor);
        }
    }

    // Método para eliminar un elemento del árbol
    public void eliminarElemento(int valor) {
        raiz = eliminarRecursivo(raiz, valor);
    }

    private Nodo eliminarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return nodo;
        }

        if (valor < nodo.valor) {
            nodo.izquierda = eliminarRecursivo(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = eliminarRecursivo(nodo.derecha, valor);
        } else {
            // Nodo con un solo hijo o sin hijos
            if (nodo.izquierda == null) {
                return nodo.derecha;
            } else if (nodo.derecha == null) {
                return nodo.izquierda;
            }

            // Nodo con dos hijos, obtener sucesor inorden (menor valor en el subárbol derecho)
            nodo.valor = obtenerMenorValor(nodo.derecha);

            // Eliminar el sucesor inorden
            nodo.derecha = eliminarRecursivo(nodo.derecha, nodo.valor);
        }

        return nodo;
    }

    private int obtenerMenorValor(Nodo nodo) {
        int menorValor = nodo.valor;
        while (nodo.izquierda != null) {
            menorValor = nodo.izquierda.valor;
            nodo = nodo.izquierda;
        }
        return menorValor;
    }

}
