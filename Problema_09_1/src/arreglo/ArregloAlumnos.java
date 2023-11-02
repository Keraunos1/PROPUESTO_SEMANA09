package arreglo;

import java.util.ArrayList;

import clase.Alumno;

public class ArregloAlumnos {
	// Atributo privado
	private ArrayList<Alumno> alu;

	// Constructor
	public ArregloAlumnos() {
		alu = new ArrayList<Alumno>();
		adicionar(new Alumno(123, "Ana", 19, 15));
		adicionar(new Alumno(456, "Juan", 15, 14));
		adicionar(new Alumno(789, "Pedro", 17, 19));
		adicionar(new Alumno(302, "David", 13, 18));
		adicionar(new Alumno(417, "Carlos", 20, 19));
		adicionar(new Alumno(641, "Jorge", 12, 13));
		adicionar(new Alumno(208, "Mar�a", 15, 17));
		adicionar(new Alumno(820, "Jos�", 11, 10));
	}

	// Operaciones p�blicas b�sicas
	public void adicionar(Alumno x) {
		alu.add(x);
	}

	public int tamanio() {
		return alu.size();
	}

	public Alumno obtener(int i) {
		return alu.get(i);
	}

	// Operaciones p�blicas complementarias
	// Cantidad de alumnos aprobados (promedio mayor o igual a 13).
	public int cantAprobados() {
		int cantA = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).promedio() >= 13) {
				cantA++;
			}
		}
		return cantA;
	}

	// Cantidad de alumnos desaprobados (promedio menor a 13).
	public int cantDesaprobados() {
		int cantD = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).promedio() < 13) {
				cantD++;
			}
		}
		return cantD;
	}

	// Nombre del primer alumno desaprobado. En caso no exista retorne null.
	public String nombrePrimerDesaprobado() {
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).promedio() < 13) {
				return obtener(i).getNombre();
			}
		}
		return null;
	}

	// Nombre del último alumno aprobado. En caso no exista retorne null.
	public String nombreUltimoAprobado() {
		for (int i = tamanio() - 1; i >= 0; i--) {
			if (obtener(i).promedio() >= 13) {
				return obtener(i).getNombre();
			}
		}
		return null;
	}

	// Nombre del segundo alumno desaprobado. En caso no exista retorne null.
	public String nombreSegundoDesaprobado() {
		int cont = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).promedio() < 13) {
				cont++;
			}
			if (cont == 2) {
				return obtener(i).getNombre();
			}
		}
		return null;
	}

	// Nombre del penúltimo alumno aprobado. En caso no exista retorne null.
	public String nombrePenultimoAprobado() {
		int cont = 0;
		for (int i = tamanio() - 1; i >= 0; i--) {
			if (obtener(i).promedio() >= 13) {
				cont++;
			}
			if (cont == 2) {
				return obtener(i).getNombre();
			}
		}
		return null;
	}
}
