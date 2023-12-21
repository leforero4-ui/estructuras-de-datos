package main.java.estudio.tabla_hash;

public class TablaHash<K, V> {
    private static final int TAMANO_INICIAL = 10;
    private Pareja<K, V>[] tabla;
    private int tamanio;

    public TablaHash() {
        tabla = new Pareja[TAMANO_INICIAL];
        tamanio = 0;
    }

    // Método para obtener el índice correspondiente a una clave
    private int obtenerIndice(K clave) {
        int codigoHash = clave.hashCode();
        return Math.abs(codigoHash % tabla.length);
    }

    // Método para agregar una pareja clave-valor a la tabla
    public void agregar(K clave, V valor) {
        int indice = obtenerIndice(clave);

        if (tabla[indice] == null) {
            tabla[indice] = new Pareja<>(clave, valor);
        } else {
            Pareja<K, V> actual = tabla[indice];
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = new Pareja<>(clave, valor);
        }

        tamanio++;

        // Rehash si la carga supera cierto umbral
        if ((1.0 * tamanio) / tabla.length > 0.75) {
            rehash();
        }
    }

    // Método para obtener el valor asociado a una clave
    public V obtener(K clave) {
        int indice = obtenerIndice(clave);
        Pareja<K, V> actual = tabla[indice];

        while (actual != null) {
            if (actual.clave.equals(clave)) {
                return actual.valor;
            }
            actual = actual.siguiente;
        }

        return null;
    }

    // Método para actualizar el valor asociado a una clave
    public void actualizar(K clave, V nuevoValor) {
        int indice = obtenerIndice(clave);
        Pareja<K, V> actual = tabla[indice];

        while (actual != null) {
            if (actual.clave.equals(clave)) {
                actual.valor = nuevoValor;
                return;
            }
            actual = actual.siguiente;
        }
    }

    // Método para eliminar una pareja clave-valor de la tabla
    public void eliminar(K clave) {
        int indice = obtenerIndice(clave);
        Pareja<K, V> actual = tabla[indice];
        Pareja<K, V> anterior = null;

        while (actual != null) {
            if (actual.clave.equals(clave)) {
                if (anterior == null) {
                    tabla[indice] = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
                tamanio--;
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
    }

    // Método para realizar rehash cuando la carga excede el umbral
    private void rehash() {
        int nuevoTamanio = tabla.length * 2;
        Pareja<K, V>[] nuevaTabla = new Pareja[nuevoTamanio];

        for (Pareja<K, V> actual : tabla) {
            while (actual != null) {
                int nuevoIndice = actual.clave.hashCode() % nuevoTamanio;

                if (nuevaTabla[nuevoIndice] == null) {
                    nuevaTabla[nuevoIndice] = new Pareja<>(actual.clave, actual.valor);
                } else {
                    Pareja<K, V> nuevaActual = nuevaTabla[nuevoIndice];
                    while (nuevaActual.siguiente != null) {
                        nuevaActual = nuevaActual.siguiente;
                    }
                    nuevaActual.siguiente = new Pareja<>(actual.clave, actual.valor);
                }

                actual = actual.siguiente;
            }
        }

        tabla = nuevaTabla;
    }

}
