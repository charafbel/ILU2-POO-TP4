package produit;

public abstract class Produit implements IProduit {
    public String nom;
    public String unite;

    public Produit(String nom, String unite) {
        this.nom = nom;
        this.unite = unite;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public int calculerPrix(int prix) {
        return prix;
    }

}
