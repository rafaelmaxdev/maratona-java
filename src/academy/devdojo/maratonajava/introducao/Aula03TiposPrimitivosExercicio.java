package academy.devdojo.maratonajava.introducao;

import java.util.Date;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

    String name = "João";
    String address = "Rua Primavera";
    double salary = 2500.50;
    Date SalaryReceiptDate = new Date();

    String report = "Eu " + name + ", morando no endereço " + address + ", confirmo que recebi o salário de R$" + salary + ", na data " + SalaryReceiptDate;

    System.out.println(report);
    }
}
