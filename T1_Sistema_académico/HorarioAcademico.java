package T1_Sistema_académico;

public class HorarioAcademico implements Imprimible {
    private String periodo; // Reto adicional
    private String jornada;

    public HorarioAcademico(String periodo, String jornada) {
        this.periodo = periodo;
        this.jornada = jornada;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo Horario Académico...");
        System.out.println("Período: " + periodo + " | Jornada: " + jornada);
    }
}