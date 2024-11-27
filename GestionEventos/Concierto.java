public class Concierto extends Evento {
    private String generoMusical;

    public Concierto(String nombre, String fecha, String lugar, int capacidad, String generoMusical) {
        super(nombre, fecha, lugar, capacidad);
        this.generoMusical = generoMusical;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Género Musical: " + generoMusical);
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }
}