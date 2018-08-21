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
public class Teclado extends DispositivoEntrada {

	private final short id;
	private static short contadorInstacias;
	
	/**
	 * Constructor para inicializar los atributos requeridos para el funcionamiento
	 * de la clase
	 * 
	 * @param tipoEntrada
	 *            Tipo de entrada del teclado
	 * @param marca
	 *            Marca del teclado
	 * @param precio
	 *            Precio del teclado
	 */
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
