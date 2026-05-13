package T3_Sistema_roles_empresariales;

public class Administrador implements Autenticable, Reportable, Gestionable {
    private String usuarioAsignado = "admin";
    private String claveAsignada = "admin123";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return this.usuarioAsignado.equals(usuario) && this.claveAsignada.equals(clave);
    }

    @Override
    public void generarReporte() {
        System.out.println("Administrador: Generando reporte global de la empresa");
    }

    @Override
    public void gestionarDatos() {
        System.out.println("Administrador: Gestionando usuarios, inventario y finanzas");
    }
}
