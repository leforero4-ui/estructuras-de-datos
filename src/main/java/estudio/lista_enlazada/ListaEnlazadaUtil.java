package main.java.estudio.lista_enlazada;

public class ListaEnlazadaUtil {
	
	public static void execute() {
        System.out.println("\n\n------Lista Enlazada------\n\n");
        
        ListaEnlazada lista = new ListaEnlazada();

        // Agregar elementos a la lista
        lista.agregarElemento(1);
        lista.agregarElemento(2);
        lista.agregarElemento(3);

        // Iterar e imprimir la lista
        lista.iterarLista();

        // Actualizar un elemento en la lista
        int indiceActualizar = 1;
        int nuevoValor = 10;
        lista.actualizarElemento(indiceActualizar, nuevoValor);

        // Iterar e imprimir la lista después de la actualización
        System.out.println("\nDespués de actualizar el elemento en el índice " + indiceActualizar + ":");
        lista.iterarLista();

        // Eliminar un elemento de la lista
        int indiceEliminar = 0;
        lista.eliminarElemento(indiceEliminar);

        // Iterar e imprimir la lista después de la eliminación
        System.out.println("\nDespués de eliminar el elemento en el índice " + indiceEliminar + ":");
        lista.iterarLista();
	}

}
