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
	 * @param nombre
	 * @param precio
	 */
	public Producto(String nombre, double precio) {
		this();
		this.nombre = nombre;
		this.precio = precio;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre.trim();
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio
	 *            the precio to set
	 */
	public void setPrecio(double precion) {
		if (precio > 0)
			this.precio = precion;
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
