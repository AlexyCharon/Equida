/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author HP-OMEN
 */
public class PieceJointe {
    private int id;
    private String chemin;
    private String description;
    private ArrayList<Attacher> lesAttachements;

    public PieceJointe() {
    }
    

    public PieceJointe(int id, String chemin, String description) {
        this.id = id;
        this.chemin = chemin;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Attacher> getLesAttachements() {
        return lesAttachements;
    }

    public void setLesAttachements(ArrayList<Attacher> lesAttachements) {
        this.lesAttachements = lesAttachements;
    }
    
   public void addUnAttachement(Attacher unAttachement){
       if(lesAttachements == null){
           lesAttachements = new ArrayList<Attacher>();
       }
       lesAttachements.add(unAttachement);
   }

    
    
}
