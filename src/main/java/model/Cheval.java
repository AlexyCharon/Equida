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
public class Cheval {
    private int id;
    private String nom;
    private int sexe;
    private String sire;
    private String dateNaissance;
    private Cheval pere;
    private Cheval mere;
    private TypeCheval leType;
    private ArrayList<Lot> lesLots;
    private ArrayList<Courir> lesCourses;

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

    public int getSexe() {
        return sexe;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public TypeCheval getLeType() {
        return leType;
    }

    public void setLeType(TypeCheval leType) {
        this.leType = leType;
    }

    public Cheval getPere() {
        return pere;
    }

    public void setPere(Cheval pere) {
        this.pere = pere;
    }

    public Cheval getMere() {
        return mere;
    }

    public void setMere(Cheval mere) {
        this.mere = mere;
    }
    

    public ArrayList<Lot> getLesLots() {
        return lesLots;
    }

    public void setLesLots(ArrayList<Lot> lesLots) {
        this.lesLots = lesLots;
    }
    
    public void addUnLot(Lot unLot){
       if(lesLots == null){
           lesLots = new ArrayList<Lot>();
       }
       lesLots.add(unLot);
   }

    public ArrayList<Courir> getLesCourses() {
        return lesCourses;
    }

    public void setLesCourses(ArrayList<Courir> lesCourses) {
        this.lesCourses = lesCourses;
    }
    
    public void addUneCourse(Courir uneCourse){
        if(lesCourses == null){
            lesCourses = new ArrayList<Courir>();
        }
        lesCourses.add(uneCourse);
    }
}

