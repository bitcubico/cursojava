/**
 * Derechos reservados a bitcubico.com
 */
package com.cursojava.practica.mundopc.nucleo;

/**
 * Esta clase describe los elementos b�sicos para la conformaci�n de un
 * rat�n o mouse
 * 
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
public class Raton extends DispositivoEntrada {

	private final short id;
	private static short contadorInstacias;
	
	/**
	 * Constructor para inicializar los atributos requeridos para el funcionamiento
	 * de la clase
	 * 
	 * @param tipoEntrada
	 *            Tipo de entrada del rat�n
	 * @param marca
	 *            Marca del rat�n
	 * @param precio
	 *            Precio del rat�n
	 */
	public Raton(String tipoEntrada, String marca, int precio) {
		super(tipoEntrada, marca, precio);
		id = ++contadorInstacias;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Raton [Id = " + id + ", " + super.toString() + "]";
	}
	
	
}
