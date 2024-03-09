package InterfacesOperacionesPedidos;

import base.conexion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Marlon Diego Lupaca
 */
public class BuscarPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form BuscarPrincipal
     */
    public BuscarPrincipal() {
        initComponents();
        this.mostrar();
    }
    private void visualizador(JPanel p)
    {
        p.setSize(1150,680);
        p.setLocation(0,0);
        principal.removeAll();
        principal.add(p,BorderLayout.CENTER);
        principal.revalidate();
        principal.repaint();
    }
    public void mostrar()
    {
        String sql ="Select \n" +
        "    Factura.IDFactura,\n" +
        "    Factura.IDCliente,\n" +
        "    clientes.Nombre,\n" +
        "    Factura.Hora,\n" +
        "    Factura.Fecha,\n" +
        "    Factura.Direccion,\n" + 
        "    Factura.TotalFactura   \n" +
        "from Factura\n" +
        "LEFT JOIN clientes WHERE Factura.IDCliente = clientes.IDCliente;";
        Statement st;
        conexion cc = new conexion ();
        Connection cn = cc.conectar();
        DefaultTableModel tabla = new DefaultTableModel(); 
        tabla.addColumn("ID Factura");
        tabla.addColumn("ID cliente");
        tabla.addColumn("Nombre");
        tabla.addColumn("Hora");
        tabla.addColumn("Fecha");
        tabla.addColumn("Direccion");
        tabla.addColumn("Total");
        Tconsultas.setModel(tabla);
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
        Tconsultas.setShowVerticalLines(false);
        Tconsultas.setRowHeight(28);        
        JTableHeader cabecera = Tconsultas.getTableHeader();
        Font headerFont = new Font("Roboto", Font.PLAIN, 20);
        cabecera.setFont(headerFont);
        cabecera.setBackground(new Color(0x2E3093));
        cabecera.setForeground(Color.WHITE);
    }    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tconsultas = new javax.swing.JTable();
        InfoFactura = new javax.swing.JButton();

        principal.setBackground(new java.awt.Color(255, 255, 255));

        Tconsultas.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Tconsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tconsultas.setSelectionBackground(new java.awt.Color(46, 48, 147));
        Tconsultas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tconsultas);

        InfoFactura.setBackground(new java.awt.Color(46, 48, 147));
        InfoFactura.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        InfoFactura.setForeground(new java.awt.Color(255, 255, 255));
        InfoFactura.setText("Filtrar Facturas");
        InfoFactura.setToolTipText("");
        InfoFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InfoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(InfoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void InfoFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoFacturaActionPerformed
        visualizador(new BuscarPedido());
    }//GEN-LAST:event_InfoFacturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InfoFactura;
    public javax.swing.JTable Tconsultas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}
