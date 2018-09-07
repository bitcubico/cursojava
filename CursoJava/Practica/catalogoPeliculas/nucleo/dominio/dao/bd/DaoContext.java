package catalogoPeliculas.nucleo.dominio.dao.bd;

import catalogoPeliculas.nucleo.dominio.dao.interfaces.IBusquedaDao;
import catalogoPeliculas.nucleo.dominio.dao.interfaces.ICrudDao;

/**
 * Interfaz con los métodos necesarios para interactuar con la base de datos
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 * @apiNote mcubico33@gmail.com
 */
public abstract class DaoContext implements ICrudDao, IBusquedaDao {
    /**
     * Cadena de conexión a la base de datos. Los datos de conexión están separados por punto y coma (;)
     */
    protected String cadenaConexion;

    /**
     * Constructor
     * @param cadenaConexion Cadena de conexión a la base de datos. Los datos de conexión están separados por punto y coma (;)
     */
    public DaoContext(String cadenaConexion) {
        setCadenaConexion(cadenaConexion);
    }

    /**
     * Abre la conexión a la base de datos
     * @param cadenaConexion Cadena de conexión a la base de datos. Los datos de conexión están separados por punto y coma (;)
     */
    public abstract void abrirConexionBd(String cadenaConexion);

    /**
     * Cierra la conexión a la base de datos
     */
    public abstract void cerrarConexionBd();

    /**
     * Inicia una transacción para registrar datos en la base de datos
     */
    public abstract void iniciarTransaccion();

    /**
     * Finaliza una transacción una transacción a la base de datos registrando los datos pendientes en la base de datos.
     */
    public abstract void finanlizarTransaccion();

    /**
     * Obtiene la cadena de conexión usada para comunicarse con la base de datos
     * @return La cadena de conexión usada para comunicarse con la base de datos
     */
    public String getCadenaConexion() {
        return cadenaConexion;
    }

    /**
     * Asigna la cadena de conexión que se debe usar para comunicarse con la base de datos
     * @param cadenaConexion
     */
    protected void setCadenaConexion(String cadenaConexion){
        if(cadenaConexion != null && !cadenaConexion.trim().isEmpty())
            this.cadenaConexion = cadenaConexion.trim();
    }
}
