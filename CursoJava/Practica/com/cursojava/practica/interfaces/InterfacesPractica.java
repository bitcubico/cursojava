/*
  Derechos reservados a bitcubico.com
 */
package com.cursojava.practica.interfaces;

import com.cursojava.teoria.interfaces.*;

/**
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
public class InterfacesPractica {

    public static void main(String[] args) {
        IDao dao = new OracleDao();
        ejecutar(dao, "listar");

        dao = new MysqlDao();
        ejecutar(dao, "insertar");
    }

    public static void ejecutar(IDao dao, String accion){
        if("listar".equals(accion))
            dao.getTodo();
        else if("insertar".equals(accion))
            dao.nuevo();
    }
}
