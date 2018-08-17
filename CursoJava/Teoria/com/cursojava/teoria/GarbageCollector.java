/**
 * Derechos reservados a bitcubico.com
 */
package com.cursojava.teoria;

public class GarbageCollector {

	public static void main(String[] args) {
		
		Persona persona = new Persona(3474108, "Mauricio", "Montoya");
		// Esto es equivalente a using en c#
		try {
			System.out.println(persona.toString());
		} finally {
			// Esto es equivalente a dispose en c#
			if(persona != null) {
				try {
					// Esta clase debe implementar AutoClose
					persona.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}				
	}

}
