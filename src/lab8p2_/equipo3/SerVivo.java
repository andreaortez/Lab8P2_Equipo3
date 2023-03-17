
package lab8p2_.equipo3;

import java.io.Serializable;

public class SerVivo implements Serializable{
    private String nombre; 
    private int ID; 
    private int poder; 
    private int year; 
    private String procedencia; 
    private String raza; 

    public SerVivo() {
    }

    public SerVivo(String nombre, int ID, int poder, int year, String procedencia, String raza) {
        this.nombre = nombre;
        this.ID = ID;
        this.poder = poder;
        this.year = year;
        this.procedencia = procedencia;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
