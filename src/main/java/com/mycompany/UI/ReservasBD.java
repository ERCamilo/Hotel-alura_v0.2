package com.mycompany.UI;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.Controller.ConexionController;
import com.mycompany.Controller.HuespedController;
import com.mycompany.Controller.ReservaController;
import com.mycompany.Controller.TablaController;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class ReservasBD extends javax.swing.JFrame {

     HuespedController admHuesped = new HuespedController();
     ReservaController admReservas = new ReservaController();
    

    public ReservasBD() {
        initComponents();
        admHuesped.listarHuesped();
        admReservas.listarReserva();
        admReservas.llenarTablaReservas(Tabla_reservas);
        admHuesped.llenarTablaHuesped(Tabla_huespedes);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Txt_filtro = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_huespedes = new javax.swing.JTable();
        Btn_ediHuespedes = new javax.swing.JButton();
        Btn_eliHuespedes = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_reservas = new javax.swing.JTable();
        btn_EliminarTablaReserva = new javax.swing.JButton();
        Btn_editTablaReserva = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(12, 138, 199));
        jLabel1.setText("SISTEMA DE BUSQUEDA");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jButton1.setBackground(new java.awt.Color(12, 138, 199));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, -1, 36));

        Txt_filtro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Txt_filtro.setForeground(new java.awt.Color(153, 153, 153));
        Txt_filtro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(12, 138, 199)));
        Txt_filtro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_filtroMouseClicked(evt);
            }
        });
        Txt_filtro.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Txt_filtroInputMethodTextChanged(evt);
            }
        });
        Txt_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_filtroActionPerformed(evt);
            }
        });
        Txt_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_filtroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Txt_filtroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_filtroKeyTyped(evt);
            }
        });
        jPanel5.add(Txt_filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 219, 36));

        jTabbedPane1.setBackground(new java.awt.Color(12, 138, 199));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Tabla_huespedes.setAutoCreateRowSorter(true);
        Tabla_huespedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "idHuesped", "Nombre", "Apellido", "Fecha de Nacionalidad", "Nacionalidad", "Telefono", "Numero de Reserva"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla_huespedes);

        Btn_ediHuespedes.setBackground(new java.awt.Color(12, 138, 199));
        Btn_ediHuespedes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btn_ediHuespedes.setForeground(new java.awt.Color(255, 255, 255));
        Btn_ediHuespedes.setText("EDITAR");
        Btn_ediHuespedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ediHuespedesActionPerformed(evt);
            }
        });

        Btn_eliHuespedes.setBackground(new java.awt.Color(234, 15, 19));
        Btn_eliHuespedes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btn_eliHuespedes.setForeground(new java.awt.Color(255, 255, 255));
        Btn_eliHuespedes.setText("ELIMINAR");
        Btn_eliHuespedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_eliHuespedesActionPerformed(evt);
            }
        });

        jButton2.setText("ATRAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_ediHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_eliHuespedes)
                .addGap(15, 15, 15))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_eliHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_ediHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Huespedes", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Tabla_reservas.setAutoCreateRowSorter(true);
        Tabla_reservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, "", null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Numero Reserva", "Fecha Check In", "Fecha Check Out", "Valor", "Forma de Pago", "ID Huesped"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_reservas.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(Tabla_reservas);
        Tabla_reservas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (Tabla_reservas.getColumnModel().getColumnCount() > 0) {
            Tabla_reservas.getColumnModel().getColumn(0).setResizable(false);
        }

        btn_EliminarTablaReserva.setBackground(new java.awt.Color(234, 15, 19));
        btn_EliminarTablaReserva.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_EliminarTablaReserva.setForeground(new java.awt.Color(255, 255, 255));
        btn_EliminarTablaReserva.setText("ELIMINAR");
        btn_EliminarTablaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarTablaReservaActionPerformed(evt);
            }
        });

        Btn_editTablaReserva.setBackground(new java.awt.Color(12, 138, 199));
        Btn_editTablaReserva.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btn_editTablaReserva.setForeground(new java.awt.Color(255, 255, 255));
        Btn_editTablaReserva.setText("EDITAR");
        Btn_editTablaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_editTablaReservaActionPerformed(evt);
            }
        });

        jButton3.setText("ATRAS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_editTablaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_EliminarTablaReserva)
                .addGap(16, 16, 16))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_EliminarTablaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_editTablaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reserva", jPanel3);

        jPanel5.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Ha-100px.png"))); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        buscarEnTabla(admHuesped, admReservas, Tabla_reservas, Tabla_huespedes, Txt_filtro);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ConexionController.closeConnectionHuespedes();
        ConexionController.closeConnectionReservas();

        MenuPrincipalUI ui = new MenuPrincipalUI();
        ui.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        ConexionController.closeConnectionHuespedes();
        ConexionController.closeConnectionReservas();

        MenuPrincipalUI ui = new MenuPrincipalUI();
        ui.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Txt_filtroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_filtroMouseClicked
        if (Txt_filtro.getText().equals("Ingrese su parametro")) {
            Txt_filtro.setText("");
            Txt_filtro.setForeground(Color.black);
        }    }//GEN-LAST:event_Txt_filtroMouseClicked

    private void Txt_filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_filtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_filtroActionPerformed

    private void Btn_ediHuespedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ediHuespedesActionPerformed
        HuespedController hc = new HuespedController();
        hc.modificar(Tabla_huespedes);
    }//GEN-LAST:event_Btn_ediHuespedesActionPerformed

    private void Btn_editTablaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_editTablaReservaActionPerformed
        ReservaController rc = new ReservaController();
        rc.modificar(Tabla_reservas);
    }//GEN-LAST:event_Btn_editTablaReservaActionPerformed

    private void btn_EliminarTablaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarTablaReservaActionPerformed

        ReservaController rc = new ReservaController();
        rc.eliminar(Tabla_reservas);
    }//GEN-LAST:event_btn_EliminarTablaReservaActionPerformed

    private void Btn_eliHuespedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_eliHuespedesActionPerformed
        HuespedController hc = new HuespedController();
        hc.eliminar(Tabla_huespedes);
    }//GEN-LAST:event_Btn_eliHuespedesActionPerformed

    private void Txt_filtroInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Txt_filtroInputMethodTextChanged
//        if (!"".equals(Txt_filtro.getText())) {
//
//            TablaController tc = new TablaController();
//            tc.buscar(Tabla_reservas, Txt_filtro);
//            tc.buscar(Tabla_huespedes, Txt_filtro);
//
//        } else {
//            admHuesped.listarHuesped();
//            admReservas.listarReserva();
//            admReservas.llenarTablaReservas(Tabla_reservas);
//            admHuesped.llenarTablaHuesped(Tabla_huespedes);
//        }


    }//GEN-LAST:event_Txt_filtroInputMethodTextChanged

    private void Txt_filtroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_filtroKeyTyped

        buscarEnTabla(admHuesped, admReservas, Tabla_reservas, Tabla_huespedes, Txt_filtro);
     }//GEN-LAST:event_Txt_filtroKeyTyped

    private void Txt_filtroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_filtroKeyPressed
        buscarEnTabla(admHuesped, admReservas, Tabla_reservas, Tabla_huespedes, Txt_filtro);
    }//GEN-LAST:event_Txt_filtroKeyPressed

    private void Txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_filtroKeyReleased
        buscarEnTabla(admHuesped, admReservas, Tabla_reservas, Tabla_huespedes, Txt_filtro);
    }//GEN-LAST:event_Txt_filtroKeyReleased

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatDarkLaf".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservasBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservasBD().setVisible(true);
            }
        });
    }

    static void buscarEnTabla(HuespedController admHuesped,
     ReservaController admReservas,JTable Tabla_reservas, JTable Tabla_huespedes, JTextField Txt_filtro) {
        admHuesped.listarHuesped();
        admReservas.listarReserva();
        admReservas.llenarTablaReservas(Tabla_reservas);
        admHuesped.llenarTablaHuesped(Tabla_huespedes);

        if (!"".equals(Txt_filtro.getText())) {

            TablaController tc = new TablaController();
            tc.buscar(Tabla_reservas, Txt_filtro);
            tc.buscar(Tabla_huespedes, Txt_filtro);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_ediHuespedes;
    private javax.swing.JButton Btn_editTablaReserva;
    private javax.swing.JButton Btn_eliHuespedes;
    private javax.swing.JTable Tabla_huespedes;
    private javax.swing.JTable Tabla_reservas;
    private javax.swing.JTextField Txt_filtro;
    private javax.swing.JButton btn_EliminarTablaReserva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
