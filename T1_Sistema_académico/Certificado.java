package T1_Sistema_académico;

public class Certificado implements Imprimible {
    private String nombreEstudiante;
    private String carrera; // Reto adicional

    public Certificado(String nombreEstudiante, String carrera) {
        this.nombreEstudiante = nombreEstudiante;
        this.carrera = carrera;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo Certificado...");
        System.out.println("Estudiante: " + nombreEstudiante + " | Carrera: " + carrera);
    }
}
