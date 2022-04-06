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
import model.PieceJointe;

/**
 *
 * @author HP-OMEN
 */
public class PieceJointeDAO {
    
    Connection connection=null;
    static PreparedStatement requete=null;
    static ResultSet rs=null;
    
    public static ArrayList<PieceJointe>  getLesPiecesJointes(Connection connection,String idCourriel){      
        ArrayList<PieceJointe> lesPiecesJointes = new  ArrayList<PieceJointe>();
        try
        {
            //preparation de la requete     
            requete=connection.prepareStatement("SELECT * FROM piecejointe,attacher WHERE piecejointe.id=attacher.piecejointe_id and attacher.courriel_id=?");
            requete.setString(1,idCourriel);
            //executer la requete
            rs=requete.executeQuery();
            
            //On hydrate l'objet métier Client avec les résultats de la requête
            while ( rs.next() ) {  
                PieceJointe unePieceJointe = new PieceJointe();
                unePieceJointe.setId(rs.getInt("id"));
                unePieceJointe.setChemin(rs.getString("chemin"));
                unePieceJointe.setDescription(rs.getString("description"));
                lesPiecesJointes.add(unePieceJointe);
            }
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
            //out.println("Erreur lors de l’établissement de la connexion");
        }
        return lesPiecesJointes ;    
    } 
    
}
