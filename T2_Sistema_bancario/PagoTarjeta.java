package T2_Sistema_bancario;

public class PagoTarjeta implements Pagable {
    private final double COMISION = 0.05; // 5% de comisión (Reto)

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            double total = monto + (monto * COMISION);
            System.out.println("Pago con tarjeta procesado. Monto original: $" + monto + " | Total con comisión (5%): $" + total);
        } else {
            System.out.println("Monto inválido para pago con tarjeta");
        }
    }
}