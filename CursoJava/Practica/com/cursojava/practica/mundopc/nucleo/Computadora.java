package com.cursojava.practica.mundopc.nucleo;

public class Computadora {
	private final short id;
	private String modelo;
	private int precio;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static short contadorInstancias;
	
	/**
	 * @param modelo
	 * @param precio
	 */
	public Computadora(String modelo, int precio) {
		super();
		id = ++contadorInstancias;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public int CalcularCostoTotal() {
		int total = getPrecio();
		total += monitor != null ? monitor.getPrecio() : 0;
		total += teclado != null ? teclado.getPrecio() : 0;
		total += raton != null ? raton.getPrecio() : 0;
		
		return total;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo
	 *            the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
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

	/**
	 * @return the monitor
	 */
	public Monitor getMonitor() {
		return monitor;
	}

	/**
	 * @param monitor
	 *            the monitor to set
	 */
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	/**
	 * @return the teclado
	 */
	public Teclado getTeclado() {
		return teclado;
	}

	/**
	 * @param teclado
	 *            the teclado to set
	 */
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	/**
	 * @return the raton
	 */
	public Raton getRaton() {
		return raton;
	}

	/**
	 * @param raton
	 *            the raton to set
	 */
	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Computadora [Id = " + id + ", Modelo = " + modelo + ", Precio = $" + precio + ", " + monitor + ", " + teclado
				+ ", " + raton + "]";
	}
}
