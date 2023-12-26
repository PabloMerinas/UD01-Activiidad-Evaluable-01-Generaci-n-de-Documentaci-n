package javaApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal.
 */
public class Main {
	public static void main(String[] args) {
		// Crear algunos libros de ejemplo
		Libro libro1 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", "9788408043642", EstadoLibro.DISPONIBLE);
		Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "9780307350450",
				EstadoLibro.DISPONIBLE);
		Libro libro3 = new Libro("1984", "George Orwell", "9780451524935", EstadoLibro.RESERVADO);

		// Crear una lista de libros
		List<Libro> libros = new ArrayList<>();
		libros.add(libro1);
		libros.add(libro2);
		libros.add(libro3);

		Usuario usuario1 = new Usuario("Juan");
		Usuario usuario2 = new Usuario("María");
		Reserva reserva1 = new Reserva(usuario1, libro1);
		Reserva reserva2 = new Reserva(usuario2, libro2);

		// Crear una lista de reservas
		List<Reserva> reservas = new ArrayList<>();
		reservas.add(reserva1);
		reservas.add(reserva2);

		// Menú principal
		while (true) {
			System.out.println("\nMenú Principal:");
			System.out.println("1. Listar Libros");
			System.out.println("2. Crear Reserva");
			System.out.println("3. Cancelar Reserva");
			System.out.println("4. Listar Reservas");
			System.out.println("5. Salir");

			int opcion = obtenerOpcionMenu();

			switch (opcion) {
			case 1:
				listarLibros(libros);
				break;
			case 2:
				crearReserva(usuario1, libros.get(0), reservas);
				break;
			case 3:
				cancelarReserva(usuario1, libros.get(0), reservas);
				break;
			case 4:
				listarReservas(reservas);
				break;
			case 5:
				System.out.println("Gracias por utilizar la aplicación. ¡Hasta pronto!");
				System.exit(0);
			default:
				System.out.println("Opción no válida. Intente de nuevo.");
			}
		}
	}

	/**
	 * Muestra una lista de libros.
	 *
	 * @param libros La lista de libros.
	 */
	public static void listarLibros(List<Libro> libros) {
		System.out.println("\nListado de Libros:");
		for (Libro libro : libros) {
			System.out.println("Título: " + libro.getTitulo());
			System.out.println("Autor: " + libro.getAutor());
			System.out.println("ISBN: " + libro.getISBN());
			System.out.println("Estado: " + libro.getEstado());
			System.out.println();
		}
	}

	/**
	 * Crea una reserva.
	 *
	 * @param usuario  El usuario que realiza la reserva.
	 * @param libro    El libro que se desea reservar.
	 * @param reservas La lista de reservas existentes.
	 */
	public static void crearReserva(Usuario usuario, Libro libro, List<Reserva> reservas) {
		if (libro.getEstado() == EstadoLibro.DISPONIBLE) {
			Reserva reserva = new Reserva(usuario, libro);
			reservas.add(reserva);
			libro.setEstado(EstadoLibro.RESERVADO);
			System.out.println("Reserva realizada con éxito.");
		} else {
			System.out.println("El libro no está disponible para reserva.");
		}
	}

	/**
	 * Cancela una reserva.
	 *
	 * @param usuario  El usuario que desea cancelar la reserva.
	 * @param libro    El libro que se desea cancelar la reserva.
	 * @param reservas La lista de reservas existentes.
	 */
	public static void cancelarReserva(Usuario usuario, Libro libro, List<Reserva> reservas) {
		for (Reserva reserva : reservas) {
			if (reserva.getUsuario().equals(usuario) && reserva.getLibro().equals(libro)) {
				reservas.remove(reserva);
				libro.setEstado(EstadoLibro.DISPONIBLE);
				System.out.println("Reserva cancelada con éxito.");
				return;
			}
		}
		System.out.println("No se encontró ninguna reserva para este usuario y libro.");
	}

	/**
	 * Muestra una lista de todas las reservas.
	 *
	 * @param reservas La lista de reservas.
	 */
	public static void listarReservas(List<Reserva> reservas) {
		System.out.println("\nListado de Reservas:");
		for (Reserva reserva : reservas) {
			System.out.println("Usuario: " + reserva.getUsuario().getNombre());
			System.out.println("Libro: " + reserva.getLibro().getTitulo());
			System.out.println("Fecha de Reserva: " + reserva.getFechaReserva());
			System.out.println("Fecha de Devolución: " + reserva.getFechaDevolucion());
			System.out.println();
		}
	}

	/**
	 * Obtiene una opción.
	 *
	 * @return La opción seleccionada por el usuario.
	 */
	public static int obtenerOpcionMenu() {
		int opcion = -1;
		Scanner scanner = new Scanner(System.in);
		try {
			opcion = scanner.nextInt();
		} catch (NumberFormatException e) {
			opcion = -1;
		}
		return opcion;
	}
}

/**
 * Enum para el estado del libro.
 */
enum EstadoLibro {
	DISPONIBLE, RESERVADO
}
