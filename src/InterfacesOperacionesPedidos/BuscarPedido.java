
package InterfacesOperacionesPedidos;

import Acciones.BuscadorAcciones;
import Acciones.PedidosAcciones;
import InterfacesOperacionesCategorias.*;
import base.conexion;
import clases.FacturaC;
import interfaces.MenuPrincipal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import operaciones.buscadorO;
import operaciones.pedidosO;


public class BuscarPedido extends javax.swing.JPanel{
    
    private static String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    public BuscarPedido() {
        initComponents();
        this.mostrar();
        campoObligatorio1.setVisible(false);
        campoObligatorio2.setVisible(false);
        campoObligatorio3.setVisible(false);
        campoObligatorio4.setVisible(false);
        campoObligatorio5.setVisible(false);
        campoObligatorio6.setVisible(false);
        campoObligatorio7.setVisible(false);
        campoObligatorio8.setVisible(false);
        campoObligatorio9.setVisible(false);
    }
    
    private void visualizador(JPanel p)
    {
        p.setSize(1150,680);
        p.setLocation(0,0);
        panelju.removeAll();
        panelju.setLayout(new BorderLayout());
        panelju.add(p,BorderLayout.CENTER);
        panelju.revalidate();
        panelju.repaint();
    }
    public void mostrar() {
        
            DefaultTableModel tabla = new DefaultTableModel(); 
            tabla.addColumn("ID Factura");
            tabla.addColumn("ID cliente");
            tabla.addColumn("Nombre");
            tabla.addColumn("Hora");
            tabla.addColumn("Fecha");
            tabla.addColumn("Direccion");
            tabla.addColumn("Total");
            Tconsultas.setModel(tabla);
            Tconsultas.setShowVerticalLines(false);
            Tconsultas.setRowHeight(28);
            JTableHeader cabecera = Tconsultas.getTableHeader();
            Font headerFont = new Font("Roboto", Font.PLAIN, 18);
            cabecera.setFont(headerFont);
            cabecera.setBackground(new Color(0x2E3093));
            cabecera.setForeground(Color.WHITE);
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelju = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        BuscadorDNI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tconsultas = new javax.swing.JTable();
        BuscarNombre = new javax.swing.JButton();
        BuscadorNombre = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        BuscarDNI = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        BuscadorApellido = new javax.swing.JTextField();
        BuscarApellido = new javax.swing.JButton();
        BuscadorProducto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        BuscarProducto = new javax.swing.JButton();
        FechaDeInicio = new com.toedter.calendar.JDateChooser();
        FechaDeFin = new com.toedter.calendar.JDateChooser();
        BuscarFecha = new javax.swing.JButton();
        InfoFactura = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        campoObligatorio1 = new javax.swing.JLabel();
        campoObligatorio2 = new javax.swing.JLabel();
        campoObligatorio3 = new javax.swing.JLabel();
        campoObligatorio4 = new javax.swing.JLabel();
        campoObligatorio5 = new javax.swing.JLabel();
        campoObligatorio6 = new javax.swing.JLabel();
        campoObligatorio7 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        eliminador = new javax.swing.JButton();
        campoObligatorio8 = new javax.swing.JLabel();
        campoObligatorio9 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1150, 580));

        panelju.setBackground(new java.awt.Color(255, 255, 255));
        panelju.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel18.setText("NOMBRE");
        panelju.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        BuscadorDNI.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        BuscadorDNI.setMargin(new java.awt.Insets(2, 15, 2, 6));
        BuscadorDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorDNIActionPerformed(evt);
            }
        });
        panelju.add(BuscadorDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 180, 35));

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

        panelju.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 620, 480));

        BuscarNombre.setBackground(new java.awt.Color(46, 48, 147));
        BuscarNombre.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        BuscarNombre.setForeground(new java.awt.Color(255, 255, 255));
        BuscarNombre.setText("Filtrar");
        BuscarNombre.setToolTipText("");
        BuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarNombreActionPerformed(evt);
            }
        });
        panelju.add(BuscarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 150, 35));

        BuscadorNombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        BuscadorNombre.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelju.add(BuscadorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 180, 35));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel19.setText("FILTRAR POR:");
        panelju.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        BuscarDNI.setBackground(new java.awt.Color(46, 48, 147));
        BuscarDNI.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        BuscarDNI.setForeground(new java.awt.Color(255, 255, 255));
        BuscarDNI.setText("Filtrar");
        BuscarDNI.setToolTipText("");
        BuscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarDNIActionPerformed(evt);
            }
        });
        panelju.add(BuscarDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 150, 35));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel20.setText("FECHA FIN");
        panelju.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        BuscadorApellido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        BuscadorApellido.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelju.add(BuscadorApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 180, 35));

        BuscarApellido.setBackground(new java.awt.Color(46, 48, 147));
        BuscarApellido.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        BuscarApellido.setForeground(new java.awt.Color(255, 255, 255));
        BuscarApellido.setText("Filtrar");
        BuscarApellido.setToolTipText("");
        BuscarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarApellidoActionPerformed(evt);
            }
        });
        panelju.add(BuscarApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 150, 35));

        BuscadorProducto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        BuscadorProducto.setMargin(new java.awt.Insets(2, 15, 2, 6));
        panelju.add(BuscadorProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 180, 35));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel21.setText("APELLIDO");
        panelju.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 120, -1));

        BuscarProducto.setBackground(new java.awt.Color(46, 48, 147));
        BuscarProducto.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        BuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        BuscarProducto.setText("Filtrar");
        BuscarProducto.setToolTipText("");
        BuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarProductoActionPerformed(evt);
            }
        });
        panelju.add(BuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 150, 35));

        FechaDeInicio.setBackground(new java.awt.Color(255, 255, 255));
        FechaDeInicio.setForeground(new java.awt.Color(46, 48, 147));
        FechaDeInicio.setDateFormatString("dd-MM-yyyy");
        FechaDeInicio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelju.add(FechaDeInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 180, 35));

        FechaDeFin.setBackground(new java.awt.Color(255, 255, 255));
        FechaDeFin.setForeground(new java.awt.Color(46, 48, 147));
        FechaDeFin.setDateFormatString("dd-MM-yyyy");
        FechaDeFin.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelju.add(FechaDeFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 180, 35));

        BuscarFecha.setBackground(new java.awt.Color(46, 48, 147));
        BuscarFecha.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        BuscarFecha.setForeground(new java.awt.Color(255, 255, 255));
        BuscarFecha.setText("Filtrar");
        BuscarFecha.setToolTipText("");
        BuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarFechaActionPerformed(evt);
            }
        });
        panelju.add(BuscarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 150, 35));

        InfoFactura.setBackground(new java.awt.Color(46, 48, 147));
        InfoFactura.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        InfoFactura.setForeground(new java.awt.Color(255, 255, 255));
        InfoFactura.setText("Info Factura");
        InfoFactura.setToolTipText("");
        InfoFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoFacturaActionPerformed(evt);
            }
        });
        panelju.add(InfoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, 170, 35));

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel22.setText("CATEGORIA");
        panelju.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jLabel23.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel23.setText("FECHA INICIO");
        panelju.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        campoObligatorio1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio1.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio1.setText("Campo obligatorio (*)");
        panelju.add(campoObligatorio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        campoObligatorio2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio2.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio2.setText("Campo obligatorio (*)");
        panelju.add(campoObligatorio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        campoObligatorio3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio3.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio3.setText("Campo obligatorio (*)");
        panelju.add(campoObligatorio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 140, -1));

        campoObligatorio4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio4.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio4.setText("Campo obligatorio (*)");
        panelju.add(campoObligatorio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        campoObligatorio5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio5.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio5.setText("Campo obligatorio (*)");
        panelju.add(campoObligatorio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, -1));

        campoObligatorio6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio6.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio6.setText("Campo obligatorio (*)");
        panelju.add(campoObligatorio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, -1));

        campoObligatorio7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio7.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio7.setText("Selecione alguna factura");
        panelju.add(campoObligatorio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 570, -1, -1));

        salir.setBackground(new java.awt.Color(46, 48, 147));
        salir.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Regresar");
        salir.setToolTipText("");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        panelju.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 590, 170, 35));

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel24.setText("DNI");
        panelju.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        eliminador.setBackground(new java.awt.Color(46, 48, 147));
        eliminador.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        eliminador.setForeground(new java.awt.Color(255, 255, 255));
        eliminador.setText("Eliminador");
        eliminador.setToolTipText("");
        eliminador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminadorActionPerformed(evt);
            }
        });
        panelju.add(eliminador, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 170, 35));

        campoObligatorio8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio8.setForeground(new java.awt.Color(0, 153, 51));
        campoObligatorio8.setText("Se elimino correctamente");
        panelju.add(campoObligatorio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, -1, -1));

        campoObligatorio9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio9.setForeground(new java.awt.Color(255, 51, 0));
        campoObligatorio9.setText("Seleccione alguna factura");
        panelju.add(campoObligatorio9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelju, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelju, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BuscadorDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscadorDNIActionPerformed

    private void BuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNombreActionPerformed
        buscadorO dao = new BuscadorAcciones();
        String BuscadorDeNombre = BuscadorNombre.getText();
        campoObligatorio2.setVisible(false);
        boolean validador = false;
        
        if("".equals(BuscadorDeNombre))
        {
            validador = true;
            campoObligatorio2.setVisible(true);
        }
        if(validador)
        {
            return;
        }        
        DefaultTableModel modelo1 = (DefaultTableModel) Tconsultas.getModel();
         modelo1.setRowCount(0);
        try {
            Map<String, String> ListaProductos = dao.obtenerDNIyNombresClientes();
            for (Map.Entry<String, String> entry : ListaProductos.entrySet()) {
                if(entry.getValue().equalsIgnoreCase(BuscadorDeNombre)){
                    System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
                    // Llama al método llamar para obtener la lista de FacturaC
                    List<FacturaC> listaFacturas = dao.llamar(entry.getKey());
                    // Imprime la información utilizando programación funcional
                    listaFacturas.forEach(factura -> {
                             Object[] fila = {
                            factura.getIDFactura(),
                            factura.getIDCliente(),
                            factura.getNombreCliente(),
                            factura.getHora(),
                            factura.getFecha(),
                            factura.getDirreccion(),
                            factura.getPagoTotaldeFactura()
                        };
                        modelo1.addRow(fila);
                    });

                }
            }
            BuscadorNombre.setText("");
        } catch (Exception ex) {
            Logger.getLogger(BuscarPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BuscarNombreActionPerformed

    private void BuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarDNIActionPerformed
        buscadorO dao = new BuscadorAcciones();
        String buscadorDeDNI = BuscadorDNI.getText();
        campoObligatorio1.setVisible(false);
        boolean validador = false;
        
        if("".equals(buscadorDeDNI))
        {
            validador = true;
            campoObligatorio1.setVisible(true);
        }
        if(validador)
        {
            return;
        }
        DefaultTableModel modelo1 = (DefaultTableModel) Tconsultas.getModel();
        modelo1.setRowCount(0);

        try {
            List<FacturaC> listaFacturas = dao.llamar(buscadorDeDNI);

            listaFacturas.forEach(factura -> {
                    Object[] fila = {
                        factura.getIDFactura(),
                        factura.getIDCliente(),
                        factura.getNombreCliente(),
                        factura.getHora(),
                        factura.getFecha(),
                        factura.getDirreccion(),
                        factura.getPagoTotaldeFactura()
                    };
                    modelo1.addRow(fila);
            });
            BuscadorDNI.setText("");
        } catch (Exception ex) {
            Logger.getLogger(BuscarPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_BuscarDNIActionPerformed

    private void BuscarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarApellidoActionPerformed
        buscadorO dao = new BuscadorAcciones();
        String BuscadorDeApellido = BuscadorApellido.getText();
        campoObligatorio3.setVisible(false);
        boolean validador = false;
        
        if("".equals(BuscadorDeApellido))
        {
            validador = true;
            campoObligatorio3.setVisible(true);
        }
        if(validador)
        {
            return;
        }        
        DefaultTableModel modelo1 = (DefaultTableModel) Tconsultas.getModel();
        modelo1.setRowCount(0);
        try {
            Map<String, String> ListaProductos = dao.obtenerDNIyApellidoClientes();
            for (Map.Entry<String, String> entry : ListaProductos.entrySet()) {
                if(entry.getValue().equalsIgnoreCase(BuscadorDeApellido)){
                    System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
                    // Llama al método llamar para obtener la lista de FacturaC
                    List<FacturaC> listaFacturas = dao.llamar(entry.getKey());

                    // Imprime la información utilizando programación funcional
                    listaFacturas.forEach(factura -> {

                        Object[] fila = {
                            factura.getIDFactura(),
                            factura.getIDCliente(),
                            factura.getNombreCliente(),
                            factura.getHora(),
                            factura.getFecha(),
                            factura.getDirreccion(),
                            factura.getPagoTotaldeFactura()
                        };
                        modelo1.addRow(fila);
                    });

                }
            }
            BuscadorApellido.setText("");
        } catch (Exception ex) {
            Logger.getLogger(BuscarPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BuscarApellidoActionPerformed

    private void BuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarProductoActionPerformed
        buscadorO dao = new BuscadorAcciones();
        String BuscadorDeProducto = BuscadorProducto.getText();
        campoObligatorio4.setVisible(false);
        boolean validador = false;
        
        if("".equals(BuscadorDeProducto))
        {
            validador = true;
            campoObligatorio4.setVisible(true);
        }
        if(validador)
        {
            return;
        }         
        DefaultTableModel modelo1 = (DefaultTableModel) Tconsultas.getModel();
        modelo1.setRowCount(0);

        try {
            List<FacturaC> listaFacturas = dao.llamarPorProductos(BuscadorDeProducto);

            listaFacturas.forEach(factura -> {
                    Object[] fila = {
                        factura.getIDFactura(),
                        factura.getIDCliente(),
                        factura.getNombreCliente(),
                        factura.getHora(),
                        factura.getFecha(),
                        factura.getDirreccion(),
                        factura.getPagoTotaldeFactura()
                    };
                    modelo1.addRow(fila);
            });
        } catch (Exception ex) {
            Logger.getLogger(BuscarPedido.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_BuscarProductoActionPerformed

    private void BuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarFechaActionPerformed
        buscadorO dao = new BuscadorAcciones();
        DefaultTableModel modelo1 = (DefaultTableModel) Tconsultas.getModel();
        modelo1.setRowCount(0);
        Date fechaInicio = FechaDeInicio.getDate();
        Date fechaFin = FechaDeFin.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        String fechadeinicio = (fechaInicio != null) ? sdf.format(fechaInicio) : "";
        String fechadefin = (fechaFin != null) ? sdf.format(fechaFin) : "";

        campoObligatorio5.setVisible(false);
        campoObligatorio6.setVisible(false);
        boolean validador = false;
        
        if("".equals(fechadeinicio))
        {
            validador = true;
            campoObligatorio5.setVisible(true);
        }
        if("".equals(fechadefin))
        {
            validador = true;
            campoObligatorio6.setVisible(true);
        }        
        if(validador)
        {
            return;
        }         
        try {
            List<FacturaC> listaFacturas = dao.llamarPorFecha(fechadeinicio, fechadefin);
            listaFacturas.forEach(factura -> {
                    Object[] fila = {
                        factura.getIDFactura(),
                        factura.getIDCliente(),
                        factura.getNombreCliente(),
                        factura.getHora(),
                        factura.getFecha(),
                        factura.getDirreccion(),
                        factura.getPagoTotaldeFactura()
                    };
                    modelo1.addRow(fila);
            });
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_BuscarFechaActionPerformed

    private void InfoFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoFacturaActionPerformed
        int selectedRow = Tconsultas.getSelectedRow();
        int selectedColumn = Tconsultas.getSelectedColumn();
        campoObligatorio7.setVisible(false);
        
        if (selectedRow != -1 && selectedColumn != -1) {
            Object selectedValue = Tconsultas.getValueAt(selectedRow, 0);
            System.out.println("Valor seleccionado: " + selectedValue);
            this.id = String.valueOf(selectedValue);
            System.out.println(id);
            InfoFactura info = new InfoFactura();
            info.setVisible(true);
            
        } else {
            System.out.println("Ninguna celda seleccionada.");
            campoObligatorio7.setVisible(true);
        }
    }//GEN-LAST:event_InfoFacturaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        visualizador(new BuscarPrincipal());
    }//GEN-LAST:event_salirActionPerformed

    private void eliminadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminadorActionPerformed
        DefaultTableModel model = (DefaultTableModel) Tconsultas.getModel();
        pedidosO dao = new PedidosAcciones();
        int val = Tconsultas.getSelectedRow();
        campoObligatorio8.setVisible(false);
        campoObligatorio9.setVisible(false);
        if(val == -1 )
        {
            campoObligatorio9.setVisible(true);
        } else
        {
            for(int i : Tconsultas.getSelectedRows())
            {
                int borrador = (int) Tconsultas.getValueAt(i, 0);

                try {
                    System.out.println(borrador);
                    dao.eliminar(String.valueOf(borrador));
                    model.setRowCount(0);
                    campoObligatorio8.setVisible(true);
                    campoObligatorio9.setVisible(false);
                } catch (Exception ex) {
                }
            }
        }
    }//GEN-LAST:event_eliminadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscadorApellido;
    private javax.swing.JTextField BuscadorDNI;
    private javax.swing.JTextField BuscadorNombre;
    private javax.swing.JTextField BuscadorProducto;
    private javax.swing.JButton BuscarApellido;
    private javax.swing.JButton BuscarDNI;
    private javax.swing.JButton BuscarFecha;
    private javax.swing.JButton BuscarNombre;
    private javax.swing.JButton BuscarProducto;
    private com.toedter.calendar.JDateChooser FechaDeFin;
    private com.toedter.calendar.JDateChooser FechaDeInicio;
    private javax.swing.JButton InfoFactura;
    public javax.swing.JTable Tconsultas;
    private javax.swing.JLabel campoObligatorio1;
    private javax.swing.JLabel campoObligatorio2;
    private javax.swing.JLabel campoObligatorio3;
    private javax.swing.JLabel campoObligatorio4;
    private javax.swing.JLabel campoObligatorio5;
    private javax.swing.JLabel campoObligatorio6;
    private javax.swing.JLabel campoObligatorio7;
    private javax.swing.JLabel campoObligatorio8;
    private javax.swing.JLabel campoObligatorio9;
    private javax.swing.JButton eliminador;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelju;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
