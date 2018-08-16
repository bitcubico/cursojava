package com.cursojava.practica.mundopc.nucleo;

public class Monitor extends Producto {
	private final short id;
	private short tamanio;
	private static short contadorInstancias;

	public Monitor(String marca, int precio, short tamanio) {
		super(marca, precio);
		id = ++contadorInstancias;
		setTamanio(tamanio);
	}

	/**
	 * @return the tamanio
	 */
	public short getTamanio() {
		return tamanio;
	}

	/**
	 * @param tamanio
	 *            the tamanio to set
	 */
	public void setTamanio(short tamanio) {
		this.tamanio = tamanio;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Monitor [Id = " + id + ", " + super.toString() + ", Tamaño = " + tamanio + "]";
	}
	
}
