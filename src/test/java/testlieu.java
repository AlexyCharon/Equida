
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
public class testlieu {
    
    public static void main(String[] args) {
         Lieu unLieu = new Lieu(0,"Caen",15,"parc expo de caen");

 
 Vente vente1 = new Vente(0,"vente de caen","14/07/2021");
 unLieu.addUneVente(vente1);
 
 Vente vente2 = new Vente(1,"vente de caen 2","14/07/2022");
 unLieu.addUneVente(vente2);
  
 System.out.println ("Liste des ventes pour un lieu");
// solution 1 pour boucler sur les salaries de la categorie
 for(int i = 0; i < unLieu.getLesVentes().size(); i++){
 Vente uneVente = unLieu.getLesVentes().get(i) ; 
 System.out.println (uneVente.getNom());
 }
    }
    
}
