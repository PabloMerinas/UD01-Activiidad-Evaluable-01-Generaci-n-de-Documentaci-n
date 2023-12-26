/**
 * Clase que representa una reserva de libro.
 */
class Reserva {
    /**
     * Constructor de la clase Reserva.
     * @param {Usuario} usuario - El usuario que realiza la reserva.
     * @param {Libro} libro - El libro que se desea reservar.
     */
    constructor(usuario, libro) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaReserva = new Date();
        this.fechaDevolucion = this.calcularFechaDevolucion();
    }

    /**
     * Calcula la fecha de devolución para la reserva.
     * @private
     * @returns {Date} - La fecha de devolución calculada.
     */
    calcularFechaDevolucion() {
        const tiempoActual = new Date().getTime();
        const tiempoDevolucion = tiempoActual + (14 * 24 * 60 * 60 * 1000);
        return new Date(tiempoDevolucion);
    }
}

module.exports = Reserva;
