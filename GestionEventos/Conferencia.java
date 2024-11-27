public class Conferencia extends Evento {
    private String tema;

    public Conferencia(String nombre, String fecha, String lugar, int capacidad, String tema) {
        super(nombre, fecha, lugar, capacidad);
        this.tema = tema;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tema: " + tema);
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}