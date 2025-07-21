package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double anualSalary = 70000;
        double firstTaxBracket = 9.7 / 100;
        double secondTaxBracket = 37.35 / 100;
        double thirdTaxBracket = 49.5 / 100;
        double taxedValue;

        if (anualSalary <= 34712) {
            taxedValue = anualSalary * firstTaxBracket;
        } else if (anualSalary >= 34713 && anualSalary <= 68507) {
            taxedValue = anualSalary * secondTaxBracket;
        }
        else {
            taxedValue = anualSalary * thirdTaxBracket;
        }

        System.out.println(taxedValue);
    }
}
