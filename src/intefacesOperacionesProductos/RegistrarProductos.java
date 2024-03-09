package intefacesOperacionesProductos;
import Acciones.ProductosAcciones;
import base.conexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import clases.*;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;
import operaciones.productosO;
/**
 *
 * @author Marlon Diego Lupaca
 */
public class RegistrarProductos extends javax.swing.JPanel {
    
    public RegistrarProductos() {
        initComponents();
        this.mostrar();
        this.llenar();
        campoObligatorio1.setVisible(false);
        campoObligatorio2.setVisible(false);
        campoObligatorio3.setVisible(false);
        campoObligatorio4.setVisible(false);
        error.setVisible(false);
        correcto.setVisible(false);
    }

    public void mostrar() {
        String sql ="select * from productos";
        Statement st;
        conexion cc = new conexion ();
        Connection cn = cc.conectar();
        DefaultTableModel tabla = new DefaultTableModel(); 
        tabla.addColumn("Codigo");
        tabla.addColumn("Nombre");
        tabla.addColumn("Precio");
        tabla.addColumn("Presentacion");
        tabla.addColumn("Categoria");
        tabla.addColumn("Descripcion");
        
        
        
        Tproductos.setModel(tabla);
        String [] datos = new String[6];
        
        try 
        {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                tabla.addRow(datos);
                
            } 
        }catch(SQLException e)
        {
            System.out.print(e);
        }
        Tproductos.setShowVerticalLines(false);
        Tproductos.setRowHeight(28);        
        JTableHeader cabecera = Tproductos.getTableHeader();
        Font headerFont = new Font("Roboto", Font.PLAIN, 20);
        cabecera.setFont(headerFont);
        cabecera.setBackground(new Color(0x2E3093));
        cabecera.setForeground(Color.WHITE);
        }
        public void llenar()
        {
            categoria.setBackground(Color.white);
            ProductosAcciones sc = new ProductosAcciones();
            try {

                List<String> nom = sc.obtenerNombres();
                
                for (String nombre : nom) {
                    categoria.addItem(nombre);
                }
            } catch (Exception ex) {
                
            }
            categoria.setSelectedItem(null);

        }
        
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRegistrar = new javax.swing.JPanel();
        PanelCategoria = new javax.swing.JPanel();
        panelC = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tproductos = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        campoObligatorio2 = new javax.swing.JLabel();
        campoObligatorio1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        correcto = new javax.swing.JButton();
        error = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        presentacion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        campoObligatorio3 = new javax.swing.JLabel();
        campoObligatorio4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1150, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelRegistrar.setPreferredSize(new java.awt.Dimension(850, 580));
        PanelRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCategoria.setPreferredSize(new java.awt.Dimension(850, 600));

        panelC.setBackground(new java.awt.Color(255, 255, 255));
        panelC.setPreferredSize(new java.awt.Dimension(850, 580));
        panelC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tproductos.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Tproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tproductos.setSelectionBackground(new java.awt.Color(46, 48, 147));
        Tproductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tproductos);

        panelC.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 1090, 220));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel14.setText("Codigo");
        panelC.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 30));

        codigo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        codigo.setMargin(new java.awt.Insets(2, 15, 2, 6));
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        panelC.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 250, 35));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel15.setText("Descripcion");
        panelC.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nombre.setMargin(new java.awt.Insets(2, 15, 2, 6));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        panelC.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 250, 35));

        registrar.setBackground(new java.awt.Color(46, 48, 147));
        registrar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("REGISTRAR");
        registrar.setToolTipText("");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        panelC.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, 290, 40));

        campoObligatorio2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio2.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio2.setText("Campo obligatorio (*)");
        panelC.add(campoObligatorio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        campoObligatorio1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio1.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio1.setText("Campo obligatorio (*)");
        panelC.add(campoObligatorio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jPanel2.setBackground(new java.awt.Color(46, 48, 147));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(132, 201, 176));
        jLabel11.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("   Registrador");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 60));

        panelC.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 60));

        correcto.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        correcto.setForeground(new java.awt.Color(101, 157, 83));
        correcto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signo.png"))); // NOI18N
        correcto.setText("Se registro correctamente");
        correcto.setBorderPainted(false);
        correcto.setContentAreaFilled(false);
        correcto.setFocusPainted(false);
        correcto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctoActionPerformed(evt);
            }
        });
        panelC.add(correcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 390, 80));

        error.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        error.setForeground(new java.awt.Color(233, 55, 78));
        error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconsrechazo.png"))); // NOI18N
        error.setText("  Codigo ya existe");
        error.setBorderPainted(false);
        error.setContentAreaFilled(false);
        error.setFocusPainted(false);
        error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorActionPerformed(evt);
            }
        });
        panelC.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 300, 80));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel17.setText("Nombre");
        panelC.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        descripcion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        descripcion.setMargin(new java.awt.Insets(2, 15, 2, 6));
        descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionActionPerformed(evt);
            }
        });
        panelC.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 250, 35));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel18.setText("Precio");
        panelC.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        precio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        precio.setMargin(new java.awt.Insets(2, 15, 2, 6));
        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });
        panelC.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 250, 35));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel19.setText("Presentacion");
        panelC.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, -1, -1));

        presentacion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        presentacion.setMargin(new java.awt.Insets(2, 15, 2, 6));
        presentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentacionActionPerformed(evt);
            }
        });
        panelC.add(presentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 250, 35));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel20.setText("Categoria");
        panelC.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        categoria.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        categoria.setFocusable(false);
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });
        panelC.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 250, 35));

        campoObligatorio3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio3.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio3.setText("Campo obligatorio (*)");
        panelC.add(campoObligatorio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, 20));

        campoObligatorio4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio4.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio4.setText("Campo obligatorio (*)");
        panelC.add(campoObligatorio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, 20));

        javax.swing.GroupLayout PanelCategoriaLayout = new javax.swing.GroupLayout(PanelCategoria);
        PanelCategoria.setLayout(PanelCategoriaLayout);
        PanelCategoriaLayout.setHorizontalGroup(
            PanelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCategoriaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelC, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelCategoriaLayout.setVerticalGroup(
            PanelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCategoriaLayout.createSequentialGroup()
                .addComponent(panelC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PanelRegistrar.add(PanelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 580));

        add(PanelRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        String Codigo = codigo.getText().toString();
        String Nombre = nombre.getText().toString();
        String Categoria = (String) categoria.getSelectedItem();
        double Precio = "".equals(precio.getText()) ? 0 : Double.parseDouble(precio.getText());
        System.out.println(Precio);
        String Presentacion = presentacion.getText();
        String Descripcion = descripcion.getText();

        productosC agregando = new productosC();
        boolean validador = false;
        
        if("".equals(Codigo))
        {
            campoObligatorio1.setVisible(true);
            validador = true;
        }
        if("".equals(Nombre))
        {
            campoObligatorio2.setVisible(true);
            validador = true;
        }
        if(Categoria == null)
        {
            campoObligatorio3.setVisible(true);
            validador = true;
        }
        if(Precio == 0)
        {
            campoObligatorio4.setVisible(true);
            validador = true;
        }
        
        if(validador)
        {
            return;
        }
        
        agregando.setNombre(Nombre);
        agregando.setCodigo(Codigo);
        agregando.setPrecio(Precio);
        agregando.setPresentacion(  Presentacion);
        agregando.setCategoria(Categoria);
        agregando.setDescripcion(Descripcion);
        
        
        try
        {
            error.setVisible(false);
            productosO dao = new ProductosAcciones();
            dao.registrar(agregando);
            correcto.setVisible(true);
            categoria.setSelectedItem(null);
            campoObligatorio1.setVisible(false);
            campoObligatorio2.setVisible(false);
            campoObligatorio3.setVisible(false);
            campoObligatorio4.setVisible(false);
            codigo.setText("");
            nombre.setText("");
            precio.setText("");
            presentacion.setText("");
           
            descripcion.setText("");

        }catch(Exception e)
        {
            correcto.setVisible(false);
            error.setVisible(true);
        }
        this.mostrar();
    }//GEN-LAST:event_registrarActionPerformed

    private void correctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctoActionPerformed
        correcto.setVisible(false);
    }//GEN-LAST:event_correctoActionPerformed

    private void errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_errorActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionActionPerformed

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioActionPerformed

    private void presentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presentacionActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCategoria;
    private javax.swing.JPanel PanelRegistrar;
    public javax.swing.JTable Tproductos;
    private javax.swing.JLabel campoObligatorio1;
    private javax.swing.JLabel campoObligatorio2;
    private javax.swing.JLabel campoObligatorio3;
    private javax.swing.JLabel campoObligatorio4;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton correcto;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton error;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panelC;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField presentacion;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
