
package lab8p2_.equipo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dba {
    private String datos; 
    private Connection dbcon;
    Statement query; 

    public Dba(String datos) {
        this.datos = datos; 
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
    
    public void conectar(){
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
     * bt_eliminarUMouseClicked
     * au.getListaUniverso().remove(pos);
     * 
     * db.conectar();
        try {
            db.query.execute("delete from Universo where Nombre=au.getListaUniverso().get(pos).getNombre()");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        * 
        * 
        
        * 
     * bt_eliminarMouseClicked
     * db.conectar();
     * 
     * String n = au.getListaUniverso().get(tb_servivos.getSelectedRow()).getNombre();
     * int id = 
     * db.query.execute("select cuenta,nombre,direccion from alumnos");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "--->" + rs.getString(3));
            }
            * 
        try {
            db.query.execute("delete from Seres Vivos where Nombre=au.getListaUniverso().get(pos).getNombre()");
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
