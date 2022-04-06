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

import model.Lot;
import model.TypeCheval;
import model.Vente;

/**
 *
 * @author HP-OMEN
 */
public class LotDAO {  

    Connection connection=null;
    static PreparedStatement requete=null;
    static ResultSet rs=null;
    
    public static ArrayList<Lot>  getLesLotsParVente(Connection connection,int idVente)
    {    
        ArrayList<Lot> lesLots = new  ArrayList<Lot>();
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
                Lot unLot = new Lot();
                unLot.setId(rs.getInt("id"));
                unLot.setPrixDepart(rs.getInt("prix"));
                
                Vente laVente = new Vente();
                laVente.setId(rs.getInt("id_vente"));
                unLot.setLaVente(laVente);
                
                Cheval leCheval = new Cheval();
                leCheval.setId(rs.getInt("id_cheval"));
                leCheval.setDateNaissance(rs.getString("dateNaissance"));
                leCheval.setNom(rs.getString("nom"));
                leCheval.setSire(rs.getString("sire"));
                leCheval.setSexe(rs.getInt("sexe"));
                
                                unLot.setLeCheval(leCheval);

                
                TypeCheval leType = new TypeCheval();
                leType.setLibelle(rs.getString("libelle"));
                leCheval.setLeType(leType);
                /*
                Cheval cPere = new Cheval();
                cPere.setNom(rs.getString("pere"));
                Cheval cMere = new Cheval();
                cMere.setNom(rs.getString("mere"));
                
                leCheval.setMere(cMere);
                leCheval.setPere(cPere);*/
                                
                lesLots.add(unLot);
                
                
            }
        }   
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return lesLots ;    
    }
}
