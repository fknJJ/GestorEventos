public class PagoEfectivo extends Pago {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Intentando procesar pago en efectivo por $" + monto);
        if (esExitoso()) {
            System.out.println("Pago en efectivo recibido con éxito.");
            return true;
        } else {
            System.out.println("El pago en efectivo fue rechazado.");
            return false;
        }
    }
}
