package com.cursojava.practica.ventas;

public class Orden implements AutoCloseable {
	private final int idOrden;
	private final Producto[] productos;
	private int contadorProductos;
	private static int contadorOrdenes;
	private static final short totalProductosPermitidos = 10;

	public Orden() {
		super();
		idOrden = ++contadorOrdenes;
		productos = new Producto[totalProductosPermitidos];
	}

	public void agregarProducto(Producto producto) {
		if (producto != null && contadorOrdenes < totalProductosPermitidos)
			productos[contadorProductos++] = producto;
		else
			System.out.println(producto != null
					? "Se ha superado el máximo de productos (" + totalProductosPermitidos + ") permitidos por orden"
					: "El producto que intenta agregar es null");
	}

	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < contadorProductos; i++)
			total += productos[i].getPrecio();

		return total;
	}

	public void imprimirOrden() {
		String inicio = "**************** INICIO --->";
		String fin = "**************** FIN <---";
		String separador = "|--> ";
		String tabulador = "\t";
		String saltoLinea = "\n";

		StringBuilder sb = new StringBuilder(inicio).append(saltoLinea);
		sb.append(separador).append("Orden #").append(idOrden).append(saltoLinea);
		sb.append(separador).append("Total a pagar: $").append(calcularTotal()).append(saltoLinea);
		sb.append(separador).append("Productos en la orden:").append(saltoLinea);
		for (int i = 0; i < contadorProductos; i++)
			sb.append(separador).append(productos[i].getNombre()).append(tabulador).append(tabulador)
					.append("$" + productos[i].getPrecio()).append(saltoLinea);
		
		sb.append(fin).append(saltoLinea);
		System.out.println(sb.toString());
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub

	}
}
