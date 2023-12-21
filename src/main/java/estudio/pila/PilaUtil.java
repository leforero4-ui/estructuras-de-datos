package main.java.estudio.pila;

public class PilaUtil {
	
	public static void execute() {
        System.out.println("\n\n------Pila------\n\n");

        Pila pila = new Pila();

        // Agregar elementos a la pila
        pila.push(1);
        pila.push(2);
        pila.push(3);

        // Iterar e imprimir la pila
        pila.iterarPila();

        // Actualizar el elemento en la cima de la pila
        pila.actualizarElementoEnCima(10);

        // Iterar e imprimir la pila después de la actualización
        pila.iterarPila();

        // Eliminar el elemento en la cima de la pila
        pila.pop();

        // Iterar e imprimir la pila después de la eliminación
        pila.iterarPila();
	}

}
