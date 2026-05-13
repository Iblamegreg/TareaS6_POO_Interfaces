package T2_Sistema_bancario;

public class PagoEfectivo implements Pagable {
    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago en efectivo procesado con éxito: $" + monto);
        } else {
            System.out.println("Monto inválido para pago en efectivo");
        }
    }
}