/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sebastiancastillo_lab9p2;

import javax.swing.JProgressBar;

/**
 *
 * @author Asus
 */
public class AdminBarra extends Thread{
       private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    int max;

    public AdminBarra(JProgressBar barra,int max) {
        this.barra = barra;
        avanzar=true;
        vive=true;
        this.max=max;
    }
    
    
    

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }


    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }


    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run(){
        barra.setMaximum(max);
        while(vive){
            if(avanzar){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==max){
                    vive=false;
                }                
            } 
            
            try {
              Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}
