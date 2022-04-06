
import model.Courriel;
import model.Lieu;
import model.Vente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP-OMEN
 */
public class testvente {
    
    public static void main(String[] args) {
 
 Vente uneVente = new Vente(0,"vente de caen","14/07/2021");
 
 Courriel courriel1 = new Courriel(0,"La vente de caen aura lieu le 14/07/2021","Info vente de caen","07/07/2021");
 uneVente.addUnCourriel(courriel1);
 
 Courriel courriel2 = new Courriel(1,"La vente de cherbourg aura lieu le 25/01/2021","Info vente de cherbourg","01/12/2021");
 uneVente.addUnCourriel(courriel2);
 
 Lieu unLieu = new Lieu(0,"Caen",15,"parc expo de caen");
 uneVente.setLieuVente(unLieu);
 
 System.out.println("la vente aura lieu" + uneVente.getLieuVente().getVille());
 
 System.out.println ("Liste des courriels de la vente");
// solution 1 pour boucler sur les salaries de la categorie
 for(int i = 0; i < uneVente.getLesCourriels().size(); i++){
 Courriel unCourriel = uneVente.getLesCourriels().get(i) ; 
 System.out.println (unCourriel.getObjet());
 }
    }
}
