public class Student {
    String name;
    double grade1, grade2, grade3;
    
    //Nota final do aluno
    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }
    // Método para verificar se o aluno foi aprovado
    public boolean isApproved() {
        return finalGrade() >= 60.0;
    }
    //Quantos pontos faltam para aprovação
    public double missingPoints() {
        if (isApproved()) {
            return 0.0;
        }
        return 60.0 - finalGrade();
    }
    //Dados do aluno
    @Override
    public String toString() {
        String result = ("\n|Resultados:");
        result += "\n\tNOTA FINAL: " + String.format("%.2f", finalGrade());
        if (isApproved()) {
            result += "\n\tPASSOU!";
        } else {
            result += "\n\tRODOU!\n\tFALTARAM " + String.format("%.2f", missingPoints()) + " PONTOS";
        }
        return result;
    }
}
