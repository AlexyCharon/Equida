/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HP-OMEN
 */
public class Acheteur extends Client{
   private String formation;

    public Acheteur(String formation, int id, String nom, String prenom, String copos, String ville, String rue, String mail) {
        super(id, nom, prenom, copos, ville, rue, mail);
        this.formation = formation;
    }
   

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }
   
}
