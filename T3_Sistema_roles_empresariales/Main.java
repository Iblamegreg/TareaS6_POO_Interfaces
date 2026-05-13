package T3_Sistema_roles_empresariales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Sistema Empresarial");
        System.out.println("1. Cajero");
        System.out.println("2. Supervisor");
        System.out.println("3. Administrador");
        System.out.print("Seleccione su rol: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Usuario: ");
        String user = scanner.nextLine();
        System.out.print("Clave: ");
        String pass = scanner.nextLine();

        switch (opcion) {
            case 1:
                Cajero c = new Cajero();
                if (c.iniciarSesion(user, pass)) {
                    System.out.println("Acceso concedido");
                    c.gestionarDatos();
                } else {
                    System.out.println("Credenciales incorrectas");
                }
                break;
            case 2:
                Supervisor s = new Supervisor();
                if (s.iniciarSesion(user, pass)) {
                    System.out.println("Acceso concedido");
                    s.generarReporte();
                } else {
                    System.out.println("Credenciales incorrectas");
                }
                break;
            case 3:
                Administrador a = new Administrador();
                if (a.iniciarSesion(user, pass)) {
                    System.out.println("Acceso concedido");
                    a.gestionarDatos();
                    a.generarReporte();
                } else {
                    System.out.println("Credenciales incorrectas");
                }
                break;
            default:
                System.out.println("Opción invalida");
        }
        scanner.close();
    }
}