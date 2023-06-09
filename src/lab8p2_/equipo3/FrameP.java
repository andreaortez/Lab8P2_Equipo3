package lab8p2_.equipo3;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class FrameP extends javax.swing.JFrame {

    admUniverso au = new admUniverso("./universos.a&t");
    Dba db = new Dba("./lab8.accdb");
    int ID = 0, flag = 0;

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
        pn_cargar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pn_cargar = new javax.swing.JPanel();
        cb2 = new javax.swing.JLabel();
        cb_universo2 = new javax.swing.JComboBox<>();
        pb = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_sv = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        bt_agregarSV = new javax.swing.JButton();
        bt_modificarSV = new javax.swing.JButton();
        bt_eliminarSV = new javax.swing.JButton();
        bt_cargar = new javax.swing.JButton();
        bt_agregarU = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bt_modificarU = new javax.swing.JButton();
        bt_eliminarU = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        bt_busqueda = new javax.swing.JButton();
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
        cb1 = new javax.swing.JLabel();
        cb_universo1 = new javax.swing.JComboBox<>();
        pn_eliminar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_servivos = new javax.swing.JTable();
        bt_eliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_cargar.setBackground(new java.awt.Color(255, 255, 255));
        pn_cargar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb2.setBackground(new java.awt.Color(0, 0, 0));
        cb2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        cb2.setForeground(new java.awt.Color(0, 0, 0));
        cb2.setText("Universo");
        pn_cargar.add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 85, -1));

        cb_universo2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_universo2ItemStateChanged(evt);
            }
        });
        pn_cargar.add(cb_universo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 158, -1));
        pn_cargar.add(pb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 560, 30));

        tb_sv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "ID", "Poder", "Años", "Raza"
            }
        ));
        jScrollPane2.setViewportView(tb_sv);

        pn_cargar.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 550, 360));

        jPanel1.add(pn_cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 600, 500));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_agregarSV.setText("Agregar Ser Vivo");
        bt_agregarSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarSVMouseClicked(evt);
            }
        });
        jPanel2.add(bt_agregarSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        bt_modificarSV.setText("Modificar Ser Vivo");
        bt_modificarSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarSVMouseClicked(evt);
            }
        });
        jPanel2.add(bt_modificarSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        bt_eliminarSV.setText("Eliminar Ser Vivo");
        bt_eliminarSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarSVMouseClicked(evt);
            }
        });
        jPanel2.add(bt_eliminarSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        bt_cargar.setText("Cargar");
        bt_cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cargarMouseClicked(evt);
            }
        });
        jPanel2.add(bt_cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        bt_agregarU.setText("Agregar Universo");
        bt_agregarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarUMouseClicked(evt);
            }
        });
        jPanel2.add(bt_agregarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-----------------------------------------");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 200, -1));

        bt_modificarU.setText("Modificar Universo");
        bt_modificarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarUMouseClicked(evt);
            }
        });
        jPanel2.add(bt_modificarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        bt_eliminarU.setText("Eliminar Universo");
        bt_eliminarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarUMouseClicked(evt);
            }
        });
        jPanel2.add(bt_eliminarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("-----------------------------------------");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 200, -1));

        bt_busqueda.setText("Búsqueda");
        bt_busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_busquedaMouseClicked(evt);
            }
        });
        jPanel2.add(bt_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

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

        cb1.setBackground(new java.awt.Color(0, 0, 0));
        cb1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cb1.setForeground(new java.awt.Color(0, 0, 0));
        cb1.setText("Universo");
        pn_agregar.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 85, -1));

        pn_agregar.add(cb_universo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 158, -1));

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
        if (tb_servivos.getColumnModel().getColumnCount() > 0) {
            tb_servivos.getColumnModel().getColumn(4).setHeaderValue("Universo de Procedencia");
        }

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

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("-----------------------------------------");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 394, 200, -1));

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
                ID++;
                
                db.conectar();
                try {
                    db.query.execute("INSERT INTO Seres Vivos" + " (Nombre,Poder,Años,Universo,Raza)"
                            + " VALUES ('" + tf_nombre.getText() + "', '" + Integer.parseInt(sp_poder.getValue().toString())
                            + "', '" + Integer.valueOf(tf_año.getText()) + "', '" + cb_universo.getSelectedItem().toString()
                            + "', '" + cb_raza.getSelectedItem().toString() + "')");

                    int ser = au.getListaUniverso().get(index).getSeres().size() + 1;
                    db.query.execute("UPDATE Universo set # seres vivo='" + ser + "' where ID=" + (index + 1));
                    db.commit();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                db.desconectar();

                tf_nombre.setText("");
                sp_poder.setValue(1);
                tf_año.setText("");
                cb_raza.setSelectedIndex(1);

                JOptionPane.showMessageDialog(this, "Ser Vivo agregado con éxito");
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ocurrió un error y no se guardaron los datos");
            }
        } else {
            int index1 = cb_universo.getSelectedIndex();
            int index2 = cb_sv.getSelectedIndex();
            int index3 = cb_universo1.getSelectedIndex();
            int id = ((SerVivo) au.getListaUniverso().get(index1).getSeres().get(index2)).getID();

            if (cb_universo.getSelectedItem() != cb_universo1.getSelectedItem()) {
                int index = 0;

                for (int i = 0; i < au.getListaUniverso().get(index1).getSeres().size(); i++) {
                    if (((SerVivo) au.getListaUniverso().get(index1).getSeres().get(i)).getNombre().equals(cb_sv.getSelectedItem().toString())) {
                        index = i;
                    }
                }

                au.getListaUniverso().get(index3).getSeres().add(new SerVivo(tf_nombre.getText(), id, Integer.parseInt(sp_poder.getValue().toString()),
                        Integer.parseInt(tf_año.getText()), cb_universo1.getSelectedItem().toString(), cb_raza.getSelectedItem().toString()));
                au.getListaUniverso().get(index1).getSeres().remove(index);

            } else {
                ((SerVivo) au.getListaUniverso().get(index1).getSeres().get(index2)).setNombre(tf_nombre.getText());
                ((SerVivo) au.getListaUniverso().get(index1).getSeres().get(index2)).setPoder(Integer.parseInt(sp_poder.getValue().toString()));
                ((SerVivo) au.getListaUniverso().get(index1).getSeres().get(index2)).setYear(Integer.parseInt(tf_año.getText()));
                ((SerVivo) au.getListaUniverso().get(index1).getSeres().get(index2)).setRaza(cb_raza.getSelectedItem().toString());
            }

            au.escribirArchivo();

            db.conectar();
            try {
                db.query.execute("UPDATE Ser Vivos set Nombre=" + tf_nombre.getText() + ", Poder=" + sp_poder.getValue().toString() + ", Años="
                        + tf_año.getText() + "Universo=" + cb_universo1.getSelectedItem().toString() + ", Raza=" + cb_raza.getSelectedItem().toString()
                        + "where ID=" + id);
                db.commit();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();

            tf_nombre.setText("");
            sp_poder.setValue(1);
            tf_año.setText("");
            cb_raza.setSelectedIndex(1);
            JOptionPane.showMessageDialog(this, "Ser Vivo modificado con éxito");
        }
    }//GEN-LAST:event_bt_cmMouseClicked

    private void bt_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarMouseClicked
        if (tb_servivos.getSelectedRow() >= 0) {
            int a = JOptionPane.showConfirmDialog(this, "¿Desea eliminar Ser Vivo?", "Eliminar Ser Vivo", YES_NO_OPTION);
            if (a == 0) {
                au.getListaUniverso().remove(tb_servivos.getSelectedRow());
                au.escribirArchivo();

                db.conectar();
                try {
                    db.query.execute("DELETE from Seres Vivos where Id=" + (tb_servivos.getSelectedRow() + 1));
                    db.commit();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                db.desconectar();

                ListarTabla(tb_servivos, 1);
                JOptionPane.showMessageDialog(this, "Ser Vivo eliminado con éxito");
            }
        }
    }//GEN-LAST:event_bt_eliminarMouseClicked

    private void bt_agregarSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarSVMouseClicked
        flag = 0;

        if (au.getListaUniverso().isEmpty()) {
            String nombre = JOptionPane.showInputDialog("Ingrese nombre del nuevo universo");
            au.setUniverso(new Universo(nombre));
            au.escribirArchivo();
        } else {
            ListarCB(cb_universo, 1);
        }

        bt_cm.setText("Agregar");
        sv.setVisible(false);
        cb_sv.setVisible(false);
        cb1.setVisible(false);
        cb_universo1.setVisible(false);

        pn_agregar.setVisible(true);
        pn_eliminar.setVisible(false);
        pn_cargar.setVisible(false);
    }//GEN-LAST:event_bt_agregarSVMouseClicked

    private void bt_agregarUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarUMouseClicked
        String nombre = JOptionPane.showInputDialog("Ingrese nombre del nuevo universo");
        au.setUniverso(new Universo(nombre));
        au.escribirArchivo();

        db.conectar();
        try {
            db.query.execute("INSERT INTO Universo" + " (Nombre)" + " VALUES ('" + nombre + "')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();

        JOptionPane.showMessageDialog(this, "Universo agregado con éxito");
    }//GEN-LAST:event_bt_agregarUMouseClicked

    private void bt_eliminarSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarSVMouseClicked
        ListarTabla(tb_servivos, 1);

        pn_agregar.setVisible(false);
        pn_eliminar.setVisible(true);
        pn_cargar.setVisible(false);
    }//GEN-LAST:event_bt_eliminarSVMouseClicked

    private void cb_universoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_universoItemStateChanged
        ListarCB(cb_sv, 2);
    }//GEN-LAST:event_cb_universoItemStateChanged

    private void cb_svItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_svItemStateChanged
        if (flag == 1) {
            SerVivo s = (SerVivo) cb_sv.getSelectedItem();
            tf_nombre.setText(s.getNombre());
            sp_poder.setValue(s.getPoder());
            tf_año.setText(String.valueOf(s.getYear()));
            cb_raza.setSelectedItem(s.getRaza());
        }
    }//GEN-LAST:event_cb_svItemStateChanged

    private void bt_modificarSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarSVMouseClicked
        sv.setVisible(true);
        cb_sv.setVisible(true);
        bt_cm.setText("Modificar");
        cb1.setVisible(true);
        cb_universo1.setVisible(true);
        flag = 1;

        ListarCB(cb_universo, 1);
        ListarCB(cb_universo1, 1);
        ListarCB(cb_sv, 2);
        pn_agregar.setVisible(true);
        pn_eliminar.setVisible(false);
        pn_cargar.setVisible(false);
    }//GEN-LAST:event_bt_modificarSVMouseClicked

    private void bt_modificarUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarUMouseClicked
        int pos = Integer.parseInt(JOptionPane.showInputDialog(ListarUniversos() + "Ingrese posición del universo a modificar"));

        String nombre = JOptionPane.showInputDialog("Ingrese nuevo nombre del universo");

        au.getListaUniverso().get(pos).setNombre(nombre);
        au.escribirArchivo();

        int id = pos + 1;
        db.conectar();
        try {
            db.query.execute("UPDATE Universo set nombre='" + nombre + "' where ID=" + id);
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();

        JOptionPane.showMessageDialog(this, "Universo modificado éxitosamente");
    }//GEN-LAST:event_bt_modificarUMouseClicked

    private void bt_eliminarUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarUMouseClicked
        int pos = Integer.parseInt(JOptionPane.showInputDialog(ListarUniversos() + "Ingrese posición del universo a eliminar"));

        au.getListaUniverso().remove(pos);
        au.escribirArchivo();

        db.conectar();
        try {
            db.query.execute("DELETE from Universo where ID=" + (pos + 1));
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();

        JOptionPane.showMessageDialog(this, "Universo eliminado éxitosamente");
    }//GEN-LAST:event_bt_eliminarUMouseClicked

    private void cb_universo2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_universo2ItemStateChanged
        Universo u = (Universo) cb_universo2.getSelectedItem();
        DefaultTableModel modelo = (DefaultTableModel) tb_sv.getModel();
        modelo.setRowCount(0);
        admBarra h = new admBarra(pb, u, tb_sv);
        Thread proceso1 = new Thread(h);
        proceso1.start();
    }//GEN-LAST:event_cb_universo2ItemStateChanged

    private void bt_cargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cargarMouseClicked
        pn_cargar.setVisible(true);
        pn_agregar.setVisible(false);
        pn_eliminar.setVisible(false);

        ListarCB(cb_universo2, 1);
        tb_sv.removeAll();
    }//GEN-LAST:event_bt_cargarMouseClicked

    private void bt_busquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_busquedaMouseClicked
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Ser Vivo");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posición del universo a eliminar"));

        boolean valid = false;
        for (Universo u : au.getListaUniverso()) {
            for (SerVivo v : u.getSeres()) {
                if (v.getNombre().equals(nombre) && v.getID() == id) {
                    valid = true;
                }
            }
        }
        if (valid == true) {
            JOptionPane.showMessageDialog(null,
                    "El Ser Vivo esta registrado en el sistema");
        } else {
            JOptionPane.showMessageDialog(null,
                    "El Ser Vivo no esta registrado en el sistema");
        }

    }//GEN-LAST:event_bt_busquedaMouseClicked

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

    private String ListarUniversos() {
        String cad = "";
        int cont = 0;
        for (Universo u : au.getListaUniverso()) {
            cad += cont + " - " + u.getNombre() + "\n";
            cont++;
        }

        return cad;
    }

    private void ListarTabla(JTable temp, int tipo) {
        try {
            if (tipo == 1) {
                temp.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{},
                        new String[]{"Nombre", "ID", "Poder", "Años", "Universo de Procedencia", "Raza"}));

                for (Universo u : au.getListaUniverso()) {
                    for (SerVivo ser : u.getSeres()) {
                        Object[] row = {((SerVivo) ser).getNombre(), ((SerVivo) ser).getID(), ((SerVivo) ser).getPoder(), ((SerVivo) ser).getYear(),
                            ((SerVivo) ser).getProcedencia(), ((SerVivo) ser).getRaza()};
                        DefaultTableModel modelo = (DefaultTableModel) temp.getModel();
                        modelo.addRow(row);
                        temp.setModel(modelo);
                    }
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void ListarCB(JComboBox temp, int tipo) {
        if (tipo == 1) {//universo
            temp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) temp.getModel();
            modelo.removeAllElements();

            for (Universo u : au.getListaUniverso()) {
                modelo.addElement(u);
            }

            temp.setModel(modelo);
        } else {
            temp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) temp.getModel();
            modelo.removeAllElements();

            for (Universo un : au.getListaUniverso()) {
                for (SerVivo ser : un.getSeres()) {
                    modelo.addElement(ser);
                }
            }

            temp.setModel(modelo);
        }

    }

    private int ID() {
        for (Universo u : au.getListaUniverso()) {
            if (!u.getSeres().isEmpty()) {
                ID = u.getSeres().size() - 1;
            }
        }
        return ID;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregarSV;
    private javax.swing.JButton bt_agregarU;
    private javax.swing.JButton bt_busqueda;
    private javax.swing.JButton bt_cargar;
    private javax.swing.JButton bt_cm;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_eliminarSV;
    private javax.swing.JButton bt_eliminarU;
    private javax.swing.JButton bt_modificarSV;
    private javax.swing.JButton bt_modificarU;
    private javax.swing.JLabel cb;
    private javax.swing.JLabel cb1;
    private javax.swing.JLabel cb2;
    private javax.swing.JComboBox<String> cb_raza;
    private javax.swing.JComboBox<String> cb_sv;
    private javax.swing.JComboBox<String> cb_universo;
    private javax.swing.JComboBox<String> cb_universo1;
    private javax.swing.JComboBox<String> cb_universo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JProgressBar pb;
    private javax.swing.JPanel pn_agregar;
    private javax.swing.JPanel pn_cargar;
    private javax.swing.JPanel pn_eliminar;
    private javax.swing.JSpinner sp_poder;
    private javax.swing.JLabel sv;
    private javax.swing.JTable tb_servivos;
    private javax.swing.JTable tb_sv;
    private javax.swing.JTextField tf_año;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}
