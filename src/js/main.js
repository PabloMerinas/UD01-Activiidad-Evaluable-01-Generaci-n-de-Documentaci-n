const readline = require('readline');
const Libro = require('./Libro');
const Usuario = require('./Usuario');
const Reserva = require('./Reserva');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const libros = [];
const reservas = [];

const libro1 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", "9788408043642", 'disponible');
const libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "9780307350450", 'disponible');
const libro3 = new Libro("1984", "George Orwell", "9780451524935", 'reservado');

libros.push(libro1, libro2, libro3);

const usuario1 = new Usuario("Juan");
const usuario2 = new Usuario("María");
const reserva1 = new Reserva(usuario1, libro1);
const reserva2 = new Reserva(usuario2, libro2);

reservas.push(reserva1, reserva2);

/**
 * Muestra una lista de libros.
 */
function listarLibros() {
    console.log("\nListado de Libros:");
    libros.forEach(libro => {
        console.log(`Título: ${libro.titulo}`);
        console.log(`Autor: ${libro.autor}`);
        console.log(`ISBN: ${libro.ISBN}`);
        console.log(`Estado: ${libro.estado}`);
        console.log();
    });
}

/**
 * Crea una reserva.
 * @param {Usuario} usuario - El usuario que realiza la reserva.
 * @param {Libro} libro - El libro que se desea reservar.
 */
function crearReserva(usuario, libro) {
    const libroIndex = libros.findIndex(l => l === libro);
    if (libroIndex !== -1 && libros[libroIndex].estado === 'disponible') {
        const reserva = new Reserva(usuario, libro);
        reservas.push(reserva);
        libros[libroIndex].estado = 'reservado';
        console.log("Reserva realizada con éxito.");
    } else {
        console.log("El libro no está disponible para reserva.");
    }
}

/**
 * Cancela una reserva.
 * @param {Usuario} usuario - El usuario que desea cancelar la reserva.
 * @param {Libro} libro - El libro que se desea cancelar la reserva.
 */
function cancelarReserva(usuario, libro) {
    const reservaIndex = reservas.findIndex(r => r.usuario === usuario && r.libro === libro);
    if (reservaIndex !== -1) {
        reservas.splice(reservaIndex, 1);
        const libroIndex = libros.findIndex(l => l === libro);
        if (libroIndex !== -1) {
            libros[libroIndex].estado = 'disponible';
        }
        console.log("Reserva cancelada con éxito.");
    } else {
        console.log("No se encontró ninguna reserva para este usuario y libro.");
    }
}

/**
 * Muestra una lista de todas las reservas.
 */
function listarReservas() {
    console.log("\nListado de Reservas:");
    reservas.forEach(reserva => {
        console.log(`Usuario: ${reserva.usuario.nombre}`);
        console.log(`Libro: ${reserva.libro.titulo}`);
        console.log(`Fecha de Reserva: ${reserva.fechaReserva}`);
        console.log(`Fecha de Devolución: ${reserva.fechaDevolucion}`);
        console.log();
    });
}

/**
 * Obtiene una opción del menú.
 * @returns {Promise<number>} - La opción seleccionada por el usuario.
 */
function obtenerOpcionMenu() {
    return new Promise(resolve => {
        rl.question("\nMenú Principal:\n1. Listar Libros\n2. Crear Reserva\n3. Cancelar Reserva\n4. Listar Reservas\n5. Salir\nElija una opción: ", (opcion) => {
            resolve(parseInt(opcion));
        });
    });
}

/**
 * Función principal que gestiona el menú de la aplicación.
 */
async function main() {
    while (true) {
        const opcion = await obtenerOpcionMenu();
        switch (opcion) {
            case 1:
                listarLibros();
                break;
            case 2:
                crearReserva(usuario1, libro1);
                break;
            case 3:
                cancelarReserva(usuario1, libro1);
                break;
            case 4:
                listarReservas();
                break;
            case 5:
                console.log("Gracias por utilizar la aplicación. ¡Hasta pronto!");
                rl.close();
                process.exit(0);
            default:
                console.log("Opción no válida. Intente de nuevo.");
        }
    }
}

main();
