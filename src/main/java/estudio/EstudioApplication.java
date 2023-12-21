package main.java.estudio;

import main.java.estudio.arbol.ArbolUtil;
import main.java.estudio.array.ArrayUtil;
import main.java.estudio.cola.ColaUtil;
import main.java.estudio.grafo.GrafoUtil;
import main.java.estudio.lista_enlazada.ListaEnlazadaUtil;
import main.java.estudio.pila.PilaUtil;
import main.java.estudio.tabla_hash.TablaHashUtil;

public class EstudioApplication {
	
	public static void main(String[] args) {
		ArrayUtil.execute();
		ListaEnlazadaUtil.execute();
		PilaUtil.execute();
		ColaUtil.execute();
		ArbolUtil.execute();
		GrafoUtil.execute();
		TablaHashUtil.execute();
	}
	
}
