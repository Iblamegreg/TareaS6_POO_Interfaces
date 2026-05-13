package T1_Sistema_académico;

public class ActaNotas implements Imprimible {
    private String materia;
    private double promedio; // Reto adicional

    public ActaNotas(String materia, double promedio) {
        this.materia = materia;
        this.promedio = promedio;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo Acta de Notas...");
        System.out.println("Materia: " + materia + " | Promedio Final: " + promedio);
    }
}
