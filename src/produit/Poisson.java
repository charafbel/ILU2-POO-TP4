package produit;

public class Poisson extends Produit {
    public String datePeche;

    public Poisson(String datePeche) {
        super("Poisson", "piece");
        this.datePeche = datePeche;
    }

    @Override
    public String decrireProduit(){
        return "Poisson pêché " + datePeche;
    }

    @Override
    public int calculerPrix(int prix) {
        return prix;
    }
}
