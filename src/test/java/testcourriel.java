
import model.Attacher;
import model.Courriel;
import model.PieceJointe;
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
public class testcourriel {
    public static void main(String[] args) {
 
 
 Courriel unCourriel = new Courriel(0, "La vente aura lieu à Caen le 14 juillet", "info vente de caen","01/07/2021"); 
 Vente laVente = new Vente(0,"vente de caen","14/07/2021") ;
 
 unCourriel.setLaVente(laVente); ; 
 System.out.println("Le courriel numéro "+ unCourriel.getId() +" est associé à la vente" + unCourriel.getLaVente().getNom());
 
 Attacher unAttachement1 = new Attacher(0);
 unCourriel.addUnAttachement(unAttachement1);
 
 Attacher unAttachement2 = new Attacher(1);
 unCourriel.addUnAttachement(unAttachement2);
 
 System.out.println("le courriel possede les pj");
 // solution 1 pour boucler sur les salaries de la categorie
 for(int i = 0; i < unCourriel.getLesAttachements().size(); i++){
 Attacher unAttachement = unCourriel.getLesAttachements().get(i) ; 
 System.out.println (unAttachement.getId());
    }
    }
}
