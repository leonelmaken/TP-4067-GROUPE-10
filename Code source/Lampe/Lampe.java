// Étape 1: Contexte
class Lampe {
    private EtatLampe etat;

    public Lampe() {
        this.etat = new LampeEteinte(); // État initial
    }

    public void changerEtat(EtatLampe nouvelEtat) {
        this.etat = nouvelEtat;
    }

    public void allumer() {
        // Ajout de la condition : La lampe ne peut être allumée que si elle est éteinte
        if (etat instanceof LampeEteinte) {
            etat.allumer();
            changerEtat(new LampeAllumee());
        } else {
            System.out.println("Impossible d'allumer la lampe, elle est déjà allumée.");
        }
    }

    public void eteindre() {
        // Ajout de la condition : La lampe ne peut être éteinte que si elle est allumée
        if (etat instanceof LampeAllumee) {
            etat.eteindre();
            changerEtat(new LampeEteinte());
        } else {
            System.out.println("Impossible d'éteindre la lampe, elle est déjà éteinte.");
        }
    }
}
