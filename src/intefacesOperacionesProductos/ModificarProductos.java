package intefacesOperacionesProductos;
import Acciones.ProductosAcciones;
import base.conexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import clases.*;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.table.JTableHeader;
import operaciones.productosO;
/**
 *
 * @author Marlon Diego Lupaca
 */
public class ModificarProductos extends javax.swing.JPanel {
    
    
    public ModificarProductos() {
        initComponents();
        this.mostrar();
        this.llenar();
        this.llenarBox();
        campocodigo.setVisible(false);
        error.setVisible(false);
        camponombre.setVisible(false);
        campoc.setVisible(false);
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
    public void llenarBox()
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

        jLabel1 = new javax.swing.JLabel();
        PanelCategoria = new javax.swing.JPanel();
        panelC = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tproductos = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        cambiar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        codigollamador = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        campocodigo = new javax.swing.JLabel();
        camponombre = new javax.swing.JLabel();
        campoc = new javax.swing.JLabel();
        correcto = new javax.swing.JButton();
        error = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        presentacion = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        NombresProductos = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        setPreferredSize(new java.awt.Dimension(1150, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCategoria.setPreferredSize(new java.awt.Dimension(850, 580));

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

        panelC.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 1100, 180));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel14.setText("Busqueda por Codigo");
        panelC.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        codigo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        codigo.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 250, 35));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel17.setText("Codigo");
        panelC.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel15.setText("Descripcion");
        panelC.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nombre.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 250, 35));

        cambiar.setBackground(new java.awt.Color(46, 48, 147));
        cambiar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cambiar.setForeground(new java.awt.Color(255, 255, 255));
        cambiar.setText("GUARDAR");
        cambiar.setToolTipText("");
        cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarActionPerformed(evt);
            }
        });
        panelC.add(cambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 520, 140, 40));

        buscar.setBackground(new java.awt.Color(46, 48, 147));
        buscar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("BUSCAR");
        buscar.setToolTipText("");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        panelC.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 180, 35));

        codigollamador.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        codigollamador.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(codigollamador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 240, 35));

        jPanel2.setBackground(new java.awt.Color(46, 48, 147));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(132, 201, 176));
        jLabel11.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("   Modificador");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 60));

        panelC.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 60));

        campocodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campocodigo.setForeground(new java.awt.Color(255, 0, 0));
        campocodigo.setText("Campo obligatorio (*)");
        panelC.add(campocodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        camponombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        camponombre.setForeground(new java.awt.Color(255, 0, 0));
        camponombre.setText("Campo obligatorio (*)");
        panelC.add(camponombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        campoc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoc.setForeground(new java.awt.Color(255, 0, 0));
        campoc.setText("Campo obligatorio (*)");
        panelC.add(campoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        correcto.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        correcto.setForeground(new java.awt.Color(101, 157, 83));
        correcto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signo.png"))); // NOI18N
        correcto.setText("Se modifico correctamente");
        correcto.setBorderPainted(false);
        correcto.setContentAreaFilled(false);
        correcto.setFocusPainted(false);
        correcto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctoActionPerformed(evt);
            }
        });
        panelC.add(correcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 400, 80));

        error.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        error.setForeground(new java.awt.Color(233, 55, 78));
        error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconsrechazo.png"))); // NOI18N
        error.setText("No se encontro el codigo");
        error.setBorderPainted(false);
        error.setContentAreaFilled(false);
        error.setFocusPainted(false);
        error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorActionPerformed(evt);
            }
        });
        panelC.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 390, 80));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel18.setText("Nombre");
        panelC.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        descripcion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        descripcion.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 250, 35));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel19.setText("Precio");
        panelC.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        precio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        precio.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 250, 35));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel20.setText("Presentacion");
        panelC.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, -1));

        presentacion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        presentacion.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(presentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 250, 35));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel21.setText("Categoria");
        panelC.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        categoria.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        categoria.setFocusable(false);
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });
        panelC.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 250, 35));

        NombresProductos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        NombresProductos.setFocusable(false);
        NombresProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombresProductosActionPerformed(evt);
            }
        });
        panelC.add(NombresProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 240, 35));

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
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(PanelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCategoriaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(PanelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        productosO dao = new ProductosAcciones();
        String nombreP = (String) NombresProductos.getSelectedItem();
        System.out.println(nombreP);
        if(nombreP != null)
        {
            try {
                String asignar = dao.llamarPorNombreProductos(nombreP);
                System.out.println(asignar);
                codigollamador.setText(asignar);
            } catch (Exception ex) {
            }
        }
        

        String llamador = codigollamador.getText();

        try {
            if(!"".equals(llamador))
            {
                campocodigo.setVisible(false);
                productosC c = dao.llamar(llamador);
                codigollamador.setText(c.getCodigo());
                
                
                if(c.getCodigo()==null)
                {
                    error.setVisible(true);
                    campoc.setVisible(false);
                    camponombre.setVisible(false);
                    correcto.setVisible(false);
                    codigo.setText("");
                    nombre.setText("");
                    precio.setText("");
                    presentacion.setText("");
                    categoria.setSelectedItem(null);
                    descripcion.setText("");
                    codigollamador.setText("");
                } else
                {
                    error.setVisible(false);
                    codigo.setText(c.getCodigo());
                    nombre.setText(c.getNombre());
                    String precioO = String.valueOf(c.getPrecio());
                    precio.setText(precioO);
                    presentacion.setText(c.getPresentacion());
                    String categoriao = c.getCategoria();
                    categoria.setSelectedItem(categoriao);
                    descripcion.setText(c.getDescripcion());
                    codigollamador.setText(c.getCodigo());
                    c.setCodigo(null);

                }
            }else
            {
                campocodigo.setVisible(true);
            }

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"debe llenar todos los datos","aviso",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        NombresProductos.setSelectedItem(null);

    }//GEN-LAST:event_buscarActionPerformed

    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarActionPerformed
        productosO dao = new ProductosAcciones();
        productosC mod = new productosC();
        try {
            String llamador= codigollamador.getText();
            if(!"".equals(llamador))
            {
                String Codigo1 = codigo.getText();
                String Nombre1 = nombre.getText();
                Double Precio1 = Double.valueOf(precio.getText());
                String Presentacion1 = presentacion.getText();
                String Categoria1 = (String) categoria.getSelectedItem();
                String Descripcion1 = descripcion.getText();

                if(!Nombre1.trim().isEmpty())
                {
                    camponombre.setVisible(false);
                    mod.setNombre(Nombre1);
                } else
                {
                    camponombre.setVisible(true);
                    correcto.setVisible(false);
                    error.setVisible(false);
                    nombre.setText("");
                    nombre.requestFocus();
                    if(!Codigo1.trim().isEmpty())
                    {
                        campoc.setVisible(false);
                    }else
                    {
                        campoc.setVisible(true);
                        correcto.setVisible(false);
                        error.setVisible(false);
                    }
                    return;
                    
                    
                }
                if(!Codigo1.trim().isEmpty())
                {
                    campoc.setVisible(false);
                    mod.setCodigo(Codigo1);
                } else
                {
                    campoc.setVisible(true);
                    correcto.setVisible(false);
                    error.setVisible(false);
                    codigo.setText("");
                    codigo.requestFocus();
                    return;
                }

                mod.setPrecio(Precio1);
                mod.setPresentacion(  Presentacion1);
                mod.setCategoria(Categoria1);
                mod.setDescripcion(Descripcion1);
                
                System.out.println(llamador);
                dao.modificar(mod,llamador);
                correcto.setVisible(true);
                campocodigo.setVisible(false);
                campoc.setVisible(false);
                camponombre.setVisible(false);
                error.setVisible(false);
                
                mod.setCodigo(null);
            }else
            {
                campocodigo.setVisible(true);
                campoc.setVisible(false);
                camponombre.setVisible(false);
                error.setVisible(false);
                correcto.setVisible(false);
            }
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"EL CODIGO YA EXISTE","aviso",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        codigollamador.setText("");
        codigo.setText("");
        nombre.setText("");
        precio.setText("");
        presentacion.setText("");
        categoria.setSelectedItem(null);
        descripcion.setText("");
        NombresProductos.setSelectedItem(null);
        this.mostrar();
    }//GEN-LAST:event_cambiarActionPerformed

    private void correctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctoActionPerformed
        correcto.setVisible(false);
    }//GEN-LAST:event_correctoActionPerformed

    private void errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_errorActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaActionPerformed

    private void NombresProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombresProductosActionPerformed

    }//GEN-LAST:event_NombresProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> NombresProductos;
    private javax.swing.JPanel PanelCategoria;
    public javax.swing.JTable Tproductos;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cambiar;
    private javax.swing.JLabel campoc;
    private javax.swing.JLabel campocodigo;
    private javax.swing.JLabel camponombre;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField codigollamador;
    private javax.swing.JButton correcto;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panelC;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField presentacion;
    // End of variables declaration//GEN-END:variables
}
