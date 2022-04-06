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
public class TypeCheval {
    private int id;
    private String libelle;
    private String description;
    private ArrayList<Cheval> lesChevaux;
    private ArrayList<VenteTypeCheval> lesVentes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Cheval> getLesChevaux() {
        return lesChevaux;
    }

    public void setLesChevaux(ArrayList<Cheval> lesChevaux) {
        this.lesChevaux = lesChevaux;
    }
    public void addUnCheval(Cheval unCheval){
       if(lesChevaux == null){
           lesChevaux = new ArrayList<Cheval>();
       }
       lesChevaux.add(unCheval);
   }

    public ArrayList<VenteTypeCheval> getLesVentes() {
        return lesVentes;
    }

    public void setLesVentes(ArrayList<VenteTypeCheval> lesVentes) {
        this.lesVentes = lesVentes;
    }
    
    public void addUneVente(VenteTypeCheval uneVente){
        if (lesVentes == null){
            lesVentes = new ArrayList<VenteTypeCheval>();
        }
        lesVentes.add(uneVente);
    }
    
    
    
}
