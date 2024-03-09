package interfaces;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.UIManager;
/**
 *
 * @author Marlon Diego Lupaca
 */
public class MenuPrincipal extends javax.swing.JFrame {

    int xMause;
    int yMause;
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        inicializador();   
    }
    
    private void inicializador()
    {
       visualizador(new Principal());
    }
    private void visualizador(JPanel p)
    {
        p.setSize(1150,800);
        p.setLocation(0,0);
        panel.removeAll();
        panel.add(p,BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        barraprincipal = new javax.swing.JPanel();
        cerrar = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Rpedidos = new javax.swing.JButton();
        principal = new javax.swing.JButton();
        cliente = new javax.swing.JButton();
        producto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Epedidos = new javax.swing.JButton();
        categoria = new javax.swing.JButton();
        Epedidos1 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraprincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barraprincipal.setOpaque(false);
        barraprincipal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraprincipalMouseDragged(evt);
            }
        });
        barraprincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraprincipalMousePressed(evt);
            }
        });

        cerrar.setBackground(new java.awt.Color(46, 48, 147));

        x.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        x.setForeground(new java.awt.Color(255, 255, 255));
        x.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x.setText("X");
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarLayout = new javax.swing.GroupLayout(cerrar);
        cerrar.setLayout(cerrarLayout);
        cerrarLayout.setHorizontalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(x, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        );
        cerrarLayout.setVerticalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(x, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout barraprincipalLayout = new javax.swing.GroupLayout(barraprincipal);
        barraprincipal.setLayout(barraprincipalLayout);
        barraprincipalLayout.setHorizontalGroup(
            barraprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
            .addGroup(barraprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(barraprincipalLayout.createSequentialGroup()
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1463, Short.MAX_VALUE)))
        );
        barraprincipalLayout.setVerticalGroup(
            barraprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(barraprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(barraprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 40));

        jPanel1.setBackground(new java.awt.Color(46, 48, 147));
        jPanel1.setPreferredSize(new java.awt.Dimension(355, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Rpedidos.setBackground(new java.awt.Color(46, 48, 147));
        Rpedidos.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Rpedidos.setForeground(new java.awt.Color(255, 255, 255));
        Rpedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrega-de-pedidos.png"))); // NOI18N
        Rpedidos.setText(" REGISTRAR PEDIDOS");
        Rpedidos.setBorderPainted(false);
        Rpedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rpedidos.setDisabledIcon(null);
        Rpedidos.setFocusPainted(false);
        Rpedidos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        Rpedidos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Rpedidos.setIconTextGap(10);
        Rpedidos.setMargin(new java.awt.Insets(2, 30, 2, 2));
        Rpedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RpedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RpedidosMouseExited(evt);
            }
        });
        Rpedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RpedidosActionPerformed(evt);
            }
        });
        jPanel1.add(Rpedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 310, 75));

        principal.setBackground(new java.awt.Color(46, 48, 147));
        principal.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        principal.setForeground(new java.awt.Color(255, 255, 255));
        principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa.png"))); // NOI18N
        principal.setText(" PRINCIPAL");
        principal.setBorderPainted(false);
        principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        principal.setFocusPainted(false);
        principal.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        principal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        principal.setIconTextGap(10);
        principal.setMargin(new java.awt.Insets(2, 30, 2, 14));
        principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                principalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                principalMouseExited(evt);
            }
        });
        principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalActionPerformed(evt);
            }
        });
        jPanel1.add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 310, 75));

        cliente.setBackground(new java.awt.Color(46, 48, 147));
        cliente.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        cliente.setForeground(new java.awt.Color(255, 255, 255));
        cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas.png"))); // NOI18N
        cliente.setText(" CLIENTES");
        cliente.setBorderPainted(false);
        cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cliente.setDisabledIcon(null);
        cliente.setFocusPainted(false);
        cliente.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        cliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cliente.setIconTextGap(10);
        cliente.setMargin(new java.awt.Insets(2, 30, 2, 14));
        cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clienteMouseExited(evt);
            }
        });
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        jPanel1.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 310, 75));

        producto.setBackground(new java.awt.Color(46, 48, 147));
        producto.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        producto.setForeground(new java.awt.Color(255, 255, 255));
        producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/un-pan.png"))); // NOI18N
        producto.setText(" PRODUCTOS");
        producto.setBorderPainted(false);
        producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        producto.setDisabledIcon(null);
        producto.setFocusPainted(false);
        producto.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        producto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        producto.setIconTextGap(10);
        producto.setMargin(new java.awt.Insets(2, 30, 2, 14));
        producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productoMouseExited(evt);
            }
        });
        producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoActionPerformed(evt);
            }
        });
        jPanel1.add(producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 485, 310, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo 50x50.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 230, 230));

        Epedidos.setBackground(new java.awt.Color(46, 48, 147));
        Epedidos.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Epedidos.setForeground(new java.awt.Color(255, 255, 255));
        Epedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrega-de-pedidos.png"))); // NOI18N
        Epedidos.setText(" ENVIAR PEDIDOS");
        Epedidos.setBorderPainted(false);
        Epedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Epedidos.setDisabledIcon(null);
        Epedidos.setFocusPainted(false);
        Epedidos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        Epedidos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Epedidos.setIconTextGap(10);
        Epedidos.setMargin(new java.awt.Insets(2, 30, 2, 14));
        Epedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EpedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EpedidosMouseExited(evt);
            }
        });
        Epedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EpedidosActionPerformed(evt);
            }
        });
        jPanel1.add(Epedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 635, 310, 75));

        categoria.setBackground(new java.awt.Color(46, 48, 147));
        categoria.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        categoria.setForeground(new java.awt.Color(255, 255, 255));
        categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista.png"))); // NOI18N
        categoria.setText(" CATEGORIAS");
        categoria.setBorderPainted(false);
        categoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categoria.setDisabledIcon(null);
        categoria.setFocusPainted(false);
        categoria.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        categoria.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        categoria.setIconTextGap(10);
        categoria.setMargin(new java.awt.Insets(2, 30, 2, 14));
        categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                categoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                categoriaMouseExited(evt);
            }
        });
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });
        jPanel1.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 335, 310, 75));

        Epedidos1.setBackground(new java.awt.Color(46, 48, 147));
        Epedidos1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Epedidos1.setForeground(new java.awt.Color(255, 255, 255));
        Epedidos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrega-de-pedidos.png"))); // NOI18N
        Epedidos1.setText(" BUSCAR PEDIDOS");
        Epedidos1.setBorderPainted(false);
        Epedidos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Epedidos1.setDisabledIcon(null);
        Epedidos1.setFocusPainted(false);
        Epedidos1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        Epedidos1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Epedidos1.setIconTextGap(10);
        Epedidos1.setMargin(new java.awt.Insets(2, 30, 2, 14));
        Epedidos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Epedidos1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Epedidos1MouseExited(evt);
            }
        });
        Epedidos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Epedidos1ActionPerformed(evt);
            }
        });
        jPanel1.add(Epedidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, 310, 75));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 800));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 1150, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoActionPerformed
        visualizador(new productos());
    }//GEN-LAST:event_productoActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        visualizador(new clientes());
    }//GEN-LAST:event_clienteActionPerformed

    private void principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalActionPerformed
        inicializador();
    }//GEN-LAST:event_principalActionPerformed

    private void RpedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RpedidosActionPerformed
        visualizador(new RegistrarPedidos());
    }//GEN-LAST:event_RpedidosActionPerformed

    private void EpedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EpedidosActionPerformed
        visualizador(new EnviarPedidos());
    }//GEN-LAST:event_EpedidosActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        visualizador(new categorias());
    }//GEN-LAST:event_categoriaActionPerformed

    private void Epedidos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Epedidos1ActionPerformed
        visualizador(new BuscarPedidos());
    }//GEN-LAST:event_Epedidos1ActionPerformed

    private void barraprincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraprincipalMousePressed
        xMause = evt.getX();
        yMause = evt.getY();
    }//GEN-LAST:event_barraprincipalMousePressed

    private void barraprincipalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraprincipalMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMause, y-yMause);
    }//GEN-LAST:event_barraprincipalMouseDragged

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        cerrar.setBackground(new Color(0xc0c0f1));
        x.setForeground(new Color(0x2E3093));
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        cerrar.setBackground(new Color(0x2E3093));
        x.setForeground(Color.WHITE);
    }//GEN-LAST:event_xMouseExited

    private void principalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalMouseEntered
        principal.setBackground(new Color(0xc0c0f1));
        principal.setForeground(new Color(0x2E3093));
    }//GEN-LAST:event_principalMouseEntered
        
    private void principalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalMouseExited
        principal.setBackground(new Color(0x2E3093));
        principal.setForeground(Color.WHITE);        
    }//GEN-LAST:event_principalMouseExited

    private void categoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaMouseEntered
        categoria.setBackground(new Color(0xc0c0f1));
        categoria.setForeground(new Color(0x2E3093));
    }//GEN-LAST:event_categoriaMouseEntered

    private void categoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaMouseExited
        categoria.setBackground(new Color(0x2E3093));
        categoria.setForeground(Color.WHITE);
    }//GEN-LAST:event_categoriaMouseExited

    private void clienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteMouseEntered
        cliente.setBackground(new Color(0xc0c0f1));
        cliente.setForeground(new Color(0x2E3093));
    }//GEN-LAST:event_clienteMouseEntered

    private void clienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteMouseExited
        cliente.setBackground(new Color(0x2E3093));
        cliente.setForeground(Color.WHITE);
    }//GEN-LAST:event_clienteMouseExited

    private void productoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productoMouseEntered
        producto.setBackground(new Color(0xc0c0f1));
        producto.setForeground(new Color(0x2E3093));
    }//GEN-LAST:event_productoMouseEntered

    private void productoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productoMouseExited
        producto.setBackground(new Color(0x2E3093));
        producto.setForeground(Color.WHITE);
    }//GEN-LAST:event_productoMouseExited

    private void RpedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RpedidosMouseEntered
        Rpedidos.setBackground(new Color(0xc0c0f1));
        Rpedidos.setForeground(new Color(0x2E3093));
    }//GEN-LAST:event_RpedidosMouseEntered

    private void RpedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RpedidosMouseExited
        Rpedidos.setBackground(new Color(0x2E3093));
        Rpedidos.setForeground(Color.WHITE);
    }//GEN-LAST:event_RpedidosMouseExited

    private void EpedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EpedidosMouseEntered
        Epedidos.setBackground(new Color(0xc0c0f1));
        Epedidos.setForeground(new Color(0x2E3093));
    }//GEN-LAST:event_EpedidosMouseEntered

    private void EpedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EpedidosMouseExited
        Epedidos.setBackground(new Color(0x2E3093));
        Epedidos.setForeground(Color.WHITE);
    }//GEN-LAST:event_EpedidosMouseExited

    private void Epedidos1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Epedidos1MouseEntered
        Epedidos1.setBackground(new Color(0xc0c0f1));
        Epedidos1.setForeground(new Color(0x2E3093));
    }//GEN-LAST:event_Epedidos1MouseEntered

    private void Epedidos1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Epedidos1MouseExited
        Epedidos1.setBackground(new Color(0x2E3093));
        Epedidos1.setForeground(Color.WHITE);
    }//GEN-LAST:event_Epedidos1MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();
        UIManager.put( "Button.arc", 100 );
        UIManager.put( "TextComponent.arc", 100 );
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Epedidos;
    private javax.swing.JButton Epedidos1;
    private javax.swing.JButton Rpedidos;
    private javax.swing.JPanel barraprincipal;
    private javax.swing.JButton categoria;
    private javax.swing.JPanel cerrar;
    private javax.swing.JButton cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JPanel panel;
    private javax.swing.JButton principal;
    private javax.swing.JButton producto;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
