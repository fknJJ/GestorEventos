public abstract class Pago {
    // Método abstracto que será implementado por las subclases
    public abstract boolean procesarPago(double monto);

    // Método auxiliar para simular probabilidad de éxito (70% de éxito, por ejemplo)
    protected boolean esExitoso() {
        double probabilidad = Math.random(); // Genera un número entre 0.0 y 1.0
        return probabilidad < 0.6; // 70% de probabilidad de éxito
    }
}
