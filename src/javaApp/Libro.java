package javaApp;

/**
 * Clase que representa un libro con título, autor, ISBN y estado.
 */
public class Libro {
	private String titulo;
	private String autor;
	private String ISBN;
	private EstadoLibro estado;

	/**
	 * Constructor de la clase Libro.
	 *
	 * @param titulo El título del libro.
	 * @param autor  El autor del libro.
	 * @param ISBN   El número ISBN del libro.
	 * @param estado El estado del libro (disponible o reservado).
	 */
	public Libro(String titulo, String autor, String ISBN, EstadoLibro estado) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		this.estado = estado;
	}

	// Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public EstadoLibro getEstado() {
		return estado;
	}

	public void setEstado(EstadoLibro estado) {
		this.estado = estado;
	}
}
