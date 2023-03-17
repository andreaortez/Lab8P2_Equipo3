
package lab8p2_.equipo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dba {
    private String datos; 
    private Connection dbcon;
    private Statement query; 

    public Dba(String datos) {
        this.datos = datos; 
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
    
    public void Conectar(){
        try {
            String driver = "jdbc:ucanaccess://";
            dbcon = DriverManager.getConnection(driver+datos, "", "");
            query = dbcon.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void desconectar(){
        try {
            query.close();
            dbcon.close();
        } catch (Exception e) {
        }
    }
    public void commit(){
        try{
           dbcon.commit();
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    
    /**
     * MAIN METHOD
     *  Dba db = new Dba("./lab8.mdb");
     *  
     * 
     * 
     *bt_agregarUMouseClicked
     * despues de EscribirArchivo()
     * db.conectar();
        try {
            
            db.query.execute("INSERT INTO Universo"
                    + " (Nombre,# Seres Vivos)"
                    + " VALUES ('" + nombre + "', '" + "" + "')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
     * 
     * 
     * 
     * 
     *bt_cmMouseClicked
     * despues de au.escribirarchivo();
     * try {
            
            db.query.execute("INSERT INTO Seres Vivos"
                    + " (Nombre,Poder,Años,Universo,Raza)"
                    + " VALUES ('" + tf_nombre.getText() + "', '" + Integer.parseInt(sp_poder.getValue().toString()) 
                    * + "', '" + Integer.parseInt(tf_año.getText()) + "', '" + cb_universo.getSelectedItem().toString() 
                    * + "', '" + cb_raza.getSelectedItem().toString() + "')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
     * 
     * 
     * 
     */
    
    
}
