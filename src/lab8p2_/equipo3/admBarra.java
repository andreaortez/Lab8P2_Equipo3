package lab8p2_.equipo3;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class admBarra extends Thread {

    private JProgressBar barra;
    private Universo u;
    private JTable tabla;

    public admBarra(JProgressBar barra, Universo u, JTable tabla) {
        this.barra = barra;
        this.u = u;
        this.tabla = tabla;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public Universo getU() {
        return u;
    }

    public void setU(Universo u) {
        this.u = u;
    }

    @Override
    public void run() {
        barra.setMaximum(u.getSeres().size());
        for (SerVivo ser : u.getSeres()) {
            Object[] row = {((SerVivo) ser).getNombre(), ((SerVivo) ser).getID(), ((SerVivo) ser).getPoder(), ((SerVivo) ser).getYear(),
                ((SerVivo) ser).getRaza()};
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

            modelo.addRow(row);
            tabla.setModel(modelo);

            barra.setValue(barra.getValue() + 1);
            try {
                Thread.sleep(1000);//Para que se detenga la barra cuando le diga que se detenga

            } catch (InterruptedException ex) {
            }
        }

        barra.setValue(0);
    }
}
