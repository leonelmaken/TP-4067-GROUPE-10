class LampeEteinte implements EtatLampe {
    @Override
    public void allumer() {
        System.out.println("La lampe est allumée.");
    }

    @Override
    public void eteindre() {
        System.out.println("La lampe est déjà éteinte.");
    }
}