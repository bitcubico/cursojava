/*
  Derechos reservados a bitcubico.com
 */
package com.cursojava.teoria.abstractas;

/**
 * Clase con lo requerido para tratar circulos
 *
 * @author mauricio.montoya
 * @version 1.0.0
 */
public class Circulo extends FiguraGeometrica{

    /**
     * Constructor
     *
     * @param tipoFigura Tipo de figura que se está tratando
     */
    public Circulo(String tipoFigura) {
        super(tipoFigura);
    }

    public void dibujar() {
        System.out.println("Aquí se dibuja un:" + this.getClass().getSimpleName());
    }
}
