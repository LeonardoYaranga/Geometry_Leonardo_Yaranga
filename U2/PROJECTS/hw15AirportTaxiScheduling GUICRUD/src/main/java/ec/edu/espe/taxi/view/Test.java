/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.taxi.view;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import ec.edu.espe.taxi.model.Travel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Test {

    public static void main(String[] args) {

        ArrayList<Travel> travels = new ArrayList<>();
        Travel travel = new Travel();
        Date date = new Date(2022, 20, 11, 14, 5);
        Date date1 = new Date(2023, 01, 12, 23, 50);
        int[] label = new int[5];

        travel = new Travel(1, "Matin", "juan", "Quito", date.from(Instant.now()), 0, "No more", true);
        travels.add(travel);
        travel = new Travel(2, "Mpedro", "juan", "Quito", date1, 0, "No more", false);
        travels.add(travel);
       
        
        
        boolean datesRemaning = date.before(travel.getDateOfOcurrence());
        System.out.println(datesRemaning);
        //addTravelsToJson(travels);
        
       //To dont lost 
       /* 
       public Traveler() {
        this.id = 0;
        this.name = "";
        this.phoneNumber = 0;
        this.mail = "";
        this.outstandingBalance = 0.0F;
        this.birthdayDay = 1;
        this.birthdayMonth = 1;
        this.year = 1900;
    }
        */
    }

    private static Gson gson = new Gson();

    public static void addTravelsToJson(ArrayList<Travel> travels) {

        File travelsListFile = new File("test.json");

        JsonArray jsonArray = new JsonArray();
        for (int i = 0; i < travels.size(); i++) {
            jsonArray.add(gson.toJsonTree(travels.get(i)));
        }

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(travelsListFile, false));
            writer.print(jsonArray);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        System.out.println(travels);
    }
}
