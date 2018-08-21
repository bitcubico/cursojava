/**
 * Derechos reservados a bitcubico.com
 */
package com.cursojava.practica.mundopc.nucleo;

/**
 * Esta clase abstracta describe los elementos básicos de un dispositivo
 * tecnológico de entrada
 * 
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
public abstract class DispositivoEntrada extends Producto {
	private String tipoEntrada;

	/**
	 * Constructor para inicializar los atributos requeridos para el funcionamiento
	 * de la clase
	 * 
	 * @param tipoEntrada Tipo de entrada del dispositivo (USB, HDMI, BLUETHOO, ETC)
	 * @param marca Marca del dispositivo
	 * @param precio Precio del dispositivo
	 */
	public DispositivoEntrada(String tipoEntrada, String marca, int precio) {
		super(marca, precio);
		setTipoEntrada(tipoEntrada);
	}

	/**
	 * Indica el tipo de entrada del dispositivo
	 * 
	 * @return String Tipo de entrada
	 */
	public String getTipoEntrada() {
		return tipoEntrada;
	}

	/**
	 * Asigna el tipo de entrada del dispositivo
	 * 
	 * @param tipoEntrada tipoEntrada de entrada del dispositivo (USB, HDMI, BLUETHOO, ETC)
	 */
	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada.trim();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + ", Tipo de entrada = " + tipoEntrada;
	}
}
