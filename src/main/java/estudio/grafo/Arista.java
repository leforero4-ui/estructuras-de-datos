package main.java.estudio.grafo;

public class Arista {
    int destino;
    int peso;
    Arista siguiente;

    public Arista(int destino, int peso) {
        this.destino = destino;
        this.peso = peso;
        this.siguiente = null;
    }

}
