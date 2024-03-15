/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sebastiancastillo_lab9p2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Asus
 */
public class Hilohora extends Thread {
     private JLabel hora;
     private JLabel dia;
    public Hilohora(JLabel hora,JLabel dia) {
        this.hora = hora;
        this.dia=dia;
    }        

    
    @Override
    public void run() {
        while(true){
            Date h=new Date();
            DateFormat f=new SimpleDateFormat("hh:mm:ss");
            DateFormat d=new SimpleDateFormat("dd/MM/YYYY");
            hora.setText( f.format(h) );
            dia.setText(d.format(h));
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                
            }
        }        
    }
    
}
