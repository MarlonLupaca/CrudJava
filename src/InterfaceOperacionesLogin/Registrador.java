package InterfaceOperacionesLogin;

import Acciones.LoginAcciones;
import clases.adminC;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import operaciones.loginO;

/**
 *
 * @author Marlon Diego Lupaca
 */
public class Registrador extends javax.swing.JPanel {

    public Registrador() {
        initComponents();
        campo1.setVisible(false);
        campo2.setVisible(false);
        campo3.setVisible(false);

    }
    private void visualizador(JPanel p)
    {
        p.setSize(1150,680);
        p.setLocation(0,0);
        register.removeAll();
        register.setLayout(new BorderLayout());
        register.add(p,BorderLayout.CENTER);
        register.revalidate();
        register.repaint();
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        register = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        registrarse = new javax.swing.JButton();
        contra = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        correo = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        campo2 = new javax.swing.JLabel();
        campo1 = new javax.swing.JLabel();
        campo3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        register.setBackground(new java.awt.Color(46, 48, 147));
        register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoCLIENTE1.png"))); // NOI18N
        jPanel4.add(jLabel3);

        register.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 270, 170));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 194, 201), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel5.setText("Ingresa Correo Electronico:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel6.setText("Ingresa Contraseña:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        registrarse.setBackground(new java.awt.Color(251, 194, 201));
        registrarse.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        registrarse.setForeground(new java.awt.Color(255, 255, 255));
        registrarse.setText("Registrar");
        registrarse.setFocusPainted(false);
        registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarseMouseExited(evt);
            }
        });
        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });
        jPanel2.add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 180, -1));

        contra.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        contra.setBorder(null);
        jPanel2.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 350, 32));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 360, 22));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 360, 20));

        correo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        correo.setBorder(null);
        jPanel2.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 360, 35));

        volver.setBackground(new java.awt.Color(251, 194, 201));
        volver.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.setFocusPainted(false);
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverMouseExited(evt);
            }
        });
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel2.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 150, -1));

        campo2.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        campo2.setForeground(new java.awt.Color(255, 51, 0));
        campo2.setText("Campo Obligatorio (*)");
        jPanel2.add(campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        campo1.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        campo1.setForeground(new java.awt.Color(255, 51, 0));
        campo1.setText("Campo Obligatorio (*)");
        jPanel2.add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        campo3.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        campo3.setForeground(new java.awt.Color(0, 153, 51));
        campo3.setText("REGISTRADO CORRECTAMENTE");
        jPanel2.add(campo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 220, -1));

        register.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 410, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoLogin.png"))); // NOI18N
        register.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
        String correoNuevo = correo.getText().trim();
        String contraNuevo = contra.getText().trim();
        boolean validado = false;
        campo1.setVisible(false);
        campo2.setVisible(false);

        if("".equals(correoNuevo))
        {
            validado = true;
            campo1.setVisible(true);
        }

        if("".equals(correoNuevo))
        {
            validado = true;
            campo2.setVisible(true);
        }
        if(validado)
        {
            return;
        }

        adminC admin = new adminC(correoNuevo,contraNuevo);
        loginO dao = new LoginAcciones();

        try {
            dao.registrar(admin);
            campo3.setVisible(true);
            correo.setText("");
            contra.setText("");
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_registrarseActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        visualizador(new logearse());
    }//GEN-LAST:event_volverActionPerformed

    private void registrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseMouseEntered
        registrarse.setBackground(new Color(0xb0abcb));
    }//GEN-LAST:event_registrarseMouseEntered

    private void registrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseMouseExited
        registrarse.setBackground(new Color(0xFBC2C9));
    }//GEN-LAST:event_registrarseMouseExited

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setBackground(new Color(0xb0abcb));
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setBackground(new Color(0xFBC2C9));
    }//GEN-LAST:event_volverMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel campo1;
    private javax.swing.JLabel campo2;
    private javax.swing.JLabel campo3;
    private javax.swing.JPasswordField contra;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel register;
    private javax.swing.JButton registrarse;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
