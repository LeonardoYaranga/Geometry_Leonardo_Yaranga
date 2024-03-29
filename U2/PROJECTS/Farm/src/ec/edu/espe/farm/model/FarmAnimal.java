
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public abstract class FarmAnimal {

    protected int id;
    private String breed;
    private LocalDate bornOn;

    public int getAgeInMonths(LocalDate dateOfBorn) {
       
        LocalDate now = LocalDate.now();
        Period period=Period.between(dateOfBorn, now);
        return period.getMonths();
    };
    
    public abstract void feed(float amountOfFood);
    
    public FarmAnimal(int id, String breed, LocalDate bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", bornOn=" + bornOn + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the bornOn
     */
    public LocalDate getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(LocalDate bornOn) {
        this.bornOn = bornOn;
    }

}
