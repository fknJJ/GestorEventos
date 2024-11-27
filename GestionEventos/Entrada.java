public class Entrada {
    private String tipo; // Puede ser "General" o "VIP"
    private double precio;

    // Constructor para asignar el tipo y precio de la entrada
    public Entrada(String tipo) {
        this.tipo = tipo;
        if (tipo.equalsIgnoreCase("General")) {
            this.precio = 50.0; // Precio predeterminado para entrada General
        } else if (tipo.equalsIgnoreCase("VIP")) {
            this.precio = 150.0; // Precio predeterminado para entrada VIP
        } else {
            throw new IllegalArgumentException("Tipo de entrada no válido. Debe ser 'General' o 'VIP'.");
        }
    }

    // Métodos getters
    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    // Método para mostrar detalles de la entrada
    public void mostrarDetalles() {
        System.out.println("Tipo de Entrada: " + tipo);
        System.out.println("Precio: $" + precio);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
