package T3_Sistema_roles_empresariales;

public class Cajero implements Autenticable, Gestionable {
    private String usuarioAsignado = "cajero1";
    private String claveAsignada = "1234";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return this.usuarioAsignado.equals(usuario) && this.claveAsignada.equals(clave);
    }

    @Override
    public void gestionarDatos() {
        System.out.println("Cajero: Gestionando cobros y facturación en caja");
    }
}