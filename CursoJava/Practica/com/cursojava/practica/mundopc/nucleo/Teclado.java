package com.cursojava.practica.mundopc.nucleo;

public class Teclado extends DispositivoEntrada {

	private final short id;
	private static short contadorInstacias;
	
	public Teclado(String tipoEntrada, String marca, int precio) {
		super(tipoEntrada, marca, precio);
		id = ++contadorInstacias;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Teclado [Id = " + id + ", " + super.toString() + "]";
	}
	
	
}
