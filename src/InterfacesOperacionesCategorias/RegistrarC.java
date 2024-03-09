package InterfacesOperacionesCategorias;
import Acciones.CategoriasAcciones;
import base.conexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import clases.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.JTableHeader;
import operaciones.categoriasO;
/**
 *
 * @author Marlon Diego Lupaca
 */
public class RegistrarC extends javax.swing.JPanel {
    
    public RegistrarC() {
        initComponents();
        this.mostrar();
        campocodigo.setVisible(false);
        camponombre.setVisible(false);
        error.setVisible(false);
        correcto.setVisible(false);
    }

    public void mostrar()
    {
        String sql ="select * from categorias";
        Statement st;
        conexion cc = new conexion ();
        Connection cn = cc.conectar();
        DefaultTableModel tabla = new DefaultTableModel(); 
        tabla.addColumn("Codigo");
        tabla.addColumn("Nombre");
        tabla.addColumn("Descripcion");
        Tcategoria.setModel(tabla);
        String [] datos = new String[3];
        
        try 
        {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                datos[0]="    "+rs.getString(1);
                datos[1]="    "+rs.getString(2);
                datos[2]="    "+rs.getString(3);
                tabla.addRow(datos);
                
            } 
        }catch(SQLException e)
        {
            System.out.print(e);
        }
        Tcategoria.setShowVerticalLines(false);
        Tcategoria.setRowHeight(28);        
        JTableHeader cabecera = Tcategoria.getTableHeader();
        Font headerFont = new Font("Roboto", Font.PLAIN, 20);
        cabecera.setFont(headerFont);
        cabecera.setBackground(new Color(0x2e3093));
        cabecera.setForeground(Color.WHITE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRegistrar = new javax.swing.JPanel();
        PanelCategoria = new javax.swing.JPanel();
        panelC = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tcategoria = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        camponombre = new javax.swing.JLabel();
        campocodigo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        correcto = new javax.swing.JButton();
        error = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1150, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelRegistrar.setPreferredSize(new java.awt.Dimension(850, 580));
        PanelRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelC.setBackground(new java.awt.Color(255, 255, 255));
        panelC.setPreferredSize(new java.awt.Dimension(850, 580));
        panelC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tcategoria.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Tcategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tcategoria.setSelectionBackground(new java.awt.Color(46, 48, 147));
        Tcategoria.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tcategoria);

        panelC.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 470, 490));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel14.setText("Codigo");
        panelC.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, 30));

        codigo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        codigo.setMargin(new java.awt.Insets(2, 15, 2, 6));
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        panelC.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 390, 35));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel15.setText("Nombre");
        panelC.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nombre.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 390, 35));

        descripcion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        descripcion.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 390, 35));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel16.setText("Descripcion");
        panelC.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 140, 30));

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
        panelC.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 290, 40));

        camponombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        camponombre.setForeground(new java.awt.Color(255, 0, 0));
        camponombre.setText("Campo obligatorio (*)");
        panelC.add(camponombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        campocodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campocodigo.setForeground(new java.awt.Color(255, 0, 0));
        campocodigo.setText("Campo obligatorio (*)");
        panelC.add(campocodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

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
        panelC.add(correcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 390, 80));

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
        panelC.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 300, 80));

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

        PanelRegistrar.add(PanelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(PanelRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        String Nombre = nombre.getText().toUpperCase();
        String Codigo = codigo.getText().toUpperCase();
        String Descripcion = descripcion.getText().toUpperCase();

        categoriasC agregando = new categoriasC();
        
        if(!Codigo.trim().isEmpty())
        {
            campocodigo.setVisible(false);
            agregando.setCodigo(Codigo);
        } else 
        {
            
            correcto.setVisible(false);
            campocodigo.setVisible(true);
            codigo.setText("");
            codigo.requestFocus();
            if(!Nombre.trim().isEmpty())
            {
                camponombre.setVisible(false);
            } else 
            {
                correcto.setVisible(false);
                camponombre.setVisible(true);
            }
            return;    
        }
        if(!Nombre.trim().isEmpty())
        {
            camponombre.setVisible(false);
            agregando.setNombre(Nombre);
        } else 
        {
            correcto.setVisible(false);
            camponombre.setVisible(true);
            nombre.setText("");
            codigo.requestFocus();
            return;
               
        }
        
        
        agregando.setDescripcion(Descripcion);
        try
        {
            error.setVisible(false);
            categoriasO dao = new CategoriasAcciones();
            dao.registrar(agregando);
            correcto.setVisible(true);
            codigo.setText("");
            nombre.setText("");
            descripcion.setText("");

        }catch(Exception e)
        {
            correcto.setVisible(false);
            error.setVisible(true);
        }
        this.mostrar();
    }//GEN-LAST:event_registrarActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void correctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctoActionPerformed
        correcto.setVisible(false);
    }//GEN-LAST:event_correctoActionPerformed

    private void errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_errorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCategoria;
    private javax.swing.JPanel PanelRegistrar;
    public javax.swing.JTable Tcategoria;
    private javax.swing.JLabel campocodigo;
    private javax.swing.JLabel camponombre;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton correcto;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton error;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panelC;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
