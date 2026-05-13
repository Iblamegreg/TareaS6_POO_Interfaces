package T2_Sistema_bancario;

public class Main {
    public static void main(String[] args) {
        Pagable pago1 = new PagoEfectivo();
        Pagable pago2 = new PagoTarjeta();
        Pagable pago3 = new Transferencia();

        System.out.println("--- Procesando Pagos Válidos ---");
        pago1.procesarPago(100.0);
        pago2.procesarPago(100.0);
        pago3.procesarPago(100.0);

        System.out.println("\n--- Procesando Pagos Inválidos ---");
        pago1.procesarPago(-50.0);
    }
}
