import java.util.Scanner;

// Main.java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ordinateur ordinateur = new Ordinateur();

        System.out.println("Choisissez l'état initial de l'ordinateur :");
        System.out.println("1. Allumé");
        System.out.println("2. Éteint");
        System.out.println("3. En veille");

        int choixUtilisateur = scanner.nextInt();

        switch (choixUtilisateur) {
            case 1:
                ordinateur.setEtat(new AllumeState());
                break;
            case 2:
                ordinateur.setEtat(new EteintState());
                break;
            case 3:
                ordinateur.setEtat(new VeilleState());
                break;
            default:
                System.out.println("Choix invalide. L'ordinateur sera allumé par défaut.");
                ordinateur.setEtat(new AllumeState());
        }

        System.out.println("Action de l'ordinateur :");

        System.out.println("Voulez-vous mettre l'ordinateur en veille ? (1: Oui / 2: Non)");
        int choixVeille = scanner.nextInt();
        if (choixVeille == 1) {
            ordinateur.mettreEnVeille();
            ordinateur.effectuerAction();
        }

        System.out.println("Voulez-vous éteindre l'ordinateur ? (1: Oui / 2: Non)");
        int choixEteindre = scanner.nextInt();
        if (choixEteindre == 1) {
            ordinateur.eteindre();
            ordinateur.effectuerAction();
        }

        scanner.close();
    }
}


