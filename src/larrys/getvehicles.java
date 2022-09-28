/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package larrys;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thedoc
 */
public class getvehicles implements Runnable {
    private ArrayList<String> coches; 
    @Override
    public void run() {
        File ff = new File("src/coches.csv");
         String line = "";
        coches = new ArrayList<>();
         
         try {
            BufferedReader br = new BufferedReader(new FileReader(ff));
            
             while ((line = br.readLine()) != null) {                 
               
                 coches.add(line);
             }
             System.out.println("Finished Loading Cars");
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException ex) {
            Logger.getLogger(getvehicles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<String> getvehicles(){
     return coches;
    }
    
}
