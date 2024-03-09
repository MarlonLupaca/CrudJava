package intefacesOperacionesProductos;

import Acciones.CategoriasAcciones;
import Acciones.ClientesAcciones;
import Acciones.ProductosAcciones;
import base.conexion;
import clases.categoriasC;
import clases.clientesC;
import clases.productosC;
import java.awt.Color;
import java.awt.Font;
//import static interfaces.productos.llamador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import operaciones.categoriasO;
import operaciones.clientesO;
import operaciones.productosO;

public class BuscarProducto extends javax.swing.JPanel {

    public BuscarProducto() {
        
        initComponents();
        this.mostrar();
        this.llenar();
        campo.setVisible(false);
        error.setVisible(false);
        //look.setEditable(false);
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
        NombresProductos.setBackground(Color.white);
        ProductosAcciones sc = new ProductosAcciones();
        try {
            List<String> nom = sc.obtenerNombresDeProductos();
                
            for (String nombre : nom) {
                NombresProductos.addItem(nombre);
            }
        } catch (Exception ex) {        
        }
        NombresProductos.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tproductos = new javax.swing.JTable();
        codigollamador = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        campo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        look = new javax.swing.JPanel();
        dos = new javax.swing.JLabel();
        uno = new javax.swing.JLabel();
        Dtres = new javax.swing.JLabel();
        Duno = new javax.swing.JLabel();
        tres = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        tres2 = new javax.swing.JLabel();
        Dcuatro = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        tres4 = new javax.swing.JLabel();
        Dseis = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        tres6 = new javax.swing.JLabel();
        Dcinco = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        Ddos = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tres1 = new javax.swing.JLabel();
        error = new javax.swing.JButton();
        correcto = new javax.swing.JButton();
        NombresProductos = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1150, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(850, 580));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setMinimumSize(new java.awt.Dimension(850, 800));
        jPanel14.setPreferredSize(new java.awt.Dimension(850, 580));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tproductos.setSelectionBackground(new java.awt.Color(46, 48, 147));
        Tproductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tproductos);

        jPanel14.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 730, 330));

        codigollamador.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        codigollamador.setMargin(new java.awt.Insets(2, 15, 2, 6));
        codigollamador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigollamadorActionPerformed(evt);
            }
        });
        jPanel14.add(codigollamador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 240, 35));

        buscar.setBackground(new java.awt.Color(46, 48, 147));
        buscar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        buscar.setToolTipText("");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel14.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 150, 35));

        campo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campo.setForeground(new java.awt.Color(255, 0, 0));
        campo.setText("Campo obligatorio (*)");
        jPanel14.add(campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jPanel2.setBackground(new java.awt.Color(46, 48, 147));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(132, 201, 176));
        jLabel11.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("   Buscador");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 60));

        jPanel14.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 60));

        look.setBackground(new java.awt.Color(255, 255, 255));
        look.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 48, 147), 4));
        look.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        dos.setText("Codigo:");
        look.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 186, -1));

        uno.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        uno.setText("Nombre:");
        look.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 186, -1));

        Dtres.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Dtres.setText(" ");
        look.add(Dtres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, -1));

        Duno.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Duno.setText(" ");
        look.add(Duno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 200, -1));

        tres.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres.setText("Precio:");
        look.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 186, -1));

        jSeparator1.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 340, 10));

        jSeparator2.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 340, 10));

        jSeparator3.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 340, 10));

        tres2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres2.setText("Presentacion:");
        look.add(tres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 211, -1));

        Dcuatro.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Dcuatro.setText(" ");
        look.add(Dcuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 200, -1));

        jSeparator4.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 340, -1));

        jSeparator5.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 340, 10));

        tres4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres4.setText("Descripcion:");
        look.add(tres4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 215, -1));

        Dseis.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Dseis.setText(" ");
        look.add(Dseis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 200, -1));

        jSeparator7.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 250, 10));

        tres6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres6.setText("Categoria:");
        look.add(tres6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 215, -1));

        Dcinco.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Dcinco.setText(" ");
        look.add(Dcinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 200, -1));

        jSeparator8.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 250, 10));

        Ddos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Ddos.setText(" ");
        look.add(Ddos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, -1));

        jPanel14.add(look, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 340, 430));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel18.setText("Codigo");
        jPanel14.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jPanel4.setBackground(new java.awt.Color(46, 48, 147));

        tres1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tres1.setForeground(new java.awt.Color(255, 255, 255));
        tres1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tres1.setText("Ultima Busqueda");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tres1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tres1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel14.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 340, 40));

        error.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        error.setForeground(new java.awt.Color(233, 55, 78));
        error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconsrechazo.png"))); // NOI18N
        error.setText("  Codigo erroneo");
        error.setBorderPainted(false);
        error.setContentAreaFilled(false);
        error.setFocusPainted(false);
        error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorActionPerformed(evt);
            }
        });
        jPanel14.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 300, 80));

        correcto.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        correcto.setForeground(new java.awt.Color(101, 157, 83));
        correcto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signo.png"))); // NOI18N
        correcto.setText("Se busco correctamente");
        correcto.setBorderPainted(false);
        correcto.setContentAreaFilled(false);
        correcto.setFocusPainted(false);
        correcto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctoActionPerformed(evt);
            }
        });
        jPanel14.add(correcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 360, 80));

        NombresProductos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        NombresProductos.setFocusable(false);
        NombresProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombresProductosActionPerformed(evt);
            }
        });
        jPanel14.add(NombresProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 240, 35));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        productosO dao = new ProductosAcciones();
        productosC c = new productosC();
        String nombre = (String) NombresProductos.getSelectedItem();
        System.out.println(nombre);
        if(nombre != null)
        {
            try {
                String asignar = dao.llamarPorNombreProductos(nombre);
                System.out.println(asignar);
                codigollamador.setText(asignar);
            } catch (Exception ex) {
            }
        }
        String llamador= codigollamador.getText();
        
        try {
            if(!"".equals(llamador))
            {
                
                codigollamador.setText(c.getCodigo());
                dao.llamar(llamador);
                System.out.println(c.getCodigo());
                
                
                if(c.getCodigo()==null)
                {
                    correcto.setVisible(false);
                    campo.setVisible(false);
                    error.setVisible(true);
        
                } else
                {
                    campo.setVisible(false);
                    error.setVisible(false);
                    correcto.setVisible(true);

                    Duno.setText(c.getCodigo());
                    Ddos.setText(c.getNombre());
                    String precio = String.valueOf(c.getPrecio());
                    Dtres.setText(precio);
                    Dcuatro.setText(c.getPresentacion());
                    Dcinco.setText(c.getCategoria());
                    Dseis.setText(c.getDescripcion());
                    
                    c.setCodigo(null);
                
                }
            }else 
            {
                correcto.setVisible(false);
                error.setVisible(false);
                campo.setVisible(true);
                campo.requestFocus();
            }
            codigollamador.setText("");
           
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"debe llenar todos los datos","aviso",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_buscarActionPerformed

    private void errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_errorActionPerformed

    private void correctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctoActionPerformed
        correcto.setVisible(false);
    }//GEN-LAST:event_correctoActionPerformed

    private void codigollamadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigollamadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigollamadorActionPerformed

    private void NombresProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombresProductosActionPerformed

    }//GEN-LAST:event_NombresProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dcinco;
    private javax.swing.JLabel Dcuatro;
    private javax.swing.JLabel Ddos;
    private javax.swing.JLabel Dseis;
    private javax.swing.JLabel Dtres;
    private javax.swing.JLabel Duno;
    private javax.swing.JComboBox<String> NombresProductos;
    public javax.swing.JTable Tproductos;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel campo;
    private javax.swing.JTextField codigollamador;
    private javax.swing.JButton correcto;
    private javax.swing.JLabel dos;
    private javax.swing.JButton error;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel look;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel tres1;
    private javax.swing.JLabel tres2;
    private javax.swing.JLabel tres4;
    private javax.swing.JLabel tres6;
    private javax.swing.JLabel uno;
    // End of variables declaration//GEN-END:variables
}
