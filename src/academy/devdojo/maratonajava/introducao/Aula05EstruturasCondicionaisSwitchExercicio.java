package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisSwitchExercicio {
    public static void main(String[] args) {
        byte day = 4;

        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business day");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
