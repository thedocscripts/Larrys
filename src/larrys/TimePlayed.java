/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package larrys;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author thedoc
 */
public class TimePlayed {
    mainapp sss;
    private Timer t;
    boolean started = false;
    
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
    String tiempo;
    String inicio;
    String Terminar;
    public TimePlayed(mainapp ss) {
        sss = ss;
        t = new Timer(10, acciones);
        
    }
    
    public void StartTimer(){
        if(!started){
            t.start();
            started = true;
            if(h > 1 || m > 1 || s > 1){
                
            }else{
                Date date = new Date();
                inicio = formatter.format(date);
                System.out.println(inicio);
            }
            
        }
        
    }
    
    
    
    
    public void StopTimer(){
        if(started){
            t.stop();
            started = false;
            Date date = new Date();
            Terminar = formatter.format(date);
        }
        
    }

    public boolean isStarted() {
        return started;
    }
    
    
    private int h, m,s, cs;
    private ActionListener acciones = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
           cs++;
           if(cs==100){
               cs = 0;
               ++s;
           }
           if(s==60){
               s = 0;
               ++m;
           }
           if(m==60){
               m = 0;
               ++h;
           }
           actualizarlabel();
        }

        private void actualizarlabel() {
            tiempo = (h<=9?"0":"")+h+ "h " +(m<=9?"0":"")+m+ "m ";
            sss.TimePlayedLabel.setText(tiempo);
        }

        
    };

    public String getTiempo() {
        return "Hora entrada: " + inicio + "\nHora salida: " + Terminar + "\nTiempo Jugado: " + tiempo;
    }
    
    public String GetStartTime(){
        return "Hora entrada: " + inicio;
    }
    
    public void ResetTimer(){
        h = 0;
        m = 0;
        s = 0;
        cs = 0;
    }
    
}
