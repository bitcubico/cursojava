package catalogoPeliculas.nucleo.dominio.dao.interfaces;

import catalogoPeliculas.nucleo.dominio.entidades.Pelicula;

/**
 * Interfaz con los elementos necesarios para crear, eliminar y actualizar peliculas
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 * @apiNote mcubico33@gmail.com
 */
public interface ICrudDao {
    /**
     * Agrega una nueva película al listado de películas
     * @param datos Datos de la película que se va a crear
     */
    void crear(Pelicula datos);

    /**
     * Edita los datos de una película existente
     * @param datos Datos que se desean actualizar
     * @return Verdadero si la actualización se realizó exitosamente, en otro caso falso
     */
    boolean actualizar(Pelicula datos);

    /**
     * Elimina una película en específico
     * @param id Identificador principal de la película que se desea eliminar
     * @return Verdadero si la eliminación se realizó exitosamente, en otro caso falso
     */
    boolean eliminar(int id);
}
