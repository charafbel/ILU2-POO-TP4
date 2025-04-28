package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
    public Gaulois chasseur;
    public int poids;

    public Sanglier(int poids, Gaulois chasseur) {
        super("Sanglier", "piece");
        this.poids = poids;
        this.chasseur = chasseur;
    }

    @Override
    public String decrireProduit(){
        return "Sanglier de " + poids + " kg, tué par " + chasseur.getNom();
    }

    @Override
    public int calculerPrix(int prix) {
        return prix * poids;
    }
}
