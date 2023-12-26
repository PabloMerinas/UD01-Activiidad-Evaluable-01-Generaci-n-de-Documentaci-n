package javaApp;

import java.util.Date;

/**
 * Clase que representa una reserva de libro con usuario, libro, fecha de
 * reserva y fecha de devolución.
 */
public class Reserva {
	private Usuario usuario;
	private Libro libro;
	private Date fechaReserva;
	private Date fechaDevolucion;

	/**
	 * Constructor de la clase Reserva.
	 *
	 * @param usuario El usuario que realiza la reserva.
	 * @param libro   El libro que se desea reservar.
	 */
	public Reserva(Usuario usuario, Libro libro) {
		this.usuario = usuario;
		this.libro = libro;
		this.fechaReserva = new Date();
		this.fechaDevolucion = calcularFechaDevolucion();
	}

	// Getters y setters
	public Usuario getUsuario() {
		return usuario;
	}

	public Libro getLibro() {
		return libro;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	/**
	 * Metodo para calcular la fecha de la devolución.
	 * 
	 * @return Fecha de la devolución.
	 */
	private Date calcularFechaDevolucion() {
		long tiempoActual = System.currentTimeMillis();
		long tiempoDevolucion = tiempoActual + (14 * 24 * 60 * 60 * 1000); // 14 días en milisegundos
		return new Date(tiempoDevolucion);
	}
}
