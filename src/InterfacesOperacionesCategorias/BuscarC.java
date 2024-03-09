package InterfacesOperacionesCategorias;

import Acciones.CategoriasAcciones;
import Acciones.ProductosAcciones;
import base.conexion;
import clases.categoriasC;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import operaciones.categoriasO;

public class BuscarC extends javax.swing.JPanel {

    public BuscarC() {
        
        initComponents();
        this.mostrar();
        this.llenar();
        campo.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tcategoria = new javax.swing.JTable();
        codigoBusqueda = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        campo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dos = new javax.swing.JLabel();
        uno = new javax.swing.JLabel();
        Ddos = new javax.swing.JLabel();
        Duno = new javax.swing.JLabel();
        tres = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        Dtres = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tres1 = new javax.swing.JLabel();
        error = new javax.swing.JButton();
        correcto = new javax.swing.JButton();
        categoria = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1150, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 580));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setMinimumSize(new java.awt.Dimension(850, 800));
        jPanel14.setPreferredSize(new java.awt.Dimension(1150, 580));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tcategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tcategoria.setSelectionBackground(new java.awt.Color(46, 48, 147));
        Tcategoria.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tcategoria);

        jPanel14.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 440, 510));

        codigoBusqueda.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        codigoBusqueda.setDisabledTextColor(new java.awt.Color(255, 204, 0));
        codigoBusqueda.setMargin(new java.awt.Insets(2, 15, 2, 6));
        codigoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoBusquedaActionPerformed(evt);
            }
        });
        jPanel14.add(codigoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 240, 35));

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
        jPanel14.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 150, 35));

        campo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campo.setForeground(new java.awt.Color(255, 0, 0));
        campo.setText("Campo obligatorio (*)");
        jPanel14.add(campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 48, 147), 4));

        dos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        dos.setText("Nombre:");

        uno.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        uno.setText("Codigo:");

        Ddos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Ddos.setText(" ");

        Duno.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Duno.setText(" ");

        tres.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres.setText("Descripcion:");

        jSeparator1.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        Dtres.setColumns(20);
        Dtres.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Dtres.setLineWrap(true);
        Dtres.setRows(4);
        Dtres.setWrapStyleWord(true);
        Dtres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Dtres.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(Dtres);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(uno, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                        .addComponent(tres, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                    .addComponent(Duno, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ddos, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(dos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Duno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ddos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 340, 400));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel18.setText("Codigo");
        jPanel14.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jPanel4.setBackground(new java.awt.Color(46, 48, 147));

        tres1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tres1.setForeground(new java.awt.Color(255, 255, 255));
        tres1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tres1.setText("Informacion de la categoria");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tres1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tres1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel14.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 340, 40));

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
        jPanel14.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 300, 80));

        correcto.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
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
        jPanel14.add(correcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 400, 80));

        categoria.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        categoria.setFocusable(false);
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });
        jPanel14.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 240, 35));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        categoriasO dao = new CategoriasAcciones();
        categoriasC c = new categoriasC();
        String nombre = (String) categoria.getSelectedItem();
        System.out.println(nombre);
        if(nombre != null)
        {
            try {
                String asignar = dao.llamarPorNombre(nombre);
                codigoBusqueda.setText(asignar);
            } catch (Exception ex) {
            }
        }
        
        
        String llamador = codigoBusqueda.getText().toUpperCase();
        
        
        try {
            if(!"".equals(llamador))
            {
                codigoBusqueda.setText(c.getCodigo());
                dao.llamar(llamador);
                
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
                    Dtres.setText(c.getDescripcion());
                    
                    c.setCodigo(null);
                
                } 
            }else 
            {
                correcto.setVisible(false);
                error.setVisible(false);
                campo.setVisible(true);
                campo.requestFocus();
            }
            codigoBusqueda.setText("");
            categoria.setSelectedItem(null);
                    
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_errorActionPerformed

    private void correctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctoActionPerformed
        correcto.setVisible(false);
    }//GEN-LAST:event_correctoActionPerformed

    private void codigoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoBusquedaActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        
    }//GEN-LAST:event_categoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ddos;
    private javax.swing.JTextArea Dtres;
    private javax.swing.JLabel Duno;
    public javax.swing.JTable Tcategoria;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel campo;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JTextField codigoBusqueda;
    private javax.swing.JButton correcto;
    private javax.swing.JLabel dos;
    private javax.swing.JButton error;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel tres1;
    private javax.swing.JLabel uno;
    // End of variables declaration//GEN-END:variables
}
