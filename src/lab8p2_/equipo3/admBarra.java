
package lab8p2_.equipo3;

import javax.swing.JProgressBar;

public class admBarra extends Thread{
    private JProgressBar barra;

    public admBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run(){
        while(barra.getValue()!=barra.getMaximum()){
            barra.setValue(barra.getValue()+1);
            
            try {
                Thread.sleep(1000);//Para que se detenga la barra cuando le diga que se detenga
                    
            } catch (InterruptedException ex) {
            }
            
        }
        barra.setValue(0);
    }
}
