/**
 * Derechos reservados a bitcubico.com
 */
package com.cursojava.teoria;

/**
 * Esta clase describe los elementos básicos para la conformacióde una
 * enumerción de meses
 * 
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
public enum MesesEnum {
	ENERO(31),
	FEBRERO(28),
	MARZO(31),
	ABRIL(30),
	MAYO(31),
	JUNIO(30),
	JULIO(31),
	AGOSTO(31),
	SEPTIEMBRE(30),
	OCTUBRE(31),
	NOVIEMBRE(30),
	DICIEMBRE(31);
	
	/**
	 * Atributo usado para almacenar los días de cada més
	 */
	private final int totalDias;
	
	/**
	 * Constructor de cada elemento de la enumeración
	 * @param totalDias Total días que tiene el mes
	 */
	MesesEnum (int totalDias) {
		this.totalDias = totalDias;
	}

	/**
	 * @return La totalidad de días que tiene el mes
	 */
	public int getTotalDias() {
		return totalDias;
	}
}
