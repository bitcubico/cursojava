/**
 * Derechos reservados a bitcubico.com
 */
package com.cursojava.practica.mundopc.nucleo;

/**
 * Esta clase describe los elementos básicos para la conformación de una
 * computadora
 * 
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
public class Computadora {
	private final short id;
	private String modelo;
	private int precio;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static short contadorInstancias;

	/**
	 * Constructor para inicializar los atributos requeridos para el funcionamiento
	 * de la clase
	 * 
	 * @param modelo
	 *            Modelo de la computadora
	 * @param precio
	 *            Precio de la computadora
	 */
	public Computadora(String modelo, int precio) {
		super();
		id = ++contadorInstancias;
		this.modelo = modelo;
		this.precio = precio;
	}

	/**
	 * Calcula el costo total del equipo sumando el precio del monitor, raton,
	 * teclado y computadora
	 * 
	 * @return int Costo total del equipo
	 */
	public int CalcularCostoTotal() {
		int total = getPrecio();
		total += monitor != null ? monitor.getPrecio() : 0;
		total += teclado != null ? teclado.getPrecio() : 0;
		total += raton != null ? raton.getPrecio() : 0;

		return total;
	}

	/**
	 * Indica el modelo de la computadora
	 * 
	 * @return String El modelo de la computadora
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Asigna el modelo de la computadora
	 * 
	 * @param modelo
	 *            El modelo de la computadora
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Indica el precio de la computadora
	 * 
	 * @return int El precio de la computadora
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Asigna el precio de la computadora
	 * 
	 * @param precio
	 *            El precio de la computadora
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * Propiedades del monitor
	 * 
	 * @return Monitor Propiedades del monitor
	 */
	public Monitor getMonitor() {
		return monitor;
	}

	/**
	 * Asigna las propiedades del monitor
	 * 
	 * @param monitor
	 *            Propiedades del monitor
	 */
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	/**
	 * Propiedades del teclado
	 * 
	 * @return Teclado Propiedades del teclado
	 */
	public Teclado getTeclado() {
		return teclado;
	}

	/**
	 * Asigna las propiedades del teclado
	 * 
	 * @param teclado Propiedades del teclado
	 */
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	/**
	 * Propiedades del raton o mouse
	 * 
	 * @return Raton Propiedades del raton o mouse
	 */
	public Raton getRaton() {
		return raton;
	}

	/**
	 * Asigna las propiedades del raton
	 * 
	 * @param raton
	 *            Propiedades del raton o mouse
	 */
	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Computadora [Id = " + id + ", Modelo = " + modelo + ", Precio = $" + precio + ", " + monitor + ", "
				+ teclado + ", " + raton + "]";
	}
}
