package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salary = 6000;
        String donationMessage = "I will donate 500 to DevDojo";
        String noDonationMessage = "I still don't have the conditions, but I will have them";
        String result = salary > 5000 ? donationMessage : noDonationMessage;

        System.out.println(result);
    }
}
