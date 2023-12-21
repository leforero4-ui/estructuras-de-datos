package main.java.estudio.grafo;

public class ListaAristas {
    Arista cabeza;

    public void agregarArista(int destino, int peso) {
        Arista nuevaArista = new Arista(destino, peso);
        nuevaArista.siguiente = cabeza;
        cabeza = nuevaArista;
    }

    public void eliminarArista(int destino) {
        if (cabeza != null) {
            if (cabeza.destino == destino) {
                cabeza = cabeza.siguiente;
                return;
            }

            Arista actual = cabeza;
            while (actual.siguiente != null && actual.siguiente.destino != destino) {
                actual = actual.siguiente;
            }

            if (actual.siguiente != null) {
                actual.siguiente = actual.siguiente.siguiente;
            }
        }
    }

}
