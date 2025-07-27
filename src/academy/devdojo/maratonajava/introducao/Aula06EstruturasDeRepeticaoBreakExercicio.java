package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoBreakExercicio {
    public static void main(String[] args) {
        double totalValue = 30000;
        int maxInstallments = 36;
        for(int i = 1; i <= maxInstallments; i++) {
            double installmentValue = totalValue / i;
            if (installmentValue < 1000) {
                break;
            }
                System.out.println("Installment " + i + " R$ " + installmentValue);
        }
    }
}
