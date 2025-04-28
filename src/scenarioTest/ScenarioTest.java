package scenarioTest;

import personnages.*;
import villagegaulois.*;
import produit.*;

public class ScenarioTest {

	private static String accorderNomProduit(String produit, int quantiteSouhaitee) {
		String chaineProduit = produit;
		if (quantiteSouhaitee > 1) {
			chaineProduit = produit + "s";
		}
		return chaineProduit;
	}

	public static void main(String[] args) {
		/* Marche Pas psk Produit ne peut pas prendre Sanglier
		IEtal<Produit>[] marche = new IEtal[3];
		Etal<Sanglier> etal = new Etal<>();
		marche[0] = etal;
		*/
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};


		IEtal<Produit>[] marche = new IEtal[3];

		Etal<Sanglier> etalS = new Etal<>();
		Etal<Sanglier> etalSS = new Etal<>();
		Etal<Poisson> etalP = new Etal<>();
		marche[0] = etalS;
		marche[1] = etalSS;
		marche[2] = etalP;
		etalS.intallerVendeur(obelix, sangliersObelix, 10);
		etalSS.intallerVendeur(asterix, sangliersAsterix, 101);
		etalP.intallerVendeur(asterix, poissons, 1011);


	}

}








//	public static void acheterProduit(Etal[] marche, String produit, int quantiteSouhaitee) {
//		int quantiteRestante = quantiteSouhaitee;
//		for (int i = 0; i < marche.length && quantiteRestante != 0; i++) {
//			Etal etal = marche[i];
//			int quantiteDisponible = etal.contientProduit(produit, quantiteRestante);
//			if (quantiteDisponible != 0) {
//				int prix = etal.acheterProduit(quantiteDisponible);
//				String chaineProduit = accorderNomProduit(produit, quantiteDisponible);
//				System.out.println("A l'étal n° " + (i + 1) + ", j'achete " + quantiteDisponible + " " + chaineProduit
//						+ " et je paye " + prix + " sous.");
//				quantiteRestante -= quantiteDisponible;
//			}
//		}
//		String chaineProduit = accorderNomProduit(produit, quantiteSouhaitee);
//		System.out.println("Je voulais " + quantiteSouhaitee + " " + chaineProduit + ", j'en ai acheté "
//				+ (quantiteSouhaitee - quantiteRestante) + ".");
//	}