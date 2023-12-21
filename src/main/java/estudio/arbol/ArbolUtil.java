package main.java.estudio.arbol;

public class ArbolUtil {
	
	public static void execute() {
        System.out.println("\n\n------Árbol------\n\n");

        Arbol arbol = new Arbol();

        // Agregar elementos al árbol
        arbol.agregarElemento(50);
        arbol.agregarElemento(30);
        arbol.agregarElemento(70);
        arbol.agregarElemento(20);
        arbol.agregarElemento(40);
        arbol.agregarElemento(60);
        arbol.agregarElemento(80);

        // Iterar e imprimir el árbol
        arbol.iterarArbol();

        // Buscar un elemento en el árbol
        int elementoBuscar = 40;
        System.out.println("\n¿El elemento " + elementoBuscar + " está en el árbol?: " + arbol.buscarElemento(elementoBuscar));

        // Eliminar un elemento del árbol
        int elementoEliminar = 30;
        arbol.eliminarElemento(elementoEliminar);

        // Iterar e imprimir el árbol después de la eliminación
        arbol.iterarArbol();
	}

}
