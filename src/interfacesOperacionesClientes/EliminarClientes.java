package interfacesOperacionesClientes;
import interfaces.*;
import InterfacesOperacionesCategorias.BuscarC;
import Acciones.CategoriasAcciones;
import Acciones.ClientesAcciones;
import InterfacesOperacionesCategorias.ModificarC;
import InterfacesOperacionesCategorias.RegistrarC;
import base.conexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import clases.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import operaciones.categoriasO;
import javax.swing.JPanel;
import javax.swing.table.JTableHeader;
import operaciones.clientesO;
/**
 *
 * @author Marlon Diego Lupaca
 */
public class EliminarClientes extends javax.swing.JPanel {
    
    public EliminarClientes() {
        initComponents();
        this.mostrar();
        this.llenar();
        campoeliminar.setVisible(false);
        selefila.setVisible(false);
        correcto.setVisible(false);
        error.setVisible(false);
    }
    

    public void mostrar() {
        String sql ="select * from clientes";
        Statement st;
        conexion cc = new conexion ();
        Connection cn = cc.conectar();
        DefaultTableModel tabla = new DefaultTableModel(); 
        tabla.addColumn("DNI");
        tabla.addColumn("Nombre");
        tabla.addColumn("Apellido");
        tabla.addColumn("Direccion");
        tabla.addColumn("Genero");
        tabla.addColumn("Correo");
        tabla.addColumn("Celular");
        
        Tclientes.setModel(tabla);
        String [] datos = new String[7];
        
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
                datos[6]=rs.getString(7);
                tabla.addRow(datos);
                
            } 
        }catch(SQLException e)
        {
            System.out.print(e);
        }
        Tclientes.setShowVerticalLines(false);
        Tclientes.setRowHeight(28);        
        JTableHeader cabecera = Tclientes.getTableHeader();
        Font headerFont = new Font("Roboto", Font.PLAIN, 20);
        cabecera.setFont(headerFont);
        cabecera.setBackground(new Color(0x2E3093));
        cabecera.setForeground(Color.WHITE);
    }
    public void llenar()
    {
        clientes.removeAllItems();
        clientes.setBackground(Color.white);
        clientesO dao = new ClientesAcciones();
        try {
            List<String> nom = dao.obtenerNombresDeClientes();
                
            for (String nombre : nom) {
                clientes.addItem(nombre);
            }
        } catch (Exception ex) {        
        }
        clientes.setSelectedItem(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCategoria = new javax.swing.JPanel();
        panelC = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tclientes = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        eliminar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        campoeliminar = new javax.swing.JLabel();
        selefila = new javax.swing.JLabel();
        correcto = new javax.swing.JButton();
        error = new javax.swing.JButton();
        clientes = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCategoria.setPreferredSize(new java.awt.Dimension(850, 580));
        PanelCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelC.setBackground(new java.awt.Color(255, 255, 255));
        panelC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tclientes.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Tclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tclientes.setSelectionBackground(new java.awt.Color(46, 48, 147));
        Tclientes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tclientes);

        panelC.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 1070, 280));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel14.setText("DNI");
        panelC.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        codigo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        codigo.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 250, 35));

        eliminar.setBackground(new java.awt.Color(46, 48, 147));
        eliminar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("ELIMINAR");
        eliminar.setToolTipText("");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        panelC.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 290, 40));

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
        panelC.add(eliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 250, 35));

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
        campoeliminar.setText("Campo vacio o ingresaste una letra (*)");
        panelC.add(campoeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

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
        panelC.add(correcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 390, 80));

        error.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        error.setForeground(new java.awt.Color(233, 55, 78));
        error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconsrechazo.png"))); // NOI18N
        error.setText("No se encontro el codigo o ingresaste una letra");
        error.setBorderPainted(false);
        error.setContentAreaFilled(false);
        error.setFocusPainted(false);
        error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorActionPerformed(evt);
            }
        });
        panelC.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 620, 80));

        clientes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        clientes.setFocusable(false);
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        panelC.add(clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 250, 35));

        PanelCategoria.add(panelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 580));

        add(PanelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        clientesO dao = new ClientesAcciones();
        int selecion = 1;
        if(Tclientes.getSelectedRows()!= null)
        {
            for(int i : Tclientes.getSelectedRows())
            {
                campoeliminar.setVisible(false);
                selefila.setVisible(false);
                selecion = 0;
                try
                {   
                    String borrador =   ((String) Tclientes.getValueAt(i, 0)).trim();
                    dao.eliminar(borrador);
                    correcto.setVisible(true);
                    this.llenar();
                    
                    selefila.setVisible(false);
                    campoeliminar.setVisible(false); 
                    error.setVisible(false); 
                     
                    codigo.setText("");

                    
                    
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
            codigo.setText("");
                   
        } 
           
        this.mostrar();
    }//GEN-LAST:event_eliminarActionPerformed

    private void eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar1ActionPerformed
        clientesO dao = new ClientesAcciones();
        String IDCliente = (String) clientes.getSelectedItem();
        if(IDCliente != null)
        {
            codigo.setText(IDCliente);
        }
        String borrador = codigo.getText();
        System.out.println(borrador);

                try
                {   
                    
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
                        ClientesAcciones obj = new ClientesAcciones();
                        
                        if(obj.getValidacion() == 1)
                        {
                            correcto.setVisible(true);
                            
                            error.setVisible(false);
                        }
                        if(obj.getValidacion()==2)
                        {
                            error.setVisible(true);
                            correcto.setVisible(false);
                        }
                        
 
                        codigo.setText("");
                        clientes.setSelectedItem(null);
                    }
                    
                }catch(Exception e)
                {
                    System.out.println(e);
                }    
        this.llenar();
        this.mostrar();
    }//GEN-LAST:event_eliminar1ActionPerformed

    private void correctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctoActionPerformed
        correcto.setVisible(false);
    }//GEN-LAST:event_correctoActionPerformed

    private void errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_errorActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed

    }//GEN-LAST:event_clientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCategoria;
    public javax.swing.JTable Tclientes;
    private javax.swing.JLabel campoeliminar;
    private javax.swing.JComboBox<String> clientes;
    private javax.swing.JTextField codigo;
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
