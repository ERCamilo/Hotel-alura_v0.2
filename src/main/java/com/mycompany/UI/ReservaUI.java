package com.mycompany.UI;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.hotel.Reservas;
import java.sql.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ReservaUI extends javax.swing.JFrame {
    
  public static Reservas reserva;
    
    public ReservaUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Date_out = new com.toedter.calendar.JDateChooser();
        Txt_costo = new javax.swing.JTextField();
        Btn_calcularCosto = new javax.swing.JButton();
        Date_in = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        Txt_dias = new javax.swing.JTextField();
        btn_continuar = new javax.swing.JButton();
        Btn_atras = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Box_formaDePago = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Date_out.setIcon(new ImageIcon(getClass().getResource("/com/mycompany/imagenes/calendario.png")));
        jPanel1.add(Date_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 200, 230, 40));

        Txt_costo.setToolTipText("");
        Txt_costo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(12, 138, 199)));
        Txt_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_costoActionPerformed(evt);
            }
        });
        jPanel1.add(Txt_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 60, 40));

        Btn_calcularCosto.setText("Calcular");
        Btn_calcularCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_calcularCostoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_calcularCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 80, 40));

        Date_in.setIcon(new ImageIcon(getClass().getResource("/com/mycompany/imagenes/calendario.png")));
        jPanel1.add(Date_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 230, 40));

        jLabel1.setText("Costo: $20 x Dia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        Txt_dias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(12, 138, 199)));
        Txt_dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_diasActionPerformed(evt);
            }
        });
        jPanel1.add(Txt_dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 60, 40));

        btn_continuar.setBackground(new java.awt.Color(12, 138, 199));
        btn_continuar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_continuar.setForeground(new java.awt.Color(255, 255, 255));
        btn_continuar.setText("Continuar");
        btn_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continuarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, 40));

        Btn_atras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_atras.setText("Atras");
        Btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_atrasActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 100, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("FECHA DE CHECK IN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("FECHA DE CHECK OUT");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(12, 138, 199));
        jLabel8.setText("SISTEMA DE RESERVA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        Box_formaDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EFECTIVO", "CREDITO", "DEBITO", "PAYPAL" }));
        jPanel1.add(Box_formaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 240, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        jPanel2.setBackground(new java.awt.Color(12, 138, 199));
        jPanel2.setForeground(new java.awt.Color(12, 138, 199));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/reservas-img-3.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 490, 300));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/Ha-100px.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 0, 502, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_costoActionPerformed


    }//GEN-LAST:event_Txt_costoActionPerformed

    private void Btn_calcularCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_calcularCostoActionPerformed
        long minisegundosPorDia = 86400000;

        double dateIn = Date_in.getDate().getTime() / minisegundosPorDia;
        double dateOut = Date_out.getDate().getTime() / minisegundosPorDia;

        Integer dias = (int) (dateOut - dateIn);

        double costo = 20 * dias;

        if (costo <= 0) {
            JOptionPane.showMessageDialog(null, "La fecha de check out debe ser despues almenos un dia mas que el check in");
        } else {
            Txt_costo.setText(Double.toString(costo));
            Txt_dias.setText(Integer.toString(dias) + " dias");

        }
    }//GEN-LAST:event_Btn_calcularCostoActionPerformed

    private void Txt_diasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_diasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_diasActionPerformed

    private void Btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_atrasActionPerformed
        MenuPrincipalUI ui = new MenuPrincipalUI();
        ui.setVisible(true);
        dispose();

    }//GEN-LAST:event_Btn_atrasActionPerformed

    private void btn_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continuarActionPerformed

       Date checkIn = new java.sql.Date(Date_in.getDate().getTime());
       Date checkOut = new java.sql.Date(Date_out.getDate().getTime());
       
        

        try {
            Reservas reserva = new Reservas(checkIn, checkOut, Double.valueOf(Txt_costo.getText()), Box_formaDePago.getSelectedItem().toString());
            this.reserva = reserva;
            
            ReguistroHuespedUI ui = new ReguistroHuespedUI();
            ui.setVisible(true);

            dispose();
        }catch(Exception e){
            System.out.println("com.mycompany.UI.ReservaUI.btn_continuarActionPerformed()");
             System.out.println("Debes completar todos los datos");
             JOptionPane.showMessageDialog(rootPane, "Todos los datos deben de estar correctamente completados");
        }

    }//GEN-LAST:event_btn_continuarActionPerformed

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
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
            java.util.logging.Logger.getLogger(ReservaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Box_formaDePago;
    private javax.swing.JButton Btn_atras;
    private javax.swing.JButton Btn_calcularCosto;
    private com.toedter.calendar.JDateChooser Date_in;
    private com.toedter.calendar.JDateChooser Date_out;
    private javax.swing.JTextField Txt_costo;
    private javax.swing.JTextField Txt_dias;
    private javax.swing.JButton btn_continuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
