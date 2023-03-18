
package lab8p2_.equipo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
     * private void ListarTabla() {
        try {
            tb_servivos.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{},
                    new String[]{"ID", "Nombre", "Poder", "Años", "Universo de Procedencia", "Raza"}));
            db.conectar();
            try {
                db.query.execute("Select Id,Nombre,Poder,Años,Universo,Raza from Seres Vivos");
                ResultSet rs = db.query.getResultSet();
                int cont=0;
                while(rs.next()){
                * if(combobox.getObject().toString()==rs.getNombre())
                * cont++;
                * }
                
                rs = db.query.getResultSet();
                while (rs.next()) {
                * if(combobox.getObject().toString()==rs.getNombre()){
                    Object[] row = {rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4),
                        rs.getString(5), rs.getString(6)};
                    DefaultTableModel modelo = (DefaultTableModel) tb_servivos.getModel();
                    modelo.addRow(row);
                    
                    tb_servivos.setModel(modelo);
                    * 
                    jProgressBar.setMaximum(cont);
                    ab=new admBarra(jProgressBar);
                    ab.start();
                    * 
                   }
                }
                }catch (SQLException ex) {
                    ex.printStackTrace();
                }
                db.desconectar();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
     * 
     * 
     * 
     * 
     * 
     */
    
    
   
    
}
