package interfacesOperacionesClientes;
import Acciones.ClientesAcciones;
import base.conexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import clases.*;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.table.JTableHeader;
import operaciones.clientesO;
/**
 *
 * @author Marlon Diego Lupaca
 */
public class ModificarClientes extends javax.swing.JPanel {
    
    
    public ModificarClientes() {
        initComponents();
        this.mostrar();
        this.llenar();
        campocodigo.setVisible(false);
        error.setVisible(false);
        camponombre.setVisible(false);
        campoc.setVisible(false);
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
    
    public void llenar()
    {
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

        jLabel1 = new javax.swing.JLabel();
        grupoGenero = new javax.swing.ButtonGroup();
        PanelCategoria = new javax.swing.JPanel();
        panelC = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tclientes = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        celular = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
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
        correo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        fem = new javax.swing.JRadioButton();
        mas = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        clientes = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCategoria.setPreferredSize(new java.awt.Dimension(850, 580));

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

        panelC.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 1080, 190));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel14.setText("Busqueda por Codigo");
        panelC.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        dni.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        dni.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 250, 35));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel17.setText("DNI");
        panelC.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel15.setText("Correo");
        panelC.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nombre.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 250, 35));

        celular.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        celular.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 250, 35));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel16.setText("Celular");
        panelC.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 30));

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
        panelC.add(cambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 530, 140, 40));

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
        panelC.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 180, 35));

        codigollamador.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        codigollamador.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(codigollamador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 250, 35));

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
        campocodigo.setText("Campo vacio o ingresaste una letra (*)");
        panelC.add(campocodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

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

        correo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        correo.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 250, 35));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel19.setText("Apellido");
        panelC.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        apellido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        apellido.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 250, 35));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel20.setText("Direccion");
        panelC.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, -1));

        direccion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        direccion.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelC.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 250, 35));

        fem.setBackground(new java.awt.Color(255, 255, 255));
        grupoGenero.add(fem);
        fem.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        fem.setText("Femenino");
        fem.setContentAreaFilled(false);
        fem.setFocusPainted(false);
        panelC.add(fem, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, -1, -1));

        mas.setBackground(new java.awt.Color(255, 255, 255));
        grupoGenero.add(mas);
        mas.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        mas.setText("Masculino");
        mas.setContentAreaFilled(false);
        mas.setFocusPainted(false);
        panelC.add(mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, -1, -1));

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel22.setText("Genero");
        panelC.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        clientes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        clientes.setFocusable(false);
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        panelC.add(clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 250, 35));

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
        clientesO dao = new ClientesAcciones();
        clientesC c = new clientesC();
        String IDCliente = (String) clientes.getSelectedItem();
        if(IDCliente != null)
        {
            codigollamador.setText(IDCliente);
        }
        

        String llamador = codigollamador.getText();

        try {
            if(!"".equals(llamador))
            {
                campocodigo.setVisible(false);
                codigollamador.setText(c.getDNI());
                dao.llamar(llamador);
                
                if(c.getDNI()==null)
                {
                    error.setVisible(true);
                    campoc.setVisible(false);
                    camponombre.setVisible(false);
                    correcto.setVisible(false);
                    dni.setText("");
                    nombre.setText("");
                    apellido.setText("");
                    direccion.setText("");
                    grupoGenero.clearSelection();
                    correo.setText("");
                    celular.setText("");
                    codigollamador.setText("");
                } else
                {
                    error.setVisible(false);
                    dni.setText(c.getDNI());
                    nombre.setText(c.getNombre());
                    apellido.setText(c.getApellido());
                    direccion.setText(c.getDireccion());
                    String genero = c.getGenero();
                    if("Masculino".equals(genero))
                    {
                        mas.setSelected(true);
                    }else if("Femenino".equals(genero))
                    {
                        fem.setSelected(true);
                    }
                    correo.setText(c.getCorreo());
                    celular.setText(c.getCelular());
                    codigollamador.setText(c.getDNI());
                    c.setDNI(null);

                }
            }else
            {
                campocodigo.setVisible(true);
            }

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"debe llenar todos los datos","aviso",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        clientes.setSelectedItem(null);

    }//GEN-LAST:event_buscarActionPerformed

    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarActionPerformed
        clientesO dao = new ClientesAcciones();
        clientesC mod = new clientesC();
        try {
            String llamador= codigollamador.getText();
            if(!"".equals(llamador))
            {
                String DNI1 = dni.getText();
                String Nombre1 = nombre.getText();
                String Apellido1 = apellido.getText();
                String Direccion1 = direccion.getText();
                String Genero1 = "";
                if (mas.isSelected())
                {
                    Genero1 = mas.getText();
            
                }else if(fem.isSelected())
                {
                    Genero1 = fem.getText();
                }
                
                
                String Correo1 = correo.getText();
                String Celular1 = celular.getText();

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
                    if(!DNI1.trim().isEmpty())
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
                if(!DNI1.trim().isEmpty())
                {
                    campoc.setVisible(false);
                    mod.setDNI(DNI1);
                } else
                {
                    campoc.setVisible(true);
                    correcto.setVisible(false);
                    error.setVisible(false);
                    dni.setText("");
                    dni.requestFocus();
                    return;
                }

                mod.setApellido(Apellido1);
                mod.setDireccion(Direccion1);
                mod.setGenero(Genero1);
                mod.setCorreo(Correo1);
                mod.setCelular(Celular1);
                
                dao.modificar(mod,llamador);
                correcto.setVisible(true);
                grupoGenero.clearSelection();
                campocodigo.setVisible(false);
                campoc.setVisible(false);
                camponombre.setVisible(false);
                error.setVisible(false);
                
                mod.setDNI(null);
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
        dni.setText("");
        nombre.setText("");
        apellido.setText("");
        direccion.setText("");
        correo.setText("");
        celular.setText("");
        clientes.setSelectedItem(null);
        this.mostrar();
    }//GEN-LAST:event_cambiarActionPerformed

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
    private javax.swing.JTextField apellido;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cambiar;
    private javax.swing.JLabel campoc;
    private javax.swing.JLabel campocodigo;
    private javax.swing.JLabel camponombre;
    private javax.swing.JTextField celular;
    private javax.swing.JComboBox<String> clientes;
    private javax.swing.JTextField codigollamador;
    private javax.swing.JButton correcto;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField dni;
    private javax.swing.JButton error;
    private javax.swing.JRadioButton fem;
    private javax.swing.ButtonGroup grupoGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton mas;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panelC;
    // End of variables declaration//GEN-END:variables
}
