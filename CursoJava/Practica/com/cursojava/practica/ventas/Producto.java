package com.cursojava.practica.ventas;

public class Producto implements AutoCloseable {
	private final int idProducto;
	private String nombre;
	private double precio;
	private static int contadorProductos;

	/**
	 * Constructor
	 */
	private Producto() {
		super();
		idProducto = ++contadorProductos;
	}

	/**
	 * Constructor para inicializar los atributos requeridos para el funcionamiento
	 * de la clase
	 * 
	 * @param nombre
	 *            Nombre del producto
	 * @param precio
	 *            Precio del producto
	 */
	public Producto(String nombre, double precio) {
		this();
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * Indica el nombre del producto
	 * 
	 * @return String El nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna el nombre del producto
	 * 
	 * @param nombre
	 *            El nombre del producto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre.trim();
	}

	/**
	 * Indica el precio del producto
	 * @return El precio del producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Asigna el precio del producto
	 * 
	 * @param precio
	 *            El precio del producto
	 */
	public void setPrecio(double precio) {
		if (precio > 0)
			this.precio = precio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Producto [idProducto # " + idProducto + ", Nombre = " + nombre + ", Precio = $" + precio + "]";
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub

	}
}
