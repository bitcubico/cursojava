package catalogoPeliculas.nucleo.dominio.dao.bd;

import catalogoPeliculas.nucleo.dominio.entidades.Pelicula;

import java.util.List;

/**
 * Clase con los méteodos necesarios para realizar operaciones en la base de datos de películas
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 * @apiNote mcubico33@gmail.com
 */
public class PeliculasArchivoPlano extends DaoContext {
    /**
     * Constructor
     *
     * @param cadenaConexion Cadena de conexión a la base de datos. Los datos de conexión están separados por punto y coma (;)
     */
    public PeliculasArchivoPlano(String cadenaConexion) {
        super(cadenaConexion);
    }

    /**
     * Abre la conexión a la base de datos
     *
     * @param cadenaConexion Cadena de conexión a la base de datos. Los datos de conexión están separados por punto y coma (;)
     */
    @Override
    public void abrirConexionBd(String cadenaConexion) {

    }

    /**
     * Cierra la conexión a la base de datos
     */
    @Override
    public void cerrarConexionBd() {

    }

    /**
     * Inicia una transacción para registrar datos en la base de datos
     */
    @Override
    public void iniciarTransaccion() {

    }

    /**
     * Finaliza una transacción una transacción a la base de datos registrando los datos pendientes en la base de datos.
     */
    @Override
    public void finanlizarTransaccion() {

    }

    /**
     * Realiza la búsqueda de una película basándose en su identificador principal
     *
     * @param id Identificador principal de la película
     * @return Datos de la película coincidente, en cualquier otro caso, null
     */
    @Override
    public Pelicula getById(int id) {
        return null;
    }

    /**
     * Obtiene todas las películas registradas en la base de datos
     *
     * @return Todas la películas registradas en la base de datos
     */
    @Override
    public List<Pelicula> getAll() {
        return null;
    }

    /**
     * Obtiene todas la películas que contengan en su nombre la palabra clave indicada
     *
     * @param palabraClave Palabra clave que debe contener el nombre de la película
     * @return Todas las películas que contengan en su nombre la palabra clave indicada
     */
    @Override
    public List<Pelicula> getByNombre(String palabraClave) {
        return null;
    }

    /**
     * Obtiene todas las películas pertenecientes a un un género en específico
     *
     * @param genero Género de las películas que se desean listar
     * @return Todas las películas pertenecientes a un un género en específico
     */
    @Override
    public List<Pelicula> getByGenero(String genero) {
        return null;
    }

    /**
     * Agrega una nueva película al listado de películas
     *
     * @param datos Datos de la película que se va a crear
     */
    @Override
    public void crear(Pelicula datos) {

    }

    /**
     * Edita los datos de una película existente
     *
     * @param datos Datos que se desean actualizar
     * @return Verdadero si la actualización se realizó exitosamente, en otro caso falso
     */
    @Override
    public boolean actualizar(Pelicula datos) {
        return false;
    }

    /**
     * Elimina una película en específico
     *
     * @param id Identificador principal de la película que se desea eliminar
     * @return Verdadero si la eliminación se realizó exitosamente, en otro caso falso
     */
    @Override
    public boolean eliminar(int id) {
        return false;
    }
}
