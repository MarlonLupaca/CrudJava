package interfacesOperacionesClientes;
import Acciones.ClientesAcciones;
import base.conexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import clases.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.JTableHeader;
import operaciones.clientesO;
/**
 *
 * @author Marlon Diego Lupaca
 */
public class RegistrarClientes extends javax.swing.JPanel {
    
    public RegistrarClientes() {
        initComponents();
        this.mostrar();
        campocodigo.setVisible(false);
        camponombre.setVisible(false);
        campoapellido.setVisible(false);
        campogenero.setVisible(false);
        
        error.setVisible(false);
        correcto.setVisible(false);
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

        grupoGenero = new javax.swing.ButtonGroup();
        PanelRegistrar = new javax.swing.JPanel();
        PanelCategoria = new javax.swing.JPanel();
        panelC = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tclientes = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        celular = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        camponombre = new javax.swing.JLabel();
        campocodigo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        correcto = new javax.swing.JButton();
        error = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        mas = new javax.swing.JRadioButton();
        fem = new javax.swing.JRadioButton();
        campoapellido = new javax.swing.JLabel();
        campogenero = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelRegistrar.setPreferredSize(new java.awt.Dimension(850, 580));
        PanelRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelC.setBackground(new java.awt.Color(255, 255, 255));
        panelC.setPreferredSize(new java.awt.Dimension(850, 580));
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

        panelC.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 1090, 220));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel14.setText("DNI");
        panelC.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 30));

        dni.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        dni.setMargin(new java.awt.Insets(2, 15, 2, 6));
        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });
        panelC.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 250, 35));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel15.setText("Correo");
        panelC.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nombre.setMargin(new java.awt.Insets(2, 15, 2, 6));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        panelC.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 250, 35));

        celular.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        celular.setMargin(new java.awt.Insets(2, 15, 2, 6));
        celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularActionPerformed(evt);
            }
        });
        panelC.add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 250, 35));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel16.setText("Celular");
        panelC.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, 30));

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
        panelC.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 290, 40));

        camponombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        camponombre.setForeground(new java.awt.Color(255, 0, 0));
        camponombre.setText("Campo obligatorio (*)");
        panelC.add(camponombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        campocodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campocodigo.setForeground(new java.awt.Color(255, 0, 0));
        campocodigo.setText("Campo obligatorio (*)");
        panelC.add(campocodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

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
        panelC.add(correcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 390, 80));

        error.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        error.setForeground(new java.awt.Color(233, 55, 78));
        error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconsrechazo.png"))); // NOI18N
        error.setText("  Codigo ya existe o ingresaste una letra");
        error.setBorderPainted(false);
        error.setContentAreaFilled(false);
        error.setFocusPainted(false);
        error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorActionPerformed(evt);
            }
        });
        panelC.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 550, 80));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel17.setText("Nombre");
        panelC.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        correo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        correo.setMargin(new java.awt.Insets(2, 15, 2, 6));
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        panelC.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 250, 35));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel18.setText("Apellido");
        panelC.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        apellido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        apellido.setMargin(new java.awt.Insets(2, 15, 2, 6));
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        panelC.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 250, 35));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel19.setText("Direccion");
        panelC.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, -1, -1));

        direccion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        direccion.setMargin(new java.awt.Insets(2, 15, 2, 6));
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        panelC.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 250, 35));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel20.setText("Genero");
        panelC.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        mas.setBackground(new java.awt.Color(255, 255, 255));
        grupoGenero.add(mas);
        mas.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        mas.setText("Masculino");
        mas.setContentAreaFilled(false);
        mas.setFocusPainted(false);
        panelC.add(mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        fem.setBackground(new java.awt.Color(255, 255, 255));
        grupoGenero.add(fem);
        fem.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        fem.setText("Femenino");
        fem.setContentAreaFilled(false);
        fem.setFocusPainted(false);
        panelC.add(fem, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, -1, -1));

        campoapellido.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoapellido.setForeground(new java.awt.Color(255, 0, 0));
        campoapellido.setText("Campo obligatorio (*)");
        panelC.add(campoapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, 20));

        campogenero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campogenero.setForeground(new java.awt.Color(255, 0, 0));
        campogenero.setText("Campo obligatorio (*)");
        panelC.add(campogenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, -1, 20));

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

        PanelRegistrar.add(PanelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

        add(PanelRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        correcto.setVisible(false);
        camponombre.setVisible(false);
        campocodigo.setVisible(false);
        campoapellido.setVisible(false);
        campogenero.setVisible(false);
        boolean validador = false;
        String DNI = dni.getText();
        String Nombre = nombre.getText();
        String Apellido = apellido.getText();
        String Direccion = direccion.getText();
        String Genero = "";
        if (mas.isSelected())
        {
            Genero = mas.getText();
            
        }else if(fem.isSelected())
        {
            Genero = fem.getText();
        }
        
        String Correo = correo.getText();
        String Celular = celular.getText();
        clientesC agregando = new clientesC();
        
        if("".equals(Nombre.trim()))
        {
            validador = true;
            camponombre.setVisible(true);
        }
        if("".equals(DNI.trim()))
        {
            validador = true;
            campocodigo.setVisible(true);
        }
        if("".equals(Apellido.trim()))
        {
            validador = true;
            campoapellido.setVisible(true);
        }
        if("".equals(Genero.trim()))
        {
            validador = true;
            campogenero.setVisible(true);
        }
        
        if(validador)
        {
            return;
        }
        
        
        agregando.setNombre(Nombre);
        agregando.setDNI(DNI);
        agregando.setApellido(Apellido);
        agregando.setDireccion(Direccion);
        agregando.setGenero(Genero);
        agregando.setCorreo(Correo);
        agregando.setCelular(Celular);
        
        
        try
        {
            error.setVisible(false);
            clientesO dao = new ClientesAcciones();
            dao.registrar(agregando);
            correcto.setVisible(true);
            grupoGenero.clearSelection();
            dni.setText("");
            nombre.setText("");
            apellido.setText("");
            direccion.setText("");
            correo.setText("");
            celular.setText("");

        }catch(Exception e)
        {
            correcto.setVisible(false);
            error.setVisible(true);
        }
        this.mostrar();
    }//GEN-LAST:event_registrarActionPerformed

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniActionPerformed

    private void correctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctoActionPerformed
        correcto.setVisible(false);
    }//GEN-LAST:event_correctoActionPerformed

    private void errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorActionPerformed
        error.setVisible(false);
    }//GEN-LAST:event_errorActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCategoria;
    private javax.swing.JPanel PanelRegistrar;
    public javax.swing.JTable Tclientes;
    private javax.swing.JTextField apellido;
    private javax.swing.JLabel campoapellido;
    private javax.swing.JLabel campocodigo;
    private javax.swing.JLabel campogenero;
    private javax.swing.JLabel camponombre;
    private javax.swing.JTextField celular;
    private javax.swing.JButton correcto;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField dni;
    private javax.swing.JButton error;
    private javax.swing.JRadioButton fem;
    private javax.swing.ButtonGroup grupoGenero;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton mas;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panelC;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
