/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import model.Vente;
import model.CategVente;
import model.Lieu;


/**
 *
 * @author adminsio
 */
public class FormAjoutVente {
    
     private String resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public void setErreurs(Map<String, String> erreurs) {
        this.erreurs = erreurs;
    }
    
    //méthode de validation du champ de saisie nom
    private void validationNom( String nom ) throws Exception {
        if ( nom != null && nom.length() < 3 ) {
        throw new Exception( "Le nom d'utilisateur doit contenir au moins 3 caractères." );
        }
    }

    private void setErreur( String champ, String message ) {
    erreurs.put(champ, message );
    }    
    
    private static String getDataForm( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur.trim();
        }   
    }
    
    public Vente ajouterVente( HttpServletRequest request ) {
      
        Vente uneVente  = new Vente();
        
        String idVenteForm = getDataForm ( request, "idVente" );
        int idVente = Integer.parseInt(idVenteForm);
        String nom = getDataForm( request, "nom" );
        String dateDebutVente = getDataForm( request, "dateDebutVente");
        String idLieuForm = getDataForm( request, "idLieu" );
        int idLieu = Integer.parseInt(idLieuForm);
        String categVente = getDataForm( request, "codeCategVente" );
       
        // Traitement de la liste à choix multiple
        //Pour chaque catégorie selectionné, on instancie une nouvelle catégorie et on l'ajoute à la vente
        
        /*Lot unLot ;
        String[] Lot = request.getParameterValues("Lot");
         for (int i=0; i<Lot.length; i++){
            unLot = new Lot();
            unLot.setNom(Lot[i]);
            uneVente.addUnLot(unLot);
        }
        
       */
        try {
             validationNom( nom );
        } catch ( Exception e ) {
            setErreur( "nom", e.getMessage() );
        }
        uneVente.setNom(nom);

        if ( erreurs.isEmpty() ) {
            resultat = "Succès de l'ajout.";
        } else {
            resultat = "Échec de l'ajout.";
        }
         
        
        uneVente.setDateDebutVente(dateDebutVente);
        
        Lieu unLieu = new Lieu();
        unLieu.setId(idLieu);
        uneVente.setLieuVente(unLieu);
        
        Vente laVente = new Vente();
        laVente.setId(idVente);
       // uneVente.setVente(laVente);
        
        CategVente uneCategVente = new CategVente();
        uneCategVente.setCode(categVente);
        uneVente.setCategVente(uneCategVente);
        
        System.out.println("idelieuvente=" + uneVente.getLieuVente().getId() + "categVente" + uneVente.getCategVente().getCode());
        

        return uneVente ;
    }
    
}
