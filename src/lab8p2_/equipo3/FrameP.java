package lab8p2_.equipo3;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class FrameP extends javax.swing.JFrame {

    admUniverso au = new admUniverso("./universos.a&t");
    int ID = 0;

    public FrameP() {
        initComponents();
        au.cargarArchivo();

        SpinnerNumberModel un = new SpinnerNumberModel();
        un.setMaximum(10);
        un.setMinimum(1);
        un.setValue(1);
        sp_poder.setModel(un);

        pn_agregar.setVisible(false);
        pn_eliminar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bt_agregarSV = new javax.swing.JButton();
        bt_modificarSV = new javax.swing.JButton();
        bt_eliminarSV = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bt_agregarU = new javax.swing.JButton();
        pn_agregar = new javax.swing.JPanel();
        cb_universo = new javax.swing.JComboBox<>();
        cb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_año = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sp_poder = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        cb_raza = new javax.swing.JComboBox<>();
        bt_cm = new javax.swing.JButton();
        sv = new javax.swing.JLabel();
        cb_sv = new javax.swing.JComboBox<>();
        pn_eliminar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_servivos = new javax.swing.JTable();
        bt_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        bt_agregarSV.setText("Agregar Ser Vivo");
        bt_agregarSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarSVMouseClicked(evt);
            }
        });

        bt_modificarSV.setText("Modificar Ser Vivo");
        bt_modificarSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarSVMouseClicked(evt);
            }
        });

        bt_eliminarSV.setText("Eliminar Ser Vivo");
        bt_eliminarSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarSVMouseClicked(evt);
            }
        });

        jButton4.setText("Guardar");

        bt_agregarU.setText("Agregar Universo");
        bt_agregarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarUMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bt_agregarSV)
                    .addComponent(bt_modificarSV)
                    .addComponent(bt_eliminarSV)
                    .addComponent(jButton4)
                    .addComponent(bt_agregarU))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(bt_agregarU)
                .addGap(72, 72, 72)
                .addComponent(bt_agregarSV)
                .addGap(79, 79, 79)
                .addComponent(bt_modificarSV)
                .addGap(82, 82, 82)
                .addComponent(bt_eliminarSV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(38, 38, 38))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 500));

        pn_agregar.setBackground(new java.awt.Color(255, 255, 255));
        pn_agregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_universo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_universoItemStateChanged(evt);
            }
        });
        pn_agregar.add(cb_universo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 158, -1));

        cb.setBackground(new java.awt.Color(0, 0, 0));
        cb.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        cb.setForeground(new java.awt.Color(0, 0, 0));
        cb.setText("Universo");
        pn_agregar.add(cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 85, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        pn_agregar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 30));
        pn_agregar.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 400, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Poder");
        pn_agregar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 30));
        pn_agregar.add(tf_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 210, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Raza");
        pn_agregar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, 30));
        pn_agregar.add(sp_poder, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 60, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Años");
        pn_agregar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, 30));

        cb_raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Amanto" }));
        pn_agregar.add(cb_raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 180, 30));

        bt_cm.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bt_cm.setText("Agregar");
        bt_cm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cmMouseClicked(evt);
            }
        });
        pn_agregar.add(bt_cm, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        sv.setBackground(new java.awt.Color(0, 0, 0));
        sv.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        sv.setForeground(new java.awt.Color(0, 0, 0));
        sv.setText("Ser Vivo");
        pn_agregar.add(sv, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 30, 80, -1));

        cb_sv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_svItemStateChanged(evt);
            }
        });
        pn_agregar.add(cb_sv, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 158, -1));

        jPanel1.add(pn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 600, 500));

        pn_eliminar.setBackground(new java.awt.Color(255, 255, 255));
        pn_eliminar.setForeground(new java.awt.Color(255, 255, 255));

        tb_servivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "ID", "Poder", "Años", "Universo de Procedencia", "Raza"
            }
        ));
        jScrollPane1.setViewportView(tb_servivos);

        bt_eliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bt_eliminar.setText("Eliminar");
        bt_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_eliminarLayout = new javax.swing.GroupLayout(pn_eliminar);
        pn_eliminar.setLayout(pn_eliminarLayout);
        pn_eliminarLayout.setHorizontalGroup(
            pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_eliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_eliminarLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(bt_eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_eliminarLayout.setVerticalGroup(
            pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_eliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_eliminar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(pn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 600, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cmMouseClicked
        if (bt_cm.getText().equals("Agregar")) {
            try {
                int index = cb_universo.getSelectedIndex();

                au.getListaUniverso().get(index).getSeres().add(new SerVivo(tf_nombre.getText(), ID(), Integer.parseInt(sp_poder.getValue().toString()),
                        Integer.parseInt(tf_año.getText()), cb_universo.getSelectedItem().toString(), cb_raza.getSelectedItem().toString()));
                au.escribirArchivo();

                tf_nombre.setText("");
                sp_poder.setValue(1);
                tf_año.setText("");
                cb_raza.setSelectedIndex(1);

                JOptionPane.showMessageDialog(this, "Alumno agregado con éxito");
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ocurrió un error y no se guardaron los datos");
            }
        } else {
            int index1 = cb_universo.getSelectedIndex();
            int index2 = cb_sv.getSelectedIndex();
            
            if (rootPaneCheckingEnabled) {
                
            }
            
            for (Universo un : au.getListaUniverso()) {
                for (SerVivo ser : un.getSeres()) {
                    modelo.addElement(ser);
                }
            }

            ((SerVivo) au.getListaUniverso().get(index1).getSeres().get(index2)).setNombre(tf_nombre.getText());
            ((SerVivo) au.getListaUniverso().get(index1).getSeres().get(index2)).setPoder(Integer.parseInt(sp_poder.getValue().toString()));
            ((SerVivo) au.getListaUniverso().get(index1).getSeres().get(index2)).setYear(Integer.parseInt(tf_año.getText()));
            ((SerVivo) au.getListaUniverso().get(index1).getSeres().get(index2)).setProcedencia(Integer.parseInt(tf_año.getText()));
            au.escribirArchivo();

            tf_nombreR2.setText("");
            tf_usuarioR2.setText("");
            tf_contraseñaR2.setText("");
            JOptionPane.showMessageDialog(jd_administrarR, "Usuario Registro modificado con éxito");
        }
    }//GEN-LAST:event_bt_cmMouseClicked

    private void bt_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarMouseClicked
        if (tb_servivos.getSelectedRow() >= 0) {
            int a = JOptionPane.showConfirmDialog(tb_servivos, "¿Desea eliminar Ser Vivo?", "Eliminar Ser Vivo", YES_NO_OPTION);
            if (a == 0) {
                au.getListaUniverso().remove(tb_servivos.getSelectedRow());
                au.escribirArchivo();
                ListarTabla();
                JOptionPane.showMessageDialog(tb_servivos, "Ser Vivo eliminado con éxito");
            }
        }
    }//GEN-LAST:event_bt_eliminarMouseClicked

    private void bt_agregarSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarSVMouseClicked
        if (au.getListaUniverso().isEmpty()) {
            String nombre = JOptionPane.showInputDialog("Ingrese nombre del nuevo universo");
            au.setUniverso(new Universo(nombre));
            au.escribirArchivo();
        } else {
            ListarCB(1);
        }

        bt_cm.setText("Agregar");
        sv.setVisible(false);
        cb_sv.setVisible(false);
        pn_agregar.setVisible(true);
        pn_eliminar.setVisible(false);
    }//GEN-LAST:event_bt_agregarSVMouseClicked

    private void bt_agregarUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarUMouseClicked
        String nombre = JOptionPane.showInputDialog("Ingrese nombre del nuevo universo");
        au.setUniverso(new Universo(nombre));
        au.escribirArchivo();

        JOptionPane.showConfirmDialog(this, "Universo agregado con éxito");
    }//GEN-LAST:event_bt_agregarUMouseClicked

    private void bt_eliminarSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarSVMouseClicked
        ListarTabla();
        pn_agregar.setVisible(false);
        pn_eliminar.setVisible(true);
    }//GEN-LAST:event_bt_eliminarSVMouseClicked

    private void cb_universoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_universoItemStateChanged
        ListarCB(2);
    }//GEN-LAST:event_cb_universoItemStateChanged

    private void cb_svItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_svItemStateChanged
        SerVivo s = (SerVivo) cb_sv.getSelectedItem();
        tf_nombre.setText(s.getNombre());
        sp_poder.setValue(s.getPoder());
        tf_año.setText(String.valueOf(s.getYear()));
        cb_raza.setSelectedItem(s.getRaza());
    }//GEN-LAST:event_cb_svItemStateChanged

    private void bt_modificarSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarSVMouseClicked
        sv.setVisible(true);
        cb_sv.setVisible(true);
        bt_cm.setText("Modificar");
        
        ListarCB(1);
        ListarCB(2);
        pn_agregar.setVisible(true);
    }//GEN-LAST:event_bt_modificarSVMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameP().setVisible(true);
            }
        });
    }

    private void ListarTabla() {
        try {
            tb_servivos.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{},
                    new String[]{"Nombre", "ID", "Poder", "Años", "Universo de Procedencia", "Raza"}));

            for (Universo u : au.getListaUniverso()) {
                for (SerVivo ser : u.getSeres()) {
                    Object[] row = {((SerVivo) ser).getNombre(), ((SerVivo) ser).getID(), ((SerVivo) ser).getPoder(), ((SerVivo) ser).getYear(),
                        ((SerVivo) ser).getProcedencia(), ((SerVivo) ser).getRaza()};
                    DefaultTableModel modelo = (DefaultTableModel) tb_servivos.getModel();
                    modelo.addRow(row);
                    tb_servivos.setModel(modelo);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void ListarCB(int tipo) {
        if (tipo == 1) {//universo
            cb_universo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_universo.getModel();
            modelo.removeAllElements();

            for (Universo u : au.getListaUniverso()) {
                modelo.addElement(u);
            }

            cb_universo.setModel(modelo);
        } else {
            cb_sv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_sv.getModel();
            modelo.removeAllElements();

            for (Universo un : au.getListaUniverso()) {
                for (SerVivo ser : un.getSeres()) {
                    modelo.addElement(ser);
                }
            }

            cb_sv.setModel(modelo);
        }

    }

    private int ID() {
        for (Universo u : au.getListaUniverso()) {
            if (!u.getSeres().isEmpty()) {
                ID = u.getSeres().size()-1;
            }
        }
        return ID;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregarSV;
    private javax.swing.JButton bt_agregarU;
    private javax.swing.JButton bt_cm;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_eliminarSV;
    private javax.swing.JButton bt_modificarSV;
    private javax.swing.JLabel cb;
    private javax.swing.JComboBox<String> cb_raza;
    private javax.swing.JComboBox<String> cb_sv;
    private javax.swing.JComboBox<String> cb_universo;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_agregar;
    private javax.swing.JPanel pn_eliminar;
    private javax.swing.JSpinner sp_poder;
    private javax.swing.JLabel sv;
    private javax.swing.JTable tb_servivos;
    private javax.swing.JTextField tf_año;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}
