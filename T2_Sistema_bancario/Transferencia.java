package T2_Sistema_bancario;

public class Transferencia implements Pagable {
    private final double COMISION_FIJA = 1.50; // Comisión fija de $1.50 (Reto)

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            double total = monto + COMISION_FIJA;
            System.out.println("Transferencia procesada. Monto: $" + monto + " | Total con comisión fija ($1.50): $" + total);
        } else {
            System.out.println("Monto inválido para transferencia");
        }
    }
}
