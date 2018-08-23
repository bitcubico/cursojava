/*
  Derechos reservados a bitcubico.com
 */
package com.cursojava.teoria.abstractas;

/**
 * Las clases abstractas se usan para encapsular funcionalidades común entre las clases de la misma familia, mientras
 * que las interfaces definen comportamientos relacionados que pueden pertenecer a cualquier clase. Por esta razón las
 * clases abstractas deben utilizarse en clases estrechamente relacionadas, mientras que las interfaces son mas
 * utilizadas para proporcionar funcionalidad común a clases no relacionadas entre sí
 *
 * @author mauricio.montoya
 * @version 1.0.0
 */
public abstract class FiguraGeometrica {

    /**
     * Atributo visualizable solo desde las clases hijas
     */
    protected String tipoFigura;

    /**
     * Constructor visualizable solo desde las clases hijas
     * @param tipoFigura Tipo de figura que se está tratando
     */
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }

    /**
     * Método encargado de dibujar la figura geométrica
     *
     * @implNote Este método de be ser ser implementado por las clases hijas ya que cada una de estas tiene su propia forma
     */
    public abstract void dibujar();

    /**
     * Obtiene el tipo de figura que se está tratando
     * @return String
     */
    public String getTipoFigura() {
        return tipoFigura;
    }

    /**
     * Asigna el tipo de figura que se va a tratar
     * @param tipoFigura Tipo de figura que se está tratando
     */
    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tipo de Figura: ");
        sb.append(tipoFigura);
        return sb.toString();
    }
}
