package main.java.estudio.array;

public class ArrayUtil {
	
	public static void execute() {
        System.out.println("\n\n------Array------\n\n");
        
        // Declarar e inicializar un arreglo de enteros
        int[] arreglo = {1, 2, 3, 4, 5};

        // Iterar sobre el arreglo e imprimir cada elemento
        System.out.println("Iteración:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        // Agregar un nuevo elemento al final del arreglo
        int nuevoElemento = 6;
        int[] nuevoArreglo = new int[arreglo.length + 1];
        for (int i = 0; i < arreglo.length; i++) {
            nuevoArreglo[i] = arreglo[i];
        }
        nuevoArreglo[arreglo.length] = nuevoElemento;
        arreglo = nuevoArreglo;

        // Imprimir el arreglo después de agregar un elemento
        System.out.println("\nDespués de agregar:");
        for (int elemento : arreglo) {
            System.out.println(elemento);
        }

        // Actualizar un elemento en el arreglo
        int indiceActualizar = 2;
        int nuevoValor = 10;
        arreglo[indiceActualizar] = nuevoValor;

        // Imprimir el arreglo después de actualizar un elemento
        System.out.println("\nDespués de actualizar:");
        for (int elemento : arreglo) {
            System.out.println(elemento);
        }

        // Eliminar un elemento del arreglo
        int indiceEliminar = 1;
        int[] nuevoArregloEliminar = new int[arreglo.length - 1];
        for (int i = 0, j = 0; i < arreglo.length; i++) {
            if (i != indiceEliminar) {
                nuevoArregloEliminar[j++] = arreglo[i];
            }
        }
        arreglo = nuevoArregloEliminar;

        // Imprimir el arreglo después de eliminar un elemento
        System.out.println("\nDespués de eliminar:");
        for (int elemento : arreglo) {
            System.out.println(elemento);
        }
	}

}
