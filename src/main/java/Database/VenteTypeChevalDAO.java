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
import model.TypeCheval;
import model.Vente;
import model.VenteTypeCheval;

/**
 *
 * @author adminsio
 */
public class VenteTypeChevalDAO {


    Connection connection=null;
    static PreparedStatement requete=null;
    static ResultSet rs=null;
    
    public static ArrayList<VenteTypeCheval>  getLesVenteTypeChevaux(Connection connection,int idVente){    
        ArrayList<VenteTypeCheval> lesVenteTypeChevaux = new  ArrayList<VenteTypeCheval>();
        try
        {
            //preparation de la requete     
            requete=connection.prepareStatement("select c.id,c.nom,c.sexe,c.sire,c.dateNaissance,c.type, p.nom as pere, m.nom as mere from cheval c, cheval p, cheval m, vente, chevaltype, lot where vente.id=? and vente.id=lot.id_vente and lot.id_cheval = c.id and c.type = chevaltype.id and c.pere=p.id and c.mere=m.id"); 
            System.out.println(requete);
            requete.setInt(1,idVente);
            //executer la requete
            rs=requete.executeQuery();
            //On hydrate l'objet métier Client avec les résultats de la requête
            while ( rs.next() ) {  
                VenteTypeCheval uneVenteTypeCheval = new VenteTypeCheval();
                uneVenteTypeCheval.setId(rs.getInt("id"));
                uneVenteTypeCheval.setNom(rs.getString("nom"));
                
                Vente laVente = new Vente();
                laVente.setId(rs.getInt("id_vente"));
                uneVenteTypeCheval.setLaVente(laVente);
                
                
                TypeCheval leType = new TypeCheval();
                leType.setLibelle(rs.getString("libelle"));
                uneVenteTypeCheval.setLeType(leType);
                                
                lesVenteTypeChevaux.add(uneVenteTypeCheval);
                    
            }
        }   
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return lesVenteTypeChevaux ;    
    }
}
