package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Farm {

    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Chicken chicken;
        LocalDate born = LocalDate.of(2022, Month.MARCH, 15);
        farmAnimal = new Chicken(false, 1, "Doberman", LocalDate.now());
        chicken = new Chicken(true, 2, "Sumatra", born);

        System.out.println("farmAnimal is" + farmAnimal.getClass());
        System.out.println("farAnimal is" + chicken.getClass());
        
        System.out.println("farAnimal->" + farmAnimal);
        System.out.println("chicken->" + chicken);

        System.out.println("farm Animal age " + farmAnimal.getAgeInMonths(LocalDate.now()));
        System.out.println("chicken age-->" + chicken.getAgeInMonths(born) + "Months");

        chicken.feed(1.23F);
        chicken.feed(5);
        chicken.feed(25.53F, "worms");
    }

}
