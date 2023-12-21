package main.java.estudio.grafo;

public class GrafoUtil {
	
	public static void execute() {
        System.out.println("\n\n------Grafo------\n\n");

        Grafo grafo = new Grafo(4);

        // Agregar aristas ponderadas al grafo
        grafo.agregarArista(0, 1, 3);
        grafo.agregarArista(1, 2, 5);
        grafo.agregarArista(2, 3, 2);
        grafo.agregarArista(3, 0, 1);

        // Iterar e imprimir el grafo
        grafo.iterarGrafo();

        // Eliminar una arista del grafo
        grafo.eliminarArista(1, 2);

        // Iterar e imprimir el grafo después de la eliminación
        grafo.iterarGrafo();
	}

}
