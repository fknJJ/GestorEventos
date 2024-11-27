import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class SistemaEventos {
    private final List<Evento> eventos;
    private final Random random;

    public SistemaEventos() {
        eventos = new ArrayList<>();
        random = new Random();
        generarEventosAleatorios();
    }

    private void generarEventosAleatorios() {
        eventos.add(new Concierto("Rock Fest", "2024-12-01", "Parque Central", 1000, "Rock"));
        eventos.add(new Conferencia("Tech Summit", "2024-12-05", "Centro de Convenciones", 500, "Inteligencia Artificial"));
        eventos.add(new Partido("Final de Liga", "2024-12-10", "Estadio Nacional", 800, "Equipo A", "Equipo B"));
    }

    public void ejecutarSimulacion() {
        Evento eventoSeleccionado = eventos.get(random.nextInt(eventos.size())); // Seleccionar evento aleatorio
        eventoSeleccionado.mostrarDetalles();

        System.out.println("\nIntentando ingresar al evento...");
        if (eventoSeleccionado.puedeIngresar()) {
            System.out.println("¡Hay espacio disponible!");

            System.out.println("Procesando pago...");
            if (eventoSeleccionado.procesarPago()) {
                System.out.println("Pago aprobado. Registrando asistencia...");
                eventoSeleccionado.registrarAsistente();
            } else {
                System.out.println("Pago rechazado. No se pudo ingresar.");
            }
        } else {
            System.out.println("Evento lleno. No se puede ingresar.");
        }

        System.out.println("\nDetalles actualizados del evento:");
        eventoSeleccionado.mostrarDetalles();
    }
}