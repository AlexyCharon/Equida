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
public class Courriel {
    private int id;
    private String corps;
    private String objet;
    private String date;
    private Vente laVente;
    private ArrayList<Attacher> lesAttachements;

    public Courriel() {
    }
    

    public Courriel(int id, String corps, String objet, String date) {
        this.id = id;
        this.corps = corps;
        this.objet = objet;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Vente getLaVente() {
        return laVente;
    }

    public void setLaVente(Vente laVente) {
        this.laVente = laVente;
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
