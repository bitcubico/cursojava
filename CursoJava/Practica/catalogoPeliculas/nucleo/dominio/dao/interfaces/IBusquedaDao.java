package catalogoPeliculas.nucleo.dominio.dao.interfaces;

import catalogoPeliculas.nucleo.dominio.entidades.Pelicula;

import java.util.List;

/**
 * Interfaz con los elementos necesarios para realizar búsquedas básicas de peliculas
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 * @apiNote mcubico33@gmail.com
 */
public interface IBusquedaDao {

    /**
     * Realiza la búsqueda de una película basándose en su identificador principal
     * @param id Identificador principal de la película
     * @return Datos de la película coincidente, en cualquier otro caso, null
     */
    Pelicula getById(int id);

    /**
     * Obtiene todas las películas registradas en la base de datos
     * @return Todas la películas registradas en la base de datos
     */
    List<Pelicula> getAll();

    /**
     * Obtiene todas la películas que contengan en su nombre la palabra clave indicada
     * @param palabraClave Palabra clave que debe contener el nombre de la película
     * @return Todas las películas que contengan en su nombre la palabra clave indicada
     */
    List<Pelicula> getByNombre(String palabraClave);

    /**
     * Obtiene todas las películas pertenecientes a un un género en específico
     * @param genero Género de las películas que se desean listar
     * @return Todas las películas pertenecientes a un un género en específico
     */
    List<Pelicula> getByGenero(String genero);
}
