package interfaces;

import InterfacesOperacionesPedidos.BuscarPedido;
import InterfacesOperacionesPedidos.BuscarPrincipal;
import InterfacesOperacionesPedidos.EnviarPedido;
import java.awt.BorderLayout;
import javax.swing.JPanel;
/**
 *
 * @author Marlon Diego Lupaca
 */
public class BuscarPedidos extends javax.swing.JPanel {
    
    
    public BuscarPedidos() {
        initComponents();
        this.inicializador();  
        
        
    }
    private void inicializador()
    {
       visualizador(new BuscarPrincipal());
    }
    
    private void visualizador(JPanel p)
    {
        p.setSize(1150,680);
        p.setLocation(0,0);
        cuadropedido.removeAll();
        cuadropedido.add(p,BorderLayout.CENTER);
        cuadropedido.revalidate();
        cuadropedido.repaint();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ci = new javax.swing.JButton();
        cuadropedido = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(46, 48, 147));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        ci.setFont(new java.awt.Font("Roboto", 0, 60)); // NOI18N
        ci.setForeground(new java.awt.Color(51, 51, 51));
        ci.setText("Buscar Pedidos");
        ci.setToolTipText("");
        ci.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ci.setContentAreaFilled(false);
        ci.setFocusPainted(false);
        ci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ci, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ci)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1150, 70));

        javax.swing.GroupLayout cuadropedidoLayout = new javax.swing.GroupLayout(cuadropedido);
        cuadropedido.setLayout(cuadropedidoLayout);
        cuadropedidoLayout.setHorizontalGroup(
            cuadropedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        cuadropedidoLayout.setVerticalGroup(
            cuadropedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        jPanel2.add(cuadropedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1150, 680));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void ciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciActionPerformed
       this.inicializador();
    }//GEN-LAST:event_ciActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ci;
    private javax.swing.JPanel cuadropedido;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
