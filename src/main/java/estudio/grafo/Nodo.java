package main.java.estudio.grafo;

public class Nodo {
    int valor;
    ListaAristas aristas;

    public Nodo(int valor) {
        this.valor = valor;
        this.aristas = new ListaAristas();
    }

}
