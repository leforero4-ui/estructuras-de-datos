package main.java.estudio.tabla_hash;

public class Pareja<K, V> {
    K clave;
    V valor;
    Pareja<K, V> siguiente;

    public Pareja(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
        this.siguiente = null;
    }

}
