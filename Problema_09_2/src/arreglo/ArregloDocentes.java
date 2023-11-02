package arreglo;

import java.util.ArrayList;
import clase.Docente;

public class ArregloDocentes {
	// Atributo privado
	private ArrayList<Docente> doc;

	// Un constructor que cree el ArrayList y adicione las DirMem de ocho objetos
	// Docente.
	public ArregloDocentes() {
		doc = new ArrayList<Docente>();
		doc.add(new Docente(1001, 21, "Pedro", 21.5));
		doc.add(new Docente(1002, 22, "Juan", 22.5));
		doc.add(new Docente(1003, 23, "Jorge", 23.5));
		doc.add(new Docente(1004, 24, "Rodrigo", 24.5));
		doc.add(new Docente(1005, 25, "Camilo", 25.5));
		doc.add(new Docente(1006, 26, "Cesar", 26.5));
		doc.add(new Docente(1007, 27, "Tomas", 27.5));
		doc.add(new Docente(1008, 28, "Raúl", 28.5));
	}

	// Operaciones p�blicas b�sicas

	// Método adicionar que recibe la DirMem de un nuevo
	// docente y lo adicione al ArrayList.
	public void adicionar(Docente x) {
		doc.add(x);
	}

	// Método tamanio que retorne la cantidad de objetos
	// Docente registrados hasta ese momento.
	public int tamanio() {
		return doc.size();
	}

	// Método obtener que reciba una posición y retorne
	// la DirMem del objeto Docente respectivo.
	public Docente obtener(int i) {
		return doc.get(i);
	}

	// Métodos complementarios

	// Retorne el sueldo promedio.
	public double sueldoPromedio() {
		double suma = 0;
		for (int i = 0; i < tamanio(); i++) {
			suma += obtener(i).sueldo();
		}
		return suma / tamanio();
	}

	// Retorne el sueldo mayor.
	public double sueldoMayor() {
		double mayor = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).sueldo() > mayor) {
				mayor = obtener(i).sueldo();
			}
		}
		return mayor;
	}

	// Retorne el sueldo menor.
	public double sueldoMenor() {
		double menor = obtener(0).sueldo();
		for (int i = 1; i < tamanio(); i++) {
			if (menor > obtener(i).sueldo()) {
				menor = obtener(i).sueldo();
			}
		}
		return menor;
	}

	// Retorne la tarifa mayor.
	public double tarifaMayor() {
		double mayor = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (mayor < obtener(i).getTarifa()) {
				mayor = obtener(i).getTarifa();
			}
		}
		return mayor;

	}

	// Retorne la tarifa menor.
	public double tarifaMenor() {
		double menor = obtener(0).getTarifa();
		for (int i = 1; i < tamanio(); i++) {
			if (menor > obtener(i).getTarifa()) {
				menor = obtener(i).getTarifa();
			}
		}
		return menor;

	}
}
