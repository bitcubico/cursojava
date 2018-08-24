package com.cursojava.practica.ventas;

import com.cursojava.teoria.ManejoExcepciones.ArgumentoVacioException;

public class Venta {

	public static void main(String[] args) {
		try {
			Producto p1 = new Producto("Camisa", 100.00);
			Producto p2 = new Producto("Jean", 110.00);
			Producto p3 = new Producto("Corbata", 50.00);
			Producto p4 = new Producto("Zapatos", 250.00);
			Producto p5 = new Producto("Medias", 10.00);

			Orden orden1 = new Orden();
			Orden orden2 = new Orden();

			try {

				orden1.agregarProducto(p1);
				orden1.agregarProducto(p2);
				orden1.agregarProducto(p3);

				orden1.imprimirOrden();

				orden2.agregarProducto(p4);
				orden2.agregarProducto(p5);
				orden2.agregarProducto(p1);

				orden2.imprimirOrden();
			} finally {
				try {
					p1.close();
					p2.close();
					p3.close();
					p4.close();
					p5.close();
					orden1.close();
					orden2.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		catch (ArgumentoVacioException ave){
			ave.printStackTrace();
		}
		
	}

}
