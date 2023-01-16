/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Chicken extends FarmAnimal {

    private boolean isMolting;

    @Override
    public void feed(float amountOfFood) {
        System.out.println("Feedung a Chicken with:"+amountOfFood);
    }
    
     public void feed(int amountOfFood) {
        System.out.println("Feedung a Chicken with:"+amountOfFood);
    }
     
     public void feed(float amountOfFood,String typeOfFood) {
        System.out.println("Feedung an animal with food: "+typeOfFood+ ",amount:"+amountOfFood);
    }
     

//Constructor
    public Chicken(boolean isMolting, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }

    @Override
    public String toString() {
        String chicken = "";
        chicken = "Chicken{" + id + ","
                + getBreed() + "," + getBornOn()
                + "isMolting=" + isMolting + '}';
        return chicken;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

}
