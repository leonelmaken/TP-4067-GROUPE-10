import java.util.Scanner;

// Ordinateur.java
public class Ordinateur {
    private EtatOrdinateur etatActuel;

    // Méthode pour changer l'état de l'ordinateur
    public void setEtat(EtatOrdinateur nouvelEtat) {
        this.etatActuel = nouvelEtat;
    }

    // Méthode pour effectuer une action en fonction de l'état actuel
    public void effectuerAction() {
        etatActuel.gestionnerEtat();
    }

    // Méthode pour mettre l'ordinateur en veille
    public void mettreEnVeille() {
        if (etatActuel instanceof AllumeState) {
            System.out.println("Mise en veille de l'ordinateur depuis l'état allumé.");
            setEtat(new VeilleState());
        } else {
            System.out.println("L'ordinateur ne peut pas être mis en veille depuis cet état.");
        }
    }

    // Méthode pour éteindre l'ordinateur
    public void eteindre() {
        if (etatActuel instanceof AllumeState || etatActuel instanceof VeilleState) {
            System.out.println("Extinction de l'ordinateur.");
            setEtat(new EteintState());
        } else {
            System.out.println("L'ordinateur ne peut pas être éteint depuis cet état.");
        }
    }
}

