/**
 * Clase que representa un libro.
 */
class Libro {
    /**
     * Constructor de la clase Libro.
     * @param {string} titulo - El título del libro.
     * @param {string} autor - El autor del libro.
     * @param {string} ISBN - El número ISBN del libro.
     * @param {string} estado - El estado del libro (disponible o reservado).
     */
    constructor(titulo, autor, ISBN, estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.estado = estado;
    }
}

module.exports = Libro;
