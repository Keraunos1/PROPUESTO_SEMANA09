package arreglo;

import java.util.ArrayList;

import clase.Factura;

public class ArregloFacturas {
	// Atributo privado
	private ArrayList<Factura> fac;

	// Un constructor que cree el ArrayList y adicione las DirMem
	// de ocho objetos Factura.
	public ArregloFacturas() {
		fac = new ArrayList<Factura>();
		fac.add(new Factura("0001", "Empresa1", 5, 2.5));
		fac.add(new Factura("0002", "Empresa2", 5, 2.6));
		fac.add(new Factura("0003", "Empresa3", 5, 2.7));
		fac.add(new Factura("0004", "Empresa4", 5, 2.8));
		fac.add(new Factura("0005", "Empresa5", 5, 2.9));
		fac.add(new Factura("0006", "Empresa6", 5, 3.0));
		fac.add(new Factura("0007", "Empresa7", 5, 3.1));
		fac.add(new Factura("0008", "Empresa8", 5, 3.2));
	}

	// Método adicionar que recibe la DirMem de una nueva factura
	// y la adiciona al ArrayList.
	public void adicionar(Factura x) {
		fac.add(x);
	}

	// Método tamanio que retorne la cantidad de objetos Factura
	// registrados hasta ese momento.
	public int tamanio() {
		return fac.size();
	}

	// Método obtener que reciba una posición y retorne la DirMem
	// del objeto Factura respectivo
	public Factura obtener(int i) {
		return fac.get(i);
	}
	// Métodos complementarios

	// Retorne suma de todos los importes facturados.
	public double sumaImportes() {
		double suma = 0;
		for (int i = 0; i < tamanio(); i++) {
			suma += fac.get(i).importeFacturado();
		}
		return suma;
	}

	// Retorne importe promedio facturado.
	public double importePromedioFacturado() {
		double promedio = 0;
		for (int i = 0; i < tamanio();i++) {
			promedio += obtener(i).importeFacturado();
		}
		return promedio / tamanio();
	}

	// Retorne menor importe facturado.
	public double menorImporteFacturado() {
		double menor = obtener(0).importeFacturado();
		for (int i = 1; i < tamanio();i++) {
			if (menor > obtener(i).importeFacturado()) {
				menor = obtener(i).importeFacturado();
			}
		}
		return menor;
	}

	// Retorne mayor importe facturado.
	public double mayorImporteFacturado() {
		double mayor = 0;
		for (int i = 0; i < tamanio();i++) {
			if (mayor < obtener(i).importeFacturado()) {
				mayor = obtener(i).importeFacturado();
			}
		}
		return mayor;
	}

	// Retorne nombre de la primera empresa cuyo importe
	// facturado sea menor al importe promedio facturado.
	public String empresaMenorAlimportePromedioFac() {
		double promedio = importePromedioFacturado();
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).importeFacturado() < promedio) {
				 return obtener(i).getEmpresa();
			}
		}
		return "No se encontro ninguna empresa" ;
	}

}
