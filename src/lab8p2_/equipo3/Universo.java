
package lab8p2_.equipo3;

import java.io.Serializable;
import java.util.ArrayList;


public class Universo implements Serializable{
    private String nombre; 
    private ArrayList<SerVivo> seres = new ArrayList();

    public Universo() {
    }

    
    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<SerVivo> getSeres() {
        return seres;
    }

    public void setSeres(ArrayList<SerVivo> seres) {
        this.seres = seres;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
