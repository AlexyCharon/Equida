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
public class VenteTypeCheval {
    private int id;
    private String nom;
    private TypeCheval leType;
    private Vente laVente;

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
    
    public TypeCheval getLeType() {
        return leType;
    }

    public void setLeType(TypeCheval leType) {
        this.leType = leType;
    }

    public Vente getLaVente() {
        return laVente;
    }

    public void setLaVente(Vente laVente) {
        this.laVente = laVente;
    }

    
}
