
package interfacesOperacionesClientes;

import base.conexion;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class clientesPrincipal extends javax.swing.JPanel{


    public clientesPrincipal() {
        initComponents();
        this.mostrar();
        
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelju = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tclientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        panelju.setBackground(new java.awt.Color(255, 255, 255));
        panelju.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tclientes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Tclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tclientes.setAlignmentX(0.0F);
        Tclientes.setAlignmentY(0.0F);
        Tclientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tclientes.setGridColor(new java.awt.Color(204, 204, 204));
        Tclientes.setSelectionBackground(new java.awt.Color(46, 48, 147));
        Tclientes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Tclientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tclientes);
        Tclientes.getAccessibleContext().setAccessibleDescription("");

        panelju.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 1090, 400));

        jPanel2.setBackground(new java.awt.Color(46, 48, 147));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(132, 201, 176));
        jLabel11.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("   Menu");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 60));

        panelju.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelju, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelju, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Tclientes;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelju;
    // End of variables declaration//GEN-END:variables
}
