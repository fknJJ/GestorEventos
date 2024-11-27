public class PagoPaypal extends Pago {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Intentando procesar pago vía PayPal por $" + monto);
        if (esExitoso()) {
            System.out.println("Pago vía PayPal exitoso.");
            return true;
        } else {
            System.out.println("Pago vía PayPal rechazado.");
            return false;
        }
    }
}
