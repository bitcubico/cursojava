/**
 * Derechos reservados a bitcubico.com
 */
package com.cursojava.practica.mundopc.nucleo;

/**
 * Esta clase describe los elementos básicos para la conformación de un
 * teclado
 * 
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
public class Monitor extends Producto {
	private final short id;
	private short tamanio;
	private static short contadorInstancias;

	/**
	 * Constructor para inicializar los atributos requeridos para el funcionamiento
	 * de la clase
	 * 
	 * @param marca
	 *            Marca del monitor
	 * @param precio
	 *            Precio del monitor
	 * @param tamanio
	 * 			  Tamaño del monitor
	 */
	public Monitor(String marca, int precio, short tamanio) {
		super(marca, precio);
		id = ++contadorInstancias;
		setTamanio(tamanio);
	}

	/**
	 * Indica el tamaño del monitor
	 * 
	 * @return short El tama�o del monitor
	 */
	public short getTamanio() {
		return tamanio;
	}

	/**
	 * Asigna el tamaño del monitor
	 * 
	 * @param tamanio
	 *            El tamaño del monitor
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
