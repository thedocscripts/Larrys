package larrys;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


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
public class getprices implements Runnable{
    ArrayList<String> precio;
    public getprices() {
    }

    @Override
    public void run() {
        
        File ff = new File("src/precio.csv");
         String line = "";
         
         precio = new ArrayList<>();
         try {
            BufferedReader br = new BufferedReader(new FileReader(ff));
            
             while ((line = br.readLine()) != null) {                 
                 
                 precio.add(line);
             }
             System.out.println("Finished Loading Prices");
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException ex) {
            Logger.getLogger(getprices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<String> getprecio(){
     return precio;
    }
    
}
