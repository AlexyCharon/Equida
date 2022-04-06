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
public class Courir {
    private int id;
    private int place;
    private Cheval leCheval;
    private Course laCourse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public Cheval getLeCheval() {
        return leCheval;
    }

    public void setLeCheval(Cheval leCheval) {
        this.leCheval = leCheval;
    }

    public Course getLaCourse() {
        return laCourse;
    }

    public void setLaCourse(Course laCourse) {
        this.laCourse = laCourse;
    }

    
}
