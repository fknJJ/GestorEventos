public class PagoTarjetaCredito extends Pago {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Intentando procesar pago con tarjeta de crédito por $" + monto);
        if (esExitoso()) {
            System.out.println("Pago con tarjeta de crédito exitoso.");
            return true;
        } else {
            System.out.println("Pago con tarjeta de crédito rechazado.");
            return false;
        }
    }
}
