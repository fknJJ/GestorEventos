import java.util.ArrayList;
import java.util.Random;

public class SistemaEventos {
    public static void main(String[] args) {
        // Crear una lista de eventos disponibles
        ArrayList<Evento> eventos = new ArrayList<>();

        // Agregar diferentes tipos de eventos
        eventos.add(new Concierto("Rock Fest", "2024-12-10", "Estadio Nacional", 100, "Rock"));
        eventos.add(new Concierto("Pop Stars", "2024-11-20", "Arena Central", 80, "Pop"));
        eventos.add(new Conferencia("Tech Talks", "2024-10-15", "Centro de Convenciones", 200, "Innovación Tecnológica"));
        eventos.add(new Conferencia("Salud Global", "2024-11-05", "Auditorio Principal", 150, "Medicina y Salud Pública"));

        // Seleccionar un evento aleatorio
        Random random = new Random();
        Evento eventoSeleccionado = eventos.get(random.nextInt(eventos.size()));

        // Mostrar detalles del evento seleccionado
        System.out.println("¡Evento seleccionado aleatoriamente!");
        eventoSeleccionado.mostrarDetalles();

        // Crear una entrada y un asistente
        Entrada entrada = new Entrada("VIP"); // Asignar entrada VIP como ejemplo
        Asistente asistente = new Asistente("Carlos Pérez", "carlos.perez@example.com");

        // Procesar el pago del asistente
        Pago pago = new PagoTarjetaCredito(); // Ejemplo de pago con tarjeta
        if (pago.procesarPago(entrada.getPrecio())) {
            if (eventoSeleccionado.agregarAsistente(asistente, entrada)) {
                System.out.println("¡Entrada comprada con éxito para el evento!");
            } else {
                System.out.println("No quedan entradas disponibles.");
            }
        } else {
            System.out.println("El pago no se pudo procesar. Intenta nuevamente.");
        }
    }
}
