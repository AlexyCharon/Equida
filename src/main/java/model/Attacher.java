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
public class Attacher {
    private int id;
    private PieceJointe unePieceJointe;
    private Courriel unCourriel;

    public Attacher() {
    }

    public Attacher(int id) {
        this.id = id;
    }
    

    public Attacher(int id, PieceJointe unePieceJointe, Courriel unCourriel) {
        this.id = id;
        this.unePieceJointe = unePieceJointe;
        this.unCourriel = unCourriel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PieceJointe getUnePieceJointe() {
        return unePieceJointe;
    }

    public void setUnePieceJointe(PieceJointe unePieceJointe) {
        this.unePieceJointe = unePieceJointe;
    }

    public Courriel getUnCourriel() {
        return unCourriel;
    }

    public void setUnCourriel(Courriel unCourriel) {
        this.unCourriel = unCourriel;
    }
    
    
}
