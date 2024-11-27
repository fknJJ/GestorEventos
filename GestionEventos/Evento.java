import java.util.ArrayList;

public abstract class Evento {
    protected String nombre;
    private final String fecha;
    protected String lugar;
    private final int capacidad;
    private final ArrayList<Asistente> asistentes;
    private final ArrayList<Entrada> entradas;

    public Evento(String nombre, String fecha, String lugar, int capacidad) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.capacidad = capacidad;
        this.asistentes = new ArrayList<>();
        this.entradas = new ArrayList<>();
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public int getCapacidad() {
        return capacidad - asistentes.size();
    }

    // Método abstracto que será sobrescrito por las subclases
    public abstract void mostrarDetalles();

    // Método para agregar un asistente al evento
    public boolean agregarAsistente(Asistente asistente, Entrada entrada) {
        if (getCapacidad() > 0) { // Verifica si quedan entradas disponibles
            asistentes.add(asistente);
            entradas.add(entrada);
            return true;
        }
        return false; // No hay más capacidad
    }
}
