package com.cursojava.practica.mundopc.presentaciones;

import com.cursojava.practica.mundopc.nucleo.*;

public class MundoPc {

	public static void main(String[] args) {
		Teclado t1 = new Teclado("USB", "Genius", 50000);
		Teclado t2 = new Teclado("Bluetoo", "Genius", 150000);
		Raton r1 = new Raton("USB", "Genius", 20000);
		Raton r2 = new Raton("Bluethoo", "Genius", 90000);
		Monitor m1 = new Monitor("LG", 250000, (short)19);
		Monitor m2 = new Monitor("SAMSUNG", 350000, (short)21);
		Computadora c1 = new Computadora("AXE56", 2500000);
		c1.setMonitor(m1);
		c1.setTeclado(t1);
		c1.setRaton(r1);
		
		Computadora c2 = new Computadora("BYE56", 3500000);
		c2.setMonitor(m2);
		c2.setTeclado(t2);
		c2.setRaton(r2);
		
		Orden or1 = new Orden();
		or1.agregarComputadora(c1);
		or1.agregarComputadora(c2);
		or1.agregarComputadora(c1);
		or1.agregarComputadora(c1);
		or1.agregarComputadora(c2);
		
		or1.imprimirOrden();
		
		Orden or2 = new Orden();
		or2.agregarComputadora(c1);
		or2.agregarComputadora(c2);
		or2.agregarComputadora(c2);
		or2.agregarComputadora(c2);
		
		or2.imprimirOrden();
	}

}
