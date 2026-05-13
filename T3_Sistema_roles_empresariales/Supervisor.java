package T3_Sistema_roles_empresariales;

public class Supervisor implements Autenticable, Reportable {
    private String usuarioAsignado = "superv";
    private String claveAsignada = "super123";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return this.usuarioAsignado.equals(usuario) && this.claveAsignada.equals(clave);
    }

    @Override
    public void generarReporte() {
        System.out.println("Supervisor: Generando reporte de rendimiento de cajeros");
    }
}
