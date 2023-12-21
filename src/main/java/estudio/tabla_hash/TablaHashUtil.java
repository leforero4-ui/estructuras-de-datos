package main.java.estudio.tabla_hash;

public class TablaHashUtil {
	
	public static void execute() {
        System.out.println("\n\n------Tabla Hash------\n\n");

        TablaHash<String, Integer> tablaHash = new TablaHash<>();

        // Agregar elementos a la tabla hash
        tablaHash.agregar("uno", 1);
        tablaHash.agregar("dos", 2);
        tablaHash.agregar("tres", 3);

        // Iterar e imprimir la tabla hash
        System.out.println("Iteración:");
        System.out.println("uno: " + tablaHash.obtener("uno"));
        System.out.println("dos: " + tablaHash.obtener("dos"));
        System.out.println("tres: " + tablaHash.obtener("tres"));

        // Actualizar un elemento en la tabla hash
        tablaHash.actualizar("dos", 20);

        // Iterar e imprimir la tabla hash después de la actualización
        System.out.println("\nDespués de la actualización:");
        System.out.println("uno: " + tablaHash.obtener("uno"));
        System.out.println("dos: " + tablaHash.obtener("dos"));
        System.out.println("tres: " + tablaHash.obtener("tres"));

        // Eliminar un elemento de la tabla hash
        tablaHash.eliminar("dos");

        // Iterar e imprimir la tabla hash después de la eliminación
        System.out.println("\nDespués de la eliminación:");
        System.out.println("uno: " + tablaHash.obtener("uno"));
        System.out.println("dos: " + tablaHash.obtener("dos"));
        System.out.println("tres: " + tablaHash.obtener("tres"));
	}

}
