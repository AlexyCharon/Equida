
import model.Attacher;
import model.Courriel;
import model.PieceJointe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP-OMEN
 */
public class testpiecejointe {
    public static void main(String[] args) {  
 PieceJointe unePJ1 = new PieceJointe(0,"./image/cheval1","img de cheval1");
 
 Attacher unAttachement1 = new Attacher(0);
 unePJ1.addUnAttachement(unAttachement1);
 
 Attacher unAttachement2 = new Attacher(1);
 unePJ1.addUnAttachement(unAttachement2);
 
 System.out.println("la pj est attaché aux courriels");
 // solution 1 pour boucler sur les salaries de la categorie
 for(int i = 0; i < unePJ1.getLesAttachements().size(); i++){
 Attacher unAttachement = unePJ1.getLesAttachements().get(i) ; 
 System.out.println (unAttachement.getId());
    }
    }
    
}
