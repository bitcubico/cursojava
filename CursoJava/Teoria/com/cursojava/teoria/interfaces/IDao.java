/*
  Derechos reservados a bitcubico.com
 */
package com.cursojava.teoria.interfaces;

/**
 * Las clases abstractas se usan para encapsular funcionalidades común entre las clases de la misma familia, mientras
 * que las interfaces definen comportamientos relacionados que pueden pertenecer a cualquier clase. Por esta razón las
 * clases abstractas deben utilizarse en clases estrechamente relacionadas, mientras que las interfaces son mas
 * utilizadas para proporcionar funcionalidad común a clases no relacionadas entre sí
 *
 * @author mauricio.montoya
 * @version 1.0.0
 */
public interface IDao {

    int MAX_REGISTROS_INSERT = 10;
    void nuevo();
    void getTodo();

}
