
package InterfaceOperacionesLogin;

import Acciones.LoginAcciones;
import interfaces.MenuPrincipal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import operaciones.loginO;

/**
 *
 * @author Marlon Diego Lupaca
 */
public class logearse extends javax.swing.JPanel {

    public logearse() {
        initComponents();
        
        campo1.setVisible(false);
        campo2.setVisible(false);
        campo3.setVisible(false);
    }
    
    
    
    
    
    
    
    private void visualizador(JPanel p)
    {
        p.setSize(470,620);
        p.setLocation(0,0);
        mostra.removeAll();
        mostra.setLayout(new BorderLayout());
        mostra.add(p,BorderLayout.CENTER);
        mostra.revalidate();
        mostra.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostra = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        registrarse = new javax.swing.JButton();
        contra = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        correo = new javax.swing.JTextField();
        campo1 = new javax.swing.JLabel();
        campo2 = new javax.swing.JLabel();
        campo3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(470, 620));
        setPreferredSize(new java.awt.Dimension(470, 620));

        mostra.setMinimumSize(new java.awt.Dimension(470, 620));
        mostra.setName(""); // NOI18N
        mostra.setPreferredSize(new java.awt.Dimension(470, 620));
        mostra.setVerifyInputWhenFocusTarget(false);
        mostra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoCLIENTE1.png"))); // NOI18N
        jPanel4.add(jLabel3);

        mostra.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 410, 170));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 194, 201), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel5.setText("Correo Electronico:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel6.setText("Contraseña:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        ingresar.setBackground(new java.awt.Color(251, 194, 201));
        ingresar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        ingresar.setForeground(new java.awt.Color(255, 255, 255));
        ingresar.setText("Ingresar");
        ingresar.setFocusPainted(false);
        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarMouseExited(evt);
            }
        });
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        jPanel2.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 180, -1));

        registrarse.setBackground(new java.awt.Color(251, 194, 201));
        registrarse.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        registrarse.setForeground(new java.awt.Color(255, 255, 255));
        registrarse.setText("Registrarse");
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
        jPanel2.add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 180, -1));

        contra.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        contra.setBorder(null);
        jPanel2.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 350, 32));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 360, 22));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 360, 20));

        correo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        correo.setBorder(null);
        jPanel2.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 360, 35));

        campo1.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        campo1.setForeground(new java.awt.Color(255, 51, 0));
        campo1.setText("Campo Obligatorio (*)");
        jPanel2.add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        campo2.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        campo2.setForeground(new java.awt.Color(255, 51, 0));
        campo2.setText("Campo Obligatorio (*)");
        jPanel2.add(campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        campo3.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        campo3.setForeground(new java.awt.Color(255, 51, 0));
        campo3.setText("Usuario no registrado (*)");
        jPanel2.add(campo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        mostra.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 410, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoLogin.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(470, 610));
        mostra.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        loginO dao = new LoginAcciones();
        Map<String, String> ListaAdmin = new HashMap<>();
        boolean validado = false;
        campo1.setVisible(false);
        campo2.setVisible(false);
        String correo1 = correo.getText().trim();
        String contra1 = contra.getText().trim();

        if("".equals(correo1))
        {
            validado = true;
            campo1.setVisible(true);
        }

        if("".equals(contra1))
        {
            validado = true;
            campo2.setVisible(true);
        }
        if(validado)
        {
            return;
        }

        try {
            ListaAdmin = dao.obtenerAdmins();

            for (Map.Entry<String, String> entry : ListaAdmin.entrySet()) {
                String correo2 = entry.getKey();
                String contra2 = entry.getValue();
                if(correo1.equals(correo2) && contra1.equals(contra2))
                {
                    MenuPrincipal menu = new MenuPrincipal();
                    menu.setVisible(true);
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    frame.dispose();

                }else
                {
                    campo3.setVisible(true);
                }
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_ingresarActionPerformed

    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
        visualizador(new Registrador());
    }//GEN-LAST:event_registrarseActionPerformed

    private void ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseEntered
        ingresar.setBackground(new Color(0xb0abcb));
    }//GEN-LAST:event_ingresarMouseEntered

    private void ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseExited
        ingresar.setBackground(new Color(0xFBC2C9));
    }//GEN-LAST:event_ingresarMouseExited

    private void registrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseMouseEntered
        registrarse.setBackground(new Color(0xb0abcb));
    }//GEN-LAST:event_registrarseMouseEntered

    private void registrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseMouseExited
        registrarse.setBackground(new Color(0xFBC2C9));
    }//GEN-LAST:event_registrarseMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel campo1;
    private javax.swing.JLabel campo2;
    private javax.swing.JLabel campo3;
    private javax.swing.JPasswordField contra;
    private javax.swing.JTextField correo;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel mostra;
    private javax.swing.JButton registrarse;
    // End of variables declaration//GEN-END:variables
}
