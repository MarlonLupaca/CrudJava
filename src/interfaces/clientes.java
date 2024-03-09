package interfaces;
import InterfacesOperacionesCategorias.BuscarC;
import interfacesOperacionesClientes.BuscarClientes;
import InterfacesOperacionesCategorias.EliminarC;
import interfacesOperacionesClientes.EliminarClientes;
import InterfacesOperacionesCategorias.ModificarC;
import interfacesOperacionesClientes.ModificarClientes;
import InterfacesOperacionesCategorias.RegistrarC;
import interfacesOperacionesClientes.RegistrarClientes;
import InterfacesOperacionesCategorias.categoriaPrincipal;
import interfacesOperacionesClientes.clientesPrincipal;
import java.awt.BorderLayout;
import javax.swing.JPanel;
/**
 *
 * @author Marlon Diego Lupaca
 */
public class clientes extends javax.swing.JPanel {
    
    
    public clientes() {
        initComponents();
        this.inicializador();  
        
        
    }
    private void inicializador()
    {
       visualizador(new clientesPrincipal());
    }
    
    private void visualizador(JPanel p)
    {
        p.setSize(1150,580);
        p.setLocation(0,0);
        jPanel1.removeAll();
        jPanel1.add(p,BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCategoria = new javax.swing.JPanel();
        panelC = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        ci = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        cambiar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCategoria.setPreferredSize(new java.awt.Dimension(850, 800));

        panelC.setBackground(new java.awt.Color(255, 255, 255));
        panelC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        ci.setFont(new java.awt.Font("Roboto", 0, 60)); // NOI18N
        ci.setForeground(new java.awt.Color(51, 51, 51));
        ci.setText("Clientes");
        ci.setToolTipText("");
        ci.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ci.setContentAreaFilled(false);
        ci.setFocusPainted(false);
        ci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ci, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ci, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        panelC.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1150, 90));

        jPanel16.setBackground(new java.awt.Color(46, 48, 147));
        jPanel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelC.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 50));

        cambiar.setBackground(new java.awt.Color(255, 231, 221));
        cambiar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        cambiar.setForeground(new java.awt.Color(51, 51, 51));
        cambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconmodificar.png"))); // NOI18N
        cambiar.setText("Modificar");
        cambiar.setToolTipText("");
        cambiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 48, 147), 2));
        cambiar.setContentAreaFilled(false);
        cambiar.setFocusPainted(false);
        cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarActionPerformed(evt);
            }
        });
        panelC.add(cambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(861, 140, 288, 75));

        eliminar.setBackground(new java.awt.Color(255, 231, 221));
        eliminar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        eliminar.setForeground(new java.awt.Color(51, 51, 51));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconeliminar.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setToolTipText("");
        eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 48, 147), 2));
        eliminar.setContentAreaFilled(false);
        eliminar.setFocusPainted(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        panelC.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 140, 288, 75));

        registrar.setBackground(new java.awt.Color(255, 231, 221));
        registrar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        registrar.setForeground(new java.awt.Color(51, 51, 51));
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconregistrar.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.setToolTipText("");
        registrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 48, 147), 2));
        registrar.setContentAreaFilled(false);
        registrar.setFocusPainted(false);
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        panelC.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 140, 288, 75));

        buscar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        buscar.setForeground(new java.awt.Color(51, 51, 51));
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconbuscar.png"))); // NOI18N
        buscar.setText("Buscar");
        buscar.setToolTipText("");
        buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 48, 147), 2));
        buscar.setContentAreaFilled(false);
        buscar.setFocusPainted(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        panelC.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 288, 75));

        javax.swing.GroupLayout PanelCategoriaLayout = new javax.swing.GroupLayout(PanelCategoria);
        PanelCategoria.setLayout(PanelCategoriaLayout);
        PanelCategoriaLayout.setHorizontalGroup(
            PanelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(PanelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCategoriaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelC, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PanelCategoriaLayout.setVerticalGroup(
            PanelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(PanelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCategoriaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelC, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(PanelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 220));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1150, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void ciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciActionPerformed
        this.inicializador();
    }//GEN-LAST:event_ciActionPerformed

    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarActionPerformed
        visualizador(new ModificarClientes());
    }//GEN-LAST:event_cambiarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        visualizador(new EliminarClientes());
    }//GEN-LAST:event_eliminarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        visualizador(new RegistrarClientes());
    }//GEN-LAST:event_registrarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        visualizador(new BuscarClientes());
    }//GEN-LAST:event_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCategoria;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cambiar;
    private javax.swing.JButton ci;
    private javax.swing.JButton eliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel panelC;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
