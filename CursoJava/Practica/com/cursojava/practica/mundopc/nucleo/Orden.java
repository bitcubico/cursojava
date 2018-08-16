package com.cursojava.practica.mundopc.nucleo;

public class Orden {
	private final short id;
	private final Computadora[] computadoras;
	private short contadorComputadoras;
	private static short contadorInstacias;
	private static final short limiteComputadorasPorOrden = 10;

	/**
	 * Constructor
	 */
	public Orden() {
		super();
		id = ++contadorInstacias;
		computadoras = new Computadora[limiteComputadorasPorOrden];
	}

	public void agregarComputadora(Computadora computadora) {
		if (computadora != null && contadorComputadoras < limiteComputadorasPorOrden)
			computadoras[contadorComputadoras++] = computadora;
		else
			System.out
					.println(computadora != null
							? "Se ha superado el máximo de computadoras (" + limiteComputadorasPorOrden
									+ ") permitidos por orden"
							: "La computadora que intenta agregar es null");
	}

	public int calcularTotal() {
		int total = 0;
		for (int i = 0; i < contadorComputadoras; i++)
			total += computadoras[i].CalcularCostoTotal();

		return total;
	}

	public void imprimirOrden() {
		String inicio = "**************** INICIO --->";
		String fin = "**************** FIN <---";
		String separador = "|--> ";
		String tabulador = "\t";
		String saltoLinea = "\n";

		StringBuilder sb = new StringBuilder(inicio).append(saltoLinea);
		sb.append(separador).append("Orden #").append(id).append(saltoLinea);
		sb.append(separador).append("Total a pagar: $").append(calcularTotal()).append(saltoLinea);
		sb.append(separador).append("Computadores en la orden:").append(saltoLinea);
		
		for (int i = 0; i < contadorComputadoras; i++) {
			Computadora computadora = computadoras[i];
			sb.append(separador).append("Modelo : ").append(computadora.getModelo());
			sb.append(tabulador).append(tabulador);
			sb.append("$ ").append(computadora.CalcularCostoTotal()).append(saltoLinea);
		}

		sb.append(fin).append(saltoLinea);
		System.out.println(sb.toString());
	}
}
