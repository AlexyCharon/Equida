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
public class Lot {
    private int id;
    private int prixDepart;
    private String nom;
    private Cheval leCheval;
    private Vente laVente;

    public Lot() {
    }

    public Lot(int id, int prixDepart, Cheval leCheval, Vente laVente) {
        this.id = id;
        this.prixDepart = prixDepart;
        this.leCheval = leCheval;
        this.laVente = laVente;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(int prixDepart) {
        this.prixDepart = prixDepart;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public Cheval getLeCheval() {
        return leCheval;
    }

    public void setLeCheval(Cheval leCheval) {
        this.leCheval = leCheval;
    }

    public Vente getLaVente() {
        return laVente;
    }

    public void setLaVente(Vente laVente) {
        this.laVente = laVente;
    }
    
    
    
    
}
