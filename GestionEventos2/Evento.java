import java.util.Random;

abstract class Evento {
    protected String nombre;
    protected String fecha;
    protected String lugar;
    protected int capacidad;
    protected int asistentes;

    public Evento(String nombre, String fecha, String lugar, int capacidad) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.capacidad = capacidad;
        this.asistentes = 0; // Inicialmente no hay asistentes
    }

    public boolean puedeIngresar() {
        return asistentes < capacidad; // Si hay cupo
    }

    public boolean procesarPago() {
        Random random = new Random();
        return random.nextBoolean(); // True o False aleatoriamente
    }

    public void registrarAsistente() {
        if (puedeIngresar()) {
            asistentes++;
        }
    }

    public abstract void mostrarDetalles();
}

class Concierto extends Evento {
    private final String generoMusical;

    public Concierto(String nombre, String fecha, String lugar, int capacidad, String generoMusical) {
        super(nombre, fecha, lugar, capacidad);
        this.generoMusical = generoMusical;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Concierto: " + nombre + " de " + generoMusical + " en " + lugar + " el " + fecha + ". Capacidad: " + capacidad + ", Asistentes: " + asistentes);
    }
}

class Conferencia extends Evento {
    private final String tema;

    public Conferencia(String nombre, String fecha, String lugar, int capacidad, String tema) {
        super(nombre, fecha, lugar, capacidad);
        this.tema = tema;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Conferencia: " + nombre + " sobre " + tema + " en " + lugar + " el " + fecha + ". Capacidad: " + capacidad + ", Asistentes: " + asistentes);
    }
}

class Partido extends Evento {
    private final String equipoLocal;
    private final String equipoVisitante;

    public Partido(String nombre, String fecha, String lugar, int capacidad, String equipoLocal, String equipoVisitante) {
        super(nombre, fecha, lugar, capacidad);
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Partido: " + nombre + " entre " + equipoLocal + " y " + equipoVisitante + " en " + lugar + " el " + fecha + ". Capacidad: " + capacidad + ", Asistentes: " + asistentes);
    }
}
