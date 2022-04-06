/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.CategVente;
import model.Lieu;
import model.Vente;

/**
 *
 * @author Zakina
 */
public class VenteDAO {
    
    
    Connection connection=null;
    static PreparedStatement requete=null;
    static ResultSet rs=null;
    
    /* @author Zakina - 25/08/2021
    /* Méthode permettant de lister toutes les ventes enregistrées en base, triées par date décroissante.
    /* Pour chaque vente, on récupère aussi sa catégorie.
    /* La liste des vente est stockée dans une ArrayList
    */
    public static ArrayList<Vente>  getLesVentes(Connection connection){    
        
        ArrayList<Vente> lesVentes = new  ArrayList<Vente>();
        try
        {
            //preparation de la requete     
                requete=connection.prepareStatement("select * from vente, categvente,lieu where codeCategVente=code and vente.lieuVente=lieu.id order by dateDebut desc");          
            //executer la requete
            rs=requete.executeQuery();
            //On hydrate l'objet métier Client avec les résultats de la requête
            while ( rs.next() ) {  
                Vente uneVente = new Vente();
                uneVente.setId(rs.getInt("id"));
                uneVente.setNom(rs.getString("nom"));
                uneVente.setDateDebutVente(rs.getString("dateDebut"));
                
                CategVente laCategVente = new CategVente();
                laCategVente.setCode(rs.getString("code"));  // on aurait aussi pu prendre CodeCateg
                laCategVente.setLibelle(rs.getString("libelle"));
                
                uneVente.setCategVente(laCategVente);
                
                Lieu leLieu = new Lieu();
                leLieu.setVille(rs.getString("ville"));
                leLieu.setId(rs.getInt("id"));
                leLieu.setNbBoxes(rs.getInt("nbBoxes"));
                uneVente.setLieuVente(leLieu);
                
                lesVentes.add(uneVente);
            }
        }   
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return lesVentes ;    
    }
    public static Vente ajouterVente(Connection connection, Vente uneVente){      
        int idGenere = -1;
        try
        {
            //preparation de la requete
            // id (clé primaire de la table vente) est en auto_increment,donc on ne renseigne pas cette valeur
            // la paramètre RETURN_GENERATED_KEYS est ajouté à la requête afin de pouvoir récupérer l'id généré par la bdd (voir ci-dessous)
            // supprimer ce paramètre en cas de requête sans auto_increment.
            requete=connection.prepareStatement("INSERT INTO VENTE ( id, nom, dateDebutVente, codeCategVente, villeLieu)\n" +
                    "VALUES (?,?,?,?,?)" );
            requete.setInt(1, uneVente.getId());
            requete.setString(2, uneVente.getNom());
            requete.setString(3, uneVente.getDateDebutVente());
            requete.setString(4, uneVente.getCategVente().getCode());
            requete.setString(5, uneVente.getLieuVente().getVille());


           // Exécution de la requête 
            requete.executeUpdate();
            
        }   
        catch (SQLException e) 
        {
            e.printStackTrace();
            //out.println("Erreur lors de l’établissement de la connexion");
        }
        return uneVente ;
    }   
}
