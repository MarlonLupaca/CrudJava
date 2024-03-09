
package InterfacesOperacionesCategorias;

import base.conexion;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class categoriaPrincipal extends javax.swing.JPanel{


    public categoriaPrincipal() {
        initComponents();
        this.mostrar();
        
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelju = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tcategoria = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1150, 580));

        panelju.setBackground(new java.awt.Color(255, 255, 255));
        panelju.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tcategoria.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Tcategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tcategoria.setAlignmentX(0.0F);
        Tcategoria.setAlignmentY(0.0F);
        Tcategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tcategoria.setFocusable(false);
        Tcategoria.setGridColor(new java.awt.Color(0, 0, 0));
        Tcategoria.setSelectionBackground(new java.awt.Color(46, 48, 147));
        Tcategoria.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Tcategoria.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tcategoria);
        Tcategoria.getAccessibleContext().setAccessibleDescription("");

        panelju.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 530, 400));

        jPanel2.setBackground(new java.awt.Color(46, 48, 147));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(132, 201, 176));
        jLabel11.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("   Menu");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 60));

        panelju.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FotoCategoria.png"))); // NOI18N
        panelju.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelju, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelju, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Tcategoria;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelju;
    // End of variables declaration//GEN-END:variables
}
