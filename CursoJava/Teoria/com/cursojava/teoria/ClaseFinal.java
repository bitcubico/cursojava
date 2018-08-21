/**
 * Derechos reservados a bitcubico.com
 */
package com.cursojava.teoria;

/**
 * Esta clase al ser final no puede ser heredada, es considerada como la última
 * en la cadena de herencias
 * 
 * @author mauricio.montoya
 * @version 1.0.0
 */
public final class ClaseFinal {

	/**
	 * De esta forma se declaran las constantes, y al hacerla public static
	 * permite usarla sin tener que instanciar el un objeto de este tipo.
	 */
	public static final int valorConstante = 57;
	
	/**
	 * Esta asignación instancia un objeto del tipo persona y este retorna la referencia
	 * del mismo. Al ser final, la referencia al objeto almacenada en la variable persona
	 * no podría ser modificada mas los valores del objeto si.
	 */
	public static final Persona persona = new Persona(57, "Mauricio", "Montoya Medrano");
	
	/**
	 * Este método al ser final no puede ser sobre escrito, en el caso en que la clase no fuera final
	 */
	public final void metodoFinal() {
		
	}
}
