class LampeAllumee implements EtatLampe {
    @Override
    public void allumer() {
        System.out.println("La lampe est déjà allumée.");
    }

    @Override
    public void eteindre() {
        System.out.println("La lampe est éteinte.");
    }
}
