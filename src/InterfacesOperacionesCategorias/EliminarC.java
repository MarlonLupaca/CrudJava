package InterfacesOperacionesCategorias;
import Acciones.CategoriasAcciones;
import Acciones.ProductosAcciones;
import base.conexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import operaciones.categoriasO;
import javax.swing.table.JTableHeader;
/**
 *
 * @author Marlon Diego Lupaca
 */
public class EliminarC extends javax.swing.JPanel {
    
    public EliminarC() {
        initComponents();
        this.mostrar();
        this.llenar();
        campoeliminar.setVisible(false);
        selefila.setVisible(false);
        correcto.setVisible(false);
        error.setVisible(false);
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
        cabecera.setBackground(new Color(0x2E3093));
        cabecera.setForeground(Color.WHITE);
    }
    public void llenar()
    {
        categoria.removeAllItems();
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

        PanelCategoria = new javax.swing.JPanel();
        panelC = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tcategoria = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        codigo2 = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        eliminar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        campoeliminar = new javax.swing.JLabel();
        selefila = new javax.swing.JLabel();
        correcto = new javax.swing.JButton();
        error = new javax.swing.JButton();
        categoria = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(1150, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCategoria.setPreferredSize(new java.awt.Dimension(850, 580));
        PanelCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelC.setBackground(new java.awt.Color(255, 255, 255));
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

        panelC.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 500, 460));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel14.setText("Codigo");
        panelC.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        codigo2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        codigo2.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(codigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 360, 35));

        eliminar.setBackground(new java.awt.Color(46, 48, 147));
        eliminar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("ELIMINAR");
        eliminar.setToolTipText("");
        eliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        panelC.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, 290, 40));

        eliminar1.setBackground(new java.awt.Color(46, 48, 147));
        eliminar1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        eliminar1.setForeground(new java.awt.Color(255, 255, 255));
        eliminar1.setText("ELIMINAR");
        eliminar1.setToolTipText("");
        eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar1ActionPerformed(evt);
            }
        });
        panelC.add(eliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 290, 35));

        jPanel2.setBackground(new java.awt.Color(46, 48, 147));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(132, 201, 176));
        jLabel11.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("   Eliminador");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 60));

        panelC.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 60));

        campoeliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoeliminar.setForeground(new java.awt.Color(255, 0, 0));
        campoeliminar.setText("Campo obligatorio (*)");
        panelC.add(campoeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        selefila.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        selefila.setForeground(new java.awt.Color(255, 0, 0));
        selefila.setText("Selecione la fila");
        panelC.add(selefila, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, -1, -1));

        correcto.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        correcto.setForeground(new java.awt.Color(101, 157, 83));
        correcto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signo.png"))); // NOI18N
        correcto.setText("Se elimino correctamente");
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
        error.setText("No se encontro el codigo");
        error.setBorderPainted(false);
        error.setContentAreaFilled(false);
        error.setFocusPainted(false);
        error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorActionPerformed(evt);
            }
        });
        panelC.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 390, 80));

        categoria.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        categoria.setFocusable(false);
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });
        panelC.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 360, 35));

        PanelCategoria.add(panelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 580));

        add(PanelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        categoriasO dao = new CategoriasAcciones();
        int selecion = 1;
        if(Tcategoria.getSelectedRows()!= null)
        {
            for(int i : Tcategoria.getSelectedRows())
            {
                campoeliminar.setVisible(false);
                selefila.setVisible(false);
                selecion = 0;
                try
                {   
                    String borrador =   ((String) Tcategoria.getValueAt(i, 0)).trim();
                    dao.eliminar(borrador);
                    correcto.setVisible(true);
                    this.llenar();
                    
                    selefila.setVisible(false);
                    campoeliminar.setVisible(false); 
                    error.setVisible(false); 
                     
                    codigo2.setText("");

                    
                    
                }catch(Exception e)
                {
                    System.out.println(e);
                }    
            }
        }
        if(selecion == 1)
        {
            selefila.setVisible(true);
            campoeliminar.setVisible(false); 
            error.setVisible(false); 
            correcto.setVisible(false); 
            codigo2.setText("");
                   
        } 
           
        this.mostrar();
    }//GEN-LAST:event_eliminarActionPerformed

    private void eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar1ActionPerformed
        categoriasO dao = new CategoriasAcciones();
        String nombre = (String) categoria.getSelectedItem();
        System.out.println(nombre);
        if(nombre != null)
        {
            try {
                String asignar = dao.llamarPorNombre(nombre);
                codigo2.setText(asignar);
            } catch (Exception ex) {
            }
        }

                try
                {   
                    String borrador = codigo2.getText().toUpperCase();
                    if("".equals(borrador))
                    {
                       campoeliminar.setVisible(true); 
                       error.setVisible(false); 
                       correcto.setVisible(false); 
                       selefila.setVisible(false); 
                       
                       
                    } else 
                    {
                        selefila.setVisible(false);
                        campoeliminar.setVisible(false);
                        
                        dao.eliminar(borrador);
                        CategoriasAcciones obj = new CategoriasAcciones();
                        if(obj.getValidacion() == 1)
                        {
                            correcto.setVisible(true);
                            this.llenar();
                            error.setVisible(false);
                        }
                        if(obj.getValidacion()==2)
                        {
                            error.setVisible(true);
                            correcto.setVisible(false);
                        }
                        
 
                        codigo2.setText("");
                        categoria.setSelectedItem(null);
                    }
                    
                }catch(Exception e)
                {
                    System.out.println(e);
                }    
        
        this.mostrar();
    }//GEN-LAST:event_eliminar1ActionPerformed

    private void correctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctoActionPerformed
        correcto.setVisible(false);
    }//GEN-LAST:event_correctoActionPerformed

    private void errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_errorActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed

    }//GEN-LAST:event_categoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCategoria;
    public javax.swing.JTable Tcategoria;
    private javax.swing.JLabel campoeliminar;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JTextField codigo2;
    private javax.swing.JButton correcto;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton eliminar1;
    private javax.swing.JButton error;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelC;
    private javax.swing.JLabel selefila;
    // End of variables declaration//GEN-END:variables
}
