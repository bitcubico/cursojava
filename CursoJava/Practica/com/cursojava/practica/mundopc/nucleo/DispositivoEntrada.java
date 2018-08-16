package com.cursojava.practica.mundopc.nucleo;

public abstract class DispositivoEntrada extends Producto {
	private String tipoEntrada;

	public DispositivoEntrada(String tipoEntrada, String marca, int precio) {
		super(marca, precio);
		setTipoEntrada(tipoEntrada);
	}

	/**
	 * @return the tipoEntrada
	 */
	public String getTipoEntrada() {
		return tipoEntrada;
	}

	/**
	 * @param tipoEntrada
	 *            the tipoEntrada to set
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
