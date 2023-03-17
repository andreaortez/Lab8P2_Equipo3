
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
}
