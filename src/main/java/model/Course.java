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
public class Course {
    private int id;
    private String nom;
    private String lieu;
    private String date;
    private ArrayList<Courir> lesChevaux;

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

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public ArrayList<Courir> getLesChevaux() {
        return lesChevaux;
    }

    public void setLesChevaux(ArrayList<Courir> lesChevaux) {
        this.lesChevaux = lesChevaux;
    }
    
    public void addUnCheval(Courir unCheval){
        if(lesChevaux==null){
            lesChevaux= new ArrayList<Courir>();
        }
        lesChevaux.add(unCheval);
    }
    
}
