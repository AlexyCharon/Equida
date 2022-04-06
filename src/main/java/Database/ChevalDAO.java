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
import model.Cheval;
import model.TypeCheval;

/**
 *
 * @author HP-OMEN
 */
public class ChevalDAO {
    Connection connection=null;
    static PreparedStatement requete=null;
    static ResultSet rs=null;
    public static ArrayList<Cheval> getLesChevauxParVente(Connection connection){    
        
        ArrayList<Cheval> lesChevaux = new  ArrayList<Cheval>();
        try
        {
            //preparation de la requete     
                requete=connection.prepareStatement("SELECT c.id,c.nom,c.sexe,c.sire,c.dateNaissance,c.type, p.nom as pere, m.nom as mere FROM cheval c, cheval p, cheval m WHERE c.pere=p.id and c.mere=m.id and c.id=2");          
            //executer la requete
            rs=requete.executeQuery();
            //On hydrate l'objet métier Client avec les résultats de la requête
            while ( rs.next() ) {  
                Cheval unCheval = new Cheval();
                unCheval.setId(rs.getInt("id"));
                unCheval.setNom(rs.getString("nom"));
                unCheval.setSexe(rs.getInt("sexe"));
                unCheval.setDateNaissance(rs.getString("dateNaissance"));
                unCheval.setSire(rs.getString("sire"));
                
                Cheval cPere = new Cheval();
                cPere.setNom("pere");
                Cheval cMere = new Cheval();
                cMere.setNom("mere");
                
                unCheval.setMere(cMere);
                unCheval.setPere(cPere);
                
                TypeCheval leType = new TypeCheval();
                leType.setId(rs.getInt("id"));
                leType.setLibelle(rs.getString("libelle"));  // on aurait aussi pu prendre CodeCateg
                
                unCheval.setLeType(leType);
                
                /*Lieu leLieu = new Lieu();
                leLieu.setVille(rs.getString("ville"));
                leLieu.setId(rs.getInt("id"));
                leLieu.setNbBoxes(rs.getInt("nbBoxes"));
                uneVente.setLieuVente(leLieu);
                
                lesVentes.add(uneVente);*/
            }
        }   
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return lesChevaux ;    
    }
}
