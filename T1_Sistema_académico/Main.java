package T1_Sistema_académico;

public class Main {
    public static void main(String[] args) {
        Imprimible doc1 = new Certificado("Juan Pérez", "Ingeniería de Software");
        Imprimible doc2 = new ActaNotas("Programación Orientada a Objetos", 9.5);
        Imprimible doc3 = new HorarioAcademico("2026-A", "Matutina");

        doc1.imprimir();
        System.out.println("---");
        doc2.imprimir();
        System.out.println("---");
        doc3.imprimir();
    }
}
