/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Zakina
 */
public class Vente {
    
    private int id;
    private String nom ;
    private String dateDebutVente ;
    private CategVente CategVente ;
    private Lieu lieuVente;
    private ArrayList<Courriel> lesCourriels;
    private ArrayList<VenteTypeCheval> lesVenteTypesChevaux;
    private ArrayList<Lot> lesLots;

    public Vente(int id, String nom, String dateDebutVente) {
        this.id = id;
        this.nom = nom;
        this.dateDebutVente = dateDebutVente;
    }
    

    public Vente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateDebutVente() {
        return dateDebutVente;
    }

    public void setDateDebutVente(String dateDebutVente) {
        this.dateDebutVente = dateDebutVente;
    }

    public CategVente getCategVente() {
        return CategVente;
    }

    public void setCategVente(CategVente CategVente) {
        this.CategVente = CategVente;
    }

    public ArrayList<Courriel> getLesCourriels() {
        return lesCourriels;
    }

    public void setLesCourriels(ArrayList<Courriel> lesCourriels) {
        this.lesCourriels = lesCourriels;
    }
    
   public void addUnCourriel(Courriel unCourriel){
       if(lesCourriels == null){
           lesCourriels = new ArrayList<Courriel>();
       }
       lesCourriels.add(unCourriel);
   }

    public Lieu getLieuVente() {
        return lieuVente;
    }

    public void setLieuVente(Lieu lieuVente) {
        this.lieuVente = lieuVente;
    }

    public ArrayList<VenteTypeCheval> getLesVenteTypesChevaux() {
        return lesVenteTypesChevaux;
    }

    public void setLesTypesChevaux(ArrayList<VenteTypeCheval> lesVenteTypesChevaux) {
        this.lesVenteTypesChevaux = lesVenteTypesChevaux;
    }
    
    public void addUneVenteTypeCheval(VenteTypeCheval uneVenteTypeCheval){
        if (lesVenteTypesChevaux == null){
            lesVenteTypesChevaux = new ArrayList<VenteTypeCheval>();
        }
        lesVenteTypesChevaux.add(uneVenteTypeCheval);
    }

    public ArrayList<Lot> getLesLots() {
        return lesLots;
    }

    public void setLesLots(ArrayList<Lot> lesLots) {
        this.lesLots = lesLots;
    }
   
    public void addUnLot(Lot unLot){
        if (lesLots == null){
            lesLots = new ArrayList<Lot>();
        }
        lesLots .add(unLot);
    }

}