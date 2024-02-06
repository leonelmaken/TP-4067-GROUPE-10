import java.util.Scanner;
// Utilisation interactive
public class Main {
    public static void main(String[] args) {
        Lampe lampe = new Lampe();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Allumer la lampe");
            System.out.println("2. Éteindre la lampe");
            System.out.println("3. Quitter");

            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    lampe.allumer();
                    break;
                case 2:
                    lampe.eteindre();
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    System.exit(0);
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }
}
