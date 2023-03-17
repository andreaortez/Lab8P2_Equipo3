
package lab8p2_.equipo3;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class admUniverso {
    private File archivo = null;
    private ArrayList<Universo> listaUniverso = new ArrayList();

    public admUniverso( String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Universo> getListaUniverso() {
        return listaUniverso;
    }

    public void setListaUniverso(ArrayList<Universo> listaUniverso) {
        this.listaUniverso = listaUniverso;
    }
    public void setUniverso(Universo u){
        listaUniverso.add(u);
    }
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Universo t : listaUniverso) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    public void cargarArchivo(){
        try {
            listaUniverso = new ArrayList();
            Universo temp; 
            if (archivo.exists()) {
                FileInputStream entrada = 
                        new FileInputStream(archivo);
                ObjectInputStream objeto= 
                        new ObjectInputStream(entrada);
                
                try {
                    while ((temp = (Universo) objeto.readObject()) != null) {
                        listaUniverso.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final deSSSl archivo
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
