package T3_Sistema_roles_empresariales;

public interface Autenticable {
    boolean iniciarSesion(String usuario, String clave);
}
