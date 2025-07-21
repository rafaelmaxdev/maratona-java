package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        double result = number1 / (double) number2;
        System.out.println(result);

        int rest = 20 % 2;
        System.out.println(rest);

        boolean isTenGreaterThanTwelve = number1 > number2;
        System.out.println(isTenGreaterThanTwelve);

        int age = 35;
        double salary = 3500.0;
        boolean withinTheLimitGreaterThanThirty = age > 30 && salary >= 4612;
        boolean withinTheLimitLessThanThirty = age < 30 && salary >= 4612;
        System.out.println("Greater than 30: " + withinTheLimitGreaterThanThirty);
        System.out.println("Less than 30: " + withinTheLimitLessThanThirty);

        double checkingAccount = 200.0;
        double savings = 1000.0;
        double ps5Price = 5000.0;
        boolean isPs5Affordable = checkingAccount > ps5Price || savings > ps5Price;
        System.out.println(isPs5Affordable);

        int counter = 1;
        counter++;
        System.out.println(counter);
    }
}
