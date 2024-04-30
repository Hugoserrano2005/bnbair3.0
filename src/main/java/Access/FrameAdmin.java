/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Access;

import javax.swing.ImageIcon;

/**
 *
 * @author hugos
 */
public class FrameAdmin extends javax.swing.JFrame {

    /**
     * Creates new form FrameAdmin
     */
    public FrameAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ConsultaInmuebleButton = new javax.swing.JButton();
        ConsultaReservaButton = new javax.swing.JButton();
        ConsultaUserButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        inicioMenu = new javax.swing.JMenu();
        ConsultaInmuebles = new javax.swing.JMenuItem();
        ConsultaReservas = new javax.swing.JMenuItem();
        ConsultaUsuarios = new javax.swing.JMenuItem();
        quitmenu = new javax.swing.JMenu();
        CerrarSesion = new javax.swing.JMenuItem();
        Quit = new javax.swing.JMenuItem();

        jLabel8.setText("jLabel8");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(220, 154, 98));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(80, 0, 0));
        jLabel1.setFont(new java.awt.Font("Caladea", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PANEL ADMINISTRADOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        ConsultaInmuebleButton.setText("Acceder");
        ConsultaInmuebleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaInmuebleButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ConsultaInmuebleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        ConsultaReservaButton.setText("Acceder");
        ConsultaReservaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaReservaButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ConsultaReservaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        ConsultaUserButton.setText("Acceder");
        ConsultaUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaUserButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ConsultaUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setText("Consulta de inmuebles");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel3.setText("Consulta de reservas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel4.setText("Consulta de usuarios");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        ImageIcon a = new ImageIcon("src/main/java/com/images/mansion.png");
        jLabel6.setIcon(a);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 128, 128));

        ImageIcon b = new ImageIcon("src/main/java/com/images/lettericon.png");
        jLabel7.setIcon(b);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 130, 130));

        ImageIcon c = new ImageIcon("src/main/java/com/images/User_icon-cp.png");
        jLabel5.setIcon(c);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 120, 150));

        ImageIcon e = new ImageIcon("src/main/java/com/images/icon-admin.png");
        jLabel10.setIcon(e);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 45, 45));

        jPanel2.setBackground(new java.awt.Color(169, 116, 81));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImageIcon d = new ImageIcon("src/main/java/com/images/logo2rec.png");
        jLabel9.setIcon(d);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 106, 125));

        jLabel11.setBackground(new java.awt.Color(80, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(80, 0, 0));
        jLabel11.setText("JAVABNB");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 240, 500));

        inicioMenu.setText("Menu");

        ImageIcon casa = new ImageIcon("src/main/java/com/images/CasaEmoji.png");
        ConsultaInmuebles.setIcon(casa);
        ConsultaInmuebles.setText("Consulta de inmuebles");
        ConsultaInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaInmueblesActionPerformed(evt);
            }
        });
        inicioMenu.add(ConsultaInmuebles);

        ImageIcon libro = new ImageIcon("src/main/java/com/images/LibroEmoji.png");
        ConsultaReservas.setIcon(libro);
        ConsultaReservas.setText("Consulta de Reservas");
        ConsultaReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaReservasActionPerformed(evt);
            }
        });
        inicioMenu.add(ConsultaReservas);

        ImageIcon persona = new ImageIcon("src/main/java/com/images/PersonaEmoji.png");
        ConsultaUsuarios.setIcon(persona);
        ConsultaUsuarios.setText("Consulta de usuarios");
        ConsultaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaUsuariosActionPerformed(evt);
            }
        });
        inicioMenu.add(ConsultaUsuarios);

        jMenuBar1.add(inicioMenu);

        quitmenu.setText("Salir");

        ImageIcon cSesion = new ImageIcon("src/main/java/com/images/Puerta.png");
        CerrarSesion.setIcon(cSesion);
        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        quitmenu.add(CerrarSesion);

        ImageIcon apagar = new ImageIcon("src/main/java/com/images/shootDown.png");
        Quit.setIcon(apagar);
        Quit.setText("Cerrar App");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });
        quitmenu.add(Quit);

        jMenuBar1.add(quitmenu);

        setJMenuBar(jMenuBar1);

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

    private void ConsultaInmuebleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaInmuebleButtonActionPerformed
        // TODO add your handling code here:
        FrameConsultaInmuebles inmuebles= new FrameConsultaInmuebles();
        inmuebles.setVisible(true);
        dispose();
    }//GEN-LAST:event_ConsultaInmuebleButtonActionPerformed

    private void ConsultaInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaInmueblesActionPerformed
        // TODO add your handling code here:
        FrameConsultaInmuebles inmuebles= new FrameConsultaInmuebles();
        inmuebles.setVisible(true);
        dispose();
    }//GEN-LAST:event_ConsultaInmueblesActionPerformed

    private void ConsultaReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaReservasActionPerformed
        // TODO add your handling code here:
        FrameConsultaReservas reservas= new FrameConsultaReservas();
        reservas.setVisible(true);
        dispose();
    }//GEN-LAST:event_ConsultaReservasActionPerformed

    private void ConsultaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaUsuariosActionPerformed
        // TODO add your handling code here:
        FrameConsultaUsers usuarios= new FrameConsultaUsers();
        usuarios.setVisible(true);
        dispose();
    }//GEN-LAST:event_ConsultaUsuariosActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // TODO add your handling code here:
        FrameInicio inicio= new FrameInicio();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_QuitActionPerformed

    private void ConsultaReservaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaReservaButtonActionPerformed
        // TODO add your handling code here:
        FrameConsultaReservas reservas= new FrameConsultaReservas();
        reservas.setVisible(true);
        dispose();
    }//GEN-LAST:event_ConsultaReservaButtonActionPerformed

    private void ConsultaUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaUserButtonActionPerformed
        // TODO add your handling code here:
        FrameConsultaUsers usuarios= new FrameConsultaUsers();
        usuarios.setVisible(true);
        dispose();
    }//GEN-LAST:event_ConsultaUserButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CerrarSesion;
    private javax.swing.JButton ConsultaInmuebleButton;
    private javax.swing.JMenuItem ConsultaInmuebles;
    private javax.swing.JButton ConsultaReservaButton;
    private javax.swing.JMenuItem ConsultaReservas;
    private javax.swing.JButton ConsultaUserButton;
    private javax.swing.JMenuItem ConsultaUsuarios;
    private javax.swing.JMenuItem Quit;
    private javax.swing.JMenu inicioMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu quitmenu;
    // End of variables declaration//GEN-END:variables
}
