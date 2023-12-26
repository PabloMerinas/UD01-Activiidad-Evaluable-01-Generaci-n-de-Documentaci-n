package javaApp;

/**
 * Clase que representa a un usuario ( Aunque no se especifica en el enunciado,
 * es necesaria crear esta clase ).
 */
public class Usuario {
	private String nombre;

	/**
	 * Constructor de la clase Usuario.
	 *
	 * @param nombre El nombre del usuario.
	 */
	public Usuario(String nombre) {
		this.nombre = nombre;
	}

	// Getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
