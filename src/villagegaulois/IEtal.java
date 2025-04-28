package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public interface IEtal <P extends Produit> {
    Gaulois getVendeur();
    int contientProduit(String produit, int quantiteSouhaitee);
    int acheterProduit(int quantiteSouhaitee);
    String etatEtal();
}