package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedToPurchaseAlcoholicBeverages = age >= 18;
        if (isAuthorizedToPurchaseAlcoholicBeverages) {
            System.out.println("Authorized to purchase alcoholic beverages");
        } else {
            System.out.println("Not authorized to purchase alcoholic beverages");
        }
        System.out.println("Out of if");
    }
}
