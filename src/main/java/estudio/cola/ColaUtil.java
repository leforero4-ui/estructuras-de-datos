package main.java.estudio.cola;

public class ColaUtil {
	
	public static void execute() {
        System.out.println("\n\n------Cola------\n\n");

        Cola cola = new Cola();

        // Agregar elementos a la cola
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);

        // Iterar e imprimir la cola
        cola.iterarCola();

        // Eliminar el primer elemento de la cola
        cola.dequeue();

        // Iterar e imprimir la cola después de la eliminación
        cola.iterarCola();
	}

}
