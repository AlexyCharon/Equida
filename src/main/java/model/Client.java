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
public class Client {
    
   private int id;
   private String nom ;
   private String prenom ;
   private String copos;
   private String ville;
   private String rue;
   private String mail;
   private Pays lePays ;
   private ArrayList<CategVente> lesCategVentes ;

    public Client() {
    }

    public Client(int id, String nom, String prenom, String copos, String ville, String rue, String mail) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.copos = copos;
        this.ville = ville;
        this.rue = rue;
        this.mail = mail;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCopos() {
        return copos;
    }

    public void setCopos(String copos) {
        this.copos = copos;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public Pays getLePays() {
        return lePays;
    }

    public void setLePays(Pays lePays) {
        this.lePays = lePays;
    }

    public ArrayList<CategVente> getLesCategVentes() {
        return lesCategVentes;
    }

    public void setLesCategVentes(ArrayList<CategVente> lesCategVentes) {
        this.lesCategVentes = lesCategVentes;
    }
   
   public void addUneCategVente(CategVente uneCategVente){
        if (lesCategVentes == null){
            lesCategVentes = new ArrayList<CategVente>();
        }
        lesCategVentes.add(uneCategVente);
    }
    
}
