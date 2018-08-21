/**
 * Derechos reservados a bitcubico.com
 */
package com.cursojava.practica.mundopc.nucleo;

/**
 * Esta clase abstracta describe los elementos básicos para la conformación de
 * un producto
 * 
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
public abstract class Producto {
	private String marca;
	private int precio;

	/**
	 * Constructor para inicializar los atributos requeridos para el funcionamiento
	 * de la clase
	 * 
	 * @param marca
	 *            Marca del producto
	 * @param precio
	 *            Precio del producto
	 */
	public Producto(String marca, int precio) {
		super();
		setMarca(marca);
		setPrecio(precio);
	}

	/**
	 * Indica la marca del producto
	 * 
	 * @return String La marca del producto
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Asigna la marca del producto
	 * 
	 * @param marca
	 *            La marca del producto
	 */
	public void setMarca(String marca) {
		this.marca = marca.trim();
	}

	/**
	 * Asigna el precio del producto
	 * 
	 * @return String El precio del producto
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Indica el precio del producto
	 * 
	 * @param precio
	 *            El precio del producto
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
