package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 12;
        while (count < 10) {
            System.out.println(count);
            count++;
        }
        do {
            System.out.println("inside do-while");
        }
        while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
