// EteintState.java
public class EteintState implements EtatOrdinateur {
    @Override
    public void gestionnerEtat() {
        System.out.println("L'ordinateur est éteint");
    }
}
