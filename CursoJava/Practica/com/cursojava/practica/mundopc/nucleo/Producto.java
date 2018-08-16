package com.cursojava.practica.mundopc.nucleo;

public abstract class Producto {
	private String marca;
	private int precio;

	/**
	 * @param marca
	 * @param precio
	 */
	public Producto(String marca, int precio) {
		super();
		setMarca(marca);
		setPrecio(precio);
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca
	 *            the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca.trim();
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio
	 *            the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Marca = " + marca + ", Precio = $" + precio;
	}
}
