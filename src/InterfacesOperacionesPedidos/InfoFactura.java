package InterfacesOperacionesPedidos;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Acciones.BuscadorAcciones;
import clases.InfoFacturaC;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Marlon Diego Lupaca
 */
public class InfoFactura extends javax.swing.JFrame {
    private static List<InfoFacturaC> listaInformacion = new ArrayList<>();
    private static DefaultTableModel tabla = new DefaultTableModel(); 
    public InfoFactura() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.mostrar();
    }
    public void mostrar() {
        tabla.setRowCount(0);
        tabla.setColumnCount(0);
        tabla.addColumn("N.Producto");
        tabla.addColumn("Categoria");
        tabla.addColumn("P.Unitario");
        tabla.addColumn("Cantidad");
        tabla.addColumn("Subtotal");
        Tdetalle.setModel(tabla);
        Tdetalle.setShowVerticalLines(false);
        Tdetalle.setRowHeight(28);
        JTableHeader cabecera = Tdetalle.getTableHeader();
        Font headerFont = new Font("Roboto", Font.PLAIN, 18);
        cabecera.setFont(headerFont);
        cabecera.setBackground(new Color(0x2E3093));
        cabecera.setForeground(Color.WHITE);
        BuscarPedido sc = new BuscarPedido();    
        BuscadorAcciones dao = new BuscadorAcciones();
        try {
            listaInformacion = dao.llamarInfoFactura(sc.getId());
            System.out.println(sc.getId());

            for (InfoFacturaC<String> factura : listaInformacion) {
                info1.setText(factura.getIDFactura());
                info2.setText(factura.getHora());
                info3.setText(factura.getFecha());
                info4.setText(factura.getDireccion());
                info5.setText(factura.getTotalFactura());
                info6.setText(factura.getIDCliente());
                info7.setText(factura.getNombre());
                info8.setText(factura.getApellido());
                info9.setText(factura.getDireccionDelCliente());
                info10.setText(factura.getGenero());
                info11.setText(factura.getCorreo());
                info12.setText(factura.getCelular());

                // Agrega fila al modelo de la tabla
                Object[] fila = {
                        factura.getNombreProducto(),
                        factura.getIDCategoria(),
                        factura.getPrecio(),
                        factura.getCantidad(),
                        factura.getTotalPagar()
                };
                tabla.addRow(fila);
            }
        } catch (Exception ex) {
            Logger.getLogger(InfoFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tres1 = new javax.swing.JLabel();
        look = new javax.swing.JPanel();
        dos = new javax.swing.JLabel();
        uno = new javax.swing.JLabel();
        info3 = new javax.swing.JLabel();
        info1 = new javax.swing.JLabel();
        tres = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        tres2 = new javax.swing.JLabel();
        info4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        tres6 = new javax.swing.JLabel();
        info5 = new javax.swing.JLabel();
        info2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tres3 = new javax.swing.JLabel();
        look1 = new javax.swing.JPanel();
        uno1 = new javax.swing.JLabel();
        info8 = new javax.swing.JLabel();
        info6 = new javax.swing.JLabel();
        tres7 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        tres8 = new javax.swing.JLabel();
        info9 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        tres9 = new javax.swing.JLabel();
        info11 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        tres10 = new javax.swing.JLabel();
        info10 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        tres11 = new javax.swing.JLabel();
        info12 = new javax.swing.JLabel();
        info7 = new javax.swing.JLabel();
        dos2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tdetalle = new javax.swing.JTable();
        InfoFactura = new javax.swing.JButton();
        InfoFactura1 = new javax.swing.JButton();
        dos1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(810, 970));
        jPanel1.setPreferredSize(new java.awt.Dimension(810, 970));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(46, 48, 147));

        tres1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tres1.setForeground(new java.awt.Color(255, 255, 255));
        tres1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tres1.setText("Informacion Factura");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tres1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tres1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 360, 40));

        look.setBackground(new java.awt.Color(255, 255, 255));
        look.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 48, 147), 4));
        look.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        dos.setText("IDFactura:");
        look.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 186, -1));

        uno.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        uno.setText("Hora:");
        look.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 186, -1));

        info3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        info3.setText(" ");
        look.add(info3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 310, -1));

        info1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        info1.setText(" ");
        look.add(info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, -1));

        tres.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres.setText("Fecha:");
        look.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 186, -1));

        jSeparator1.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 360, 10));

        jSeparator2.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 360, 10));

        jSeparator3.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 360, 10));

        tres2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres2.setText("Direccion:");
        look.add(tres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 211, -1));

        info4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        info4.setText(" ");
        look.add(info4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 310, -1));

        jSeparator4.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 360, -1));

        tres6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres6.setText("Total de la Factura:");
        look.add(tres6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 215, -1));

        info5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        info5.setText(" ");
        look.add(info5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 300, -1));

        info2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        info2.setText(" ");
        look.add(info2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 310, -1));

        jPanel1.add(look, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 360, 360));

        jPanel5.setBackground(new java.awt.Color(46, 48, 147));

        tres3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tres3.setForeground(new java.awt.Color(255, 255, 255));
        tres3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tres3.setText("Informacion Cliente");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tres3, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tres3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 360, 40));

        look1.setBackground(new java.awt.Color(255, 255, 255));
        look1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 48, 147), 4));
        look1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uno1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        uno1.setText("Nombre:");
        look1.add(uno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 186, -1));

        info8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        info8.setText(" ");
        look1.add(info8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 310, -1));

        info6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        info6.setText(" ");
        look1.add(info6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, -1));

        tres7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres7.setText("Apellido:");
        look1.add(tres7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 186, -1));

        jSeparator9.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 360, 10));

        jSeparator10.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 360, 10));

        jSeparator11.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 360, 10));

        tres8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres8.setText("Direccion del Cliente:");
        look1.add(tres8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 211, -1));

        info9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        info9.setText(" ");
        look1.add(info9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 310, -1));

        jSeparator12.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 360, -1));

        jSeparator13.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 360, 10));

        tres9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres9.setText("Correo:");
        look1.add(tres9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 215, -1));

        info11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        info11.setText(" ");
        look1.add(info11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 310, -1));

        jSeparator14.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 360, 10));

        jSeparator15.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator15.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 250, 10));

        tres10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres10.setText("Genero:");
        look1.add(tres10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 215, -1));

        info10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        info10.setText(" ");
        look1.add(info10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 300, -1));

        jSeparator16.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator16.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 250, 10));

        tres11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres11.setText("Celular:");
        look1.add(tres11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 215, -1));

        info12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        info12.setText(" ");
        look1.add(info12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 310, -1));

        info7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        info7.setText(" ");
        look1.add(info7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 310, -1));

        dos2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        dos2.setText("IDCliente (DNI):");
        look1.add(dos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 186, -1));

        jPanel1.add(look1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 360, 500));

        Tdetalle.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Tdetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tdetalle.setSelectionBackground(new java.awt.Color(46, 48, 147));
        Tdetalle.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tdetalle);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 750, 350));

        InfoFactura.setBackground(new java.awt.Color(46, 48, 147));
        InfoFactura.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        InfoFactura.setForeground(new java.awt.Color(255, 255, 255));
        InfoFactura.setText("EXIT");
        InfoFactura.setToolTipText("");
        InfoFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(InfoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 100, 35));

        InfoFactura1.setBackground(new java.awt.Color(46, 48, 147));
        InfoFactura1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        InfoFactura1.setForeground(new java.awt.Color(255, 255, 255));
        InfoFactura1.setText("Generar pdf");
        InfoFactura1.setToolTipText("");
        InfoFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoFactura1ActionPerformed(evt);
            }
        });
        jPanel1.add(InfoFactura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 170, 35));

        dos1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        dos1.setText("Productos:");
        jPanel1.add(dos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 186, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InfoFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoFacturaActionPerformed
        this.dispose();
    }//GEN-LAST:event_InfoFacturaActionPerformed

    private void InfoFactura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoFactura1ActionPerformed
        Document documento = new Document();

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("Factura.pdf"));
            documento.open();
            
             // Agregar la imagen
            String rutaImagen = "src/imagenes/logofinal2.png";  // Reemplaza con la ruta correcta de tu imagen
            Image imagen = Image.getInstance(rutaImagen);
            imagen.scaleToFit(90, 90);
            imagen.setAbsolutePosition(20, 730);
            documento.add(imagen);
            agregarContenido(documento);
            documento.close();

            JOptionPane.showMessageDialog(null, "Se creó el archivo 'Factura.pdf' en la carpeta del proyecto.");

        } catch (DocumentException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void agregarContenido(com.itextpdf.text.Document documento) throws DocumentException {
        if (!listaInformacion.isEmpty()) {
        InfoFacturaC factura = listaInformacion.get(0);
        // Crear una tabla para el encabezado con 2 columnas
        PdfPTable tablaEncabezado = new PdfPTable(3);
        tablaEncabezado.setWidthPercentage(100);

        // Crear una celda para la columna lateral (columna 1)
        PdfPCell celdaLateral = new PdfPCell();
        celdaLateral.setBorder(Rectangle.NO_BORDER);
        //Columna3
        PdfPCell celda = new PdfPCell();
        celda.setBorder(Rectangle.LEFT);
        celda.setBorderColor(BaseColor.LIGHT_GRAY);
        
        com.itextpdf.text.Font fuenteArial2 = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 11, com.itextpdf.text.Font.NORMAL);
        fuenteArial2.setColor(BaseColor.LIGHT_GRAY);
        Paragraph contenido1 = new Paragraph();
        contenido1.setFont(fuenteArial2);
        contenido1.add(new Phrase("  PASTELERIA\n  PANADERIA\n", fuenteArial2));
        celda.setVerticalAlignment(Element.ALIGN_MIDDLE);
        
        celda.addElement(contenido1);

        // Establecer los anchos relativos de las columnas (20% para la columna 1 y 15% para la columna 2)
        float[] columnWidths = {8.5f, 30, 20};
        tablaEncabezado.setWidths(columnWidths);

        // Crear una celda para el rectángulo (columna 2)
        PdfPCell celdaRectangulo = new PdfPCell();
        celdaRectangulo.setBorder(Rectangle.NO_BORDER);
        celdaRectangulo.setFixedHeight(60f);
        //celdaRectangulo.setPaddingLeft(0);

        // Establecer el fondo gris para el rectángulo (#ededed)
        BaseColor grisClaro = new BaseColor(237, 237, 237);
        celdaRectangulo.setBackgroundColor(grisClaro);

        // Crear un párrafo con diferentes fuentes y contenido para el rectángulo
        com.itextpdf.text.Font fuenteArial = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 11, com.itextpdf.text.Font.NORMAL);
        com.itextpdf.text.Font fuenteArial1 = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 15, com.itextpdf.text.Font.BOLD);
        Paragraph contenido = new Paragraph();
        contenido.setFont(fuenteArial);
        contenido.add(new Phrase("Factura electrónica\n", fuenteArial1));
        contenido.add(new Phrase("RUC: 20112811096\n", fuenteArial));
        contenido.add(new Phrase("ID Factura: 000"+ factura.getIDFactura(), fuenteArial));
        contenido.setAlignment(Element.ALIGN_CENTER);

        // Agregar el contenido al rectángulo
        celdaRectangulo.addElement(contenido);

        // Agregar las celdas a la tabla principal
        tablaEncabezado.addCell(celdaLateral);
        tablaEncabezado.addCell(celda);
        tablaEncabezado.addCell(celdaRectangulo);
        
        // Agregar la tabla al documento
        documento.add(tablaEncabezado);
        documento.add(new Paragraph(" "));
        
        //
        PdfPTable info = new PdfPTable(1);
        info.setWidthPercentage(100);
        
        PdfPCell cellfactura = new PdfPCell();
        cellfactura.setBackgroundColor(grisClaro);
        cellfactura.setBorder(Rectangle.BOX);
        cellfactura.setFixedHeight(26f);
        Paragraph contenido11 = new Paragraph();
        contenido11.setFont(fuenteArial);
        contenido11.add(new Phrase("INFORMACION DE LA FACTURA", fuenteArial));
        contenido11.setAlignment(Element.ALIGN_CENTER);
        cellfactura.addElement(contenido11);
        
        PdfPCell celdafactura = new PdfPCell();
        celdafactura.setBorder(Rectangle.BOX);
        celdafactura.setFixedHeight(80f);
        
        // Crear un párrafo con diferentes fuentes y contenido para el rectángulo
        com.itextpdf.text.Font fuenteArial3 = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 11, com.itextpdf.text.Font.NORMAL);
        Paragraph contenido3 = new Paragraph();
        contenido3.setFont(fuenteArial);
        contenido3.add(new Phrase("   Hora: "+factura.getHora()+"\n", fuenteArial3));
        contenido3.add(new Phrase("   Fecha: "+factura.getFecha()+"\n", fuenteArial3));
        contenido3.add(new Phrase("   Dirección: "+factura.getDireccion()+"\n", fuenteArial3));
        contenido3.add(new Phrase("   Total Factura: "+factura.getTotalFactura(), fuenteArial3));
        celdafactura.addElement(contenido3);
        
        info.addCell(cellfactura);
        info.addCell(celdafactura);
        documento.add(info);
        documento.add(new Paragraph(" "));
        
        //
        PdfPTable cliente = new PdfPTable(1);
        cliente.setWidthPercentage(100);
        
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(grisClaro);
        cell.setBorder(Rectangle.BOX);
        cell.setFixedHeight(26f);
        Paragraph contenido10 = new Paragraph();
        contenido10.setFont(fuenteArial);
        contenido10.add(new Phrase("INFORMACION DEL CLIENTE", fuenteArial3));
        contenido10.setAlignment(Element.ALIGN_CENTER);
        cell.addElement(contenido10);
        
        PdfPCell celdacliente = new PdfPCell();
        celdacliente.setBorder(Rectangle.BOX);
        celdacliente.setFixedHeight(110f);
        
        // Crear un párrafo con diferentes fuentes y contenido para el rectángulo
        com.itextpdf.text.Font fuenteArial4 = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 11, com.itextpdf.text.Font.NORMAL);
        Paragraph contenido4 = new Paragraph();
        contenido4.setFont(fuenteArial);
        contenido4.add(new Phrase("   DNI: "+factura.getIDCliente()+"\n", fuenteArial4));
        contenido4.add(new Phrase("   Nombre: "+factura.getNombre()+"\n", fuenteArial4));
        contenido4.add(new Phrase("   Dirección: "+factura.getDireccionDelCliente()+"\n", fuenteArial4));
        contenido4.add(new Phrase("   Género: "+factura.getGenero()+"\n", fuenteArial4));
        contenido4.add(new Phrase("   Correo: "+factura.getCorreo()+"\n", fuenteArial4));
        contenido4.add(new Phrase("   Celular: "+factura.getCelular(), fuenteArial4));
        celdacliente.addElement(contenido4);
        
        cliente.addCell(cell);
        cliente.addCell(celdacliente);
        documento.add(cliente);

        documento.add(new Paragraph(" "));

        // Encabezado: Tabla de Detalles de Factura
        PdfPTable tablaDetalles = new PdfPTable(5);
        tablaDetalles.setWidthPercentage(100);

        PdfPCell cellProducto = new PdfPCell();
        cellProducto.setBackgroundColor(grisClaro);
        cellProducto.setBorder(Rectangle.BOX);
        Paragraph contenido5 = new Paragraph();
        contenido5.setFont(fuenteArial);
        contenido5.add(new Phrase("PRODUCTOS", fuenteArial4));
        contenido5.setAlignment(Element.ALIGN_CENTER);
        cellProducto.addElement(contenido5);

        PdfPCell cellCategoria = new PdfPCell();
        cellCategoria.setBackgroundColor(grisClaro);
        cellCategoria.setBorder(Rectangle.BOX);
        Paragraph contenido6 = new Paragraph();
        contenido6.setFont(fuenteArial);
        contenido6.add(new Phrase("CATEGORIAS", fuenteArial4));
        contenido6.setAlignment(Element.ALIGN_CENTER);
        cellCategoria.addElement(contenido6);

        PdfPCell cellUnitario = new PdfPCell();
        cellUnitario.setBackgroundColor(grisClaro);
        cellUnitario.setBorder(Rectangle.BOX);
        Paragraph contenido7 = new Paragraph();
        contenido7.setFont(fuenteArial);
        contenido7.add(new Phrase("PRECIO UNITARIO", fuenteArial4));
        contenido7.setAlignment(Element.ALIGN_CENTER);
        cellUnitario.addElement(contenido7);

        PdfPCell cellCantidad = new PdfPCell();
        cellCantidad.setBackgroundColor(grisClaro);
        cellCantidad.setBorder(Rectangle.BOX);
        cellCantidad.setFixedHeight(23f);
        Paragraph contenido8 = new Paragraph();
        contenido8.setFont(fuenteArial);
        contenido8.add(new Phrase("CANTIDAD", fuenteArial4));
        contenido8.setAlignment(Element.ALIGN_CENTER);
        cellCantidad.addElement(contenido8);

        PdfPCell cellSubtotal = new PdfPCell();
        cellSubtotal.setBackgroundColor(grisClaro);
        cellSubtotal.setBorder(Rectangle.BOX);
        Paragraph contenido9 = new Paragraph();
        contenido9.setFont(fuenteArial);
        contenido9.add(new Phrase("SUBTOTAL", fuenteArial4));
        contenido9.setAlignment(Element.ALIGN_CENTER);
        cellSubtotal.addElement(contenido9);

        // Configuración de las columnas de la tabla de detalles
        tablaDetalles.addCell(cellProducto);        // Columna 1: Nombre del producto
        tablaDetalles.addCell(cellCategoria);       // Columna 2: Categoría del producto
        tablaDetalles.addCell(cellUnitario); // Columna 3: Precio unitario del producto
        tablaDetalles.addCell(cellCantidad);        // Columna 4: Cantidad de productos
        tablaDetalles.addCell(cellSubtotal);        // Columna 5: Subtotal de la fila


        // Datos de ejemplo
        for (InfoFacturaC<String> facturad : listaInformacion) 
        {
            agregarFilaTabla(tablaDetalles, facturad.getNombreProducto(), facturad.getIDCategoria(), facturad.getPrecio(), facturad.getCantidad(), facturad.getTotalPagar());
            
        }

        // Agregar la tabla de detalles al documento
        documento.add(tablaDetalles);
        documento.add(new Paragraph(" "));
        
        //
        PdfPTable tablatotal = new PdfPTable(2);
        tablatotal.setWidthPercentage(100);
        
        float[] columnWidths1 = {50, 12};
        tablatotal.setWidths(columnWidths1);

        // Celda 1
        PdfPCell celda1 = new PdfPCell();
        celda1.setBorder(Rectangle.NO_BORDER);
        celda1.setFixedHeight(28f);
        Paragraph contenidoCelda1 = new Paragraph("");
        contenidoCelda1.setAlignment(Element.ALIGN_CENTER);
        celda1.addElement(contenidoCelda1);
        tablatotal.addCell(celda1);

        // Celda 2
        PdfPCell celda2 = new PdfPCell();
        celda2.setBackgroundColor(grisClaro);
        celda2.setBorder(Rectangle.BOX);
        celda2.setFixedHeight(26f);
        Paragraph contenidoCelda2 = new Paragraph("TOTAL: "+factura.getTotalFactura());
        contenidoCelda2.setAlignment(Element.ALIGN_CENTER);
        celda2.addElement(contenidoCelda2);
        tablatotal.addCell(celda2);

        // Agregar la tabla al documento
        documento.add(tablatotal);
        }
    }
        private static void agregarFilaTabla(PdfPTable tabla, String producto, String categoria, String precioUnitario, String cantidad, String subtotal) {
            // Celda para Producto
            com.itextpdf.text.Font fuenteArial4 = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 11, com.itextpdf.text.Font.NORMAL);
            
            PdfPCell cellProducto = new PdfPCell();
            cellProducto.setBorder(Rectangle.BOX);
            Paragraph contenidoProducto = new Paragraph();
            contenidoProducto.setFont(fuenteArial4);
            contenidoProducto.add(new Phrase(producto, fuenteArial4));
            cellProducto.addElement(contenidoProducto);

            // Celda para Categoría
            PdfPCell cellCategoria = new PdfPCell();
            cellCategoria.setBorder(Rectangle.BOX);
            Paragraph contenidoCategoria = new Paragraph();
            contenidoCategoria.setFont(fuenteArial4);
            contenidoCategoria.add(new Phrase(categoria, fuenteArial4));
            cellCategoria.addElement(contenidoCategoria);

            // Celda para Precio Unitario
            PdfPCell cellPrecioUnitario = new PdfPCell();
            cellPrecioUnitario.setBorder(Rectangle.BOX);
            Paragraph contenidoPrecioUnitario = new Paragraph();
            contenidoPrecioUnitario.setFont(fuenteArial4);
            contenidoPrecioUnitario.add(new Phrase(precioUnitario, fuenteArial4));
            cellPrecioUnitario.addElement(contenidoPrecioUnitario);

            // Celda para Cantidad
            PdfPCell cellCantidad = new PdfPCell();
            cellCantidad.setBorder(Rectangle.BOX);
            cellCantidad.setFixedHeight(23f); // Ajusta esta altura según tus necesidades
            Paragraph contenidoCantidad = new Paragraph();
            contenidoCantidad.setFont(fuenteArial4);
            contenidoCantidad.add(new Phrase(cantidad, fuenteArial4));
            cellCantidad.addElement(contenidoCantidad);

            // Celda para Subtotal
            PdfPCell cellSubtotal = new PdfPCell();
            cellSubtotal.setBorder(Rectangle.BOX);
            Paragraph contenidoSubtotal = new Paragraph();
            contenidoSubtotal.setFont(fuenteArial4);
            contenidoSubtotal.add(new Phrase(subtotal, fuenteArial4));
            cellSubtotal.addElement(contenidoSubtotal);

            // Agregar las celdas a la tabla
            tabla.addCell(cellProducto);        // Columna 1: Nombre del producto
            tabla.addCell(cellCategoria);       // Columna 2: Categoría del producto
            tabla.addCell(cellPrecioUnitario); // Columna 3: Precio unitario del producto
            tabla.addCell(cellCantidad);        // Columna 4: Cantidad de productos
            tabla.addCell(cellSubtotal);        // Columna 5: Subtotal de la fila
    }//GEN-LAST:event_InfoFactura1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InfoFactura;
    private javax.swing.JButton InfoFactura1;
    public javax.swing.JTable Tdetalle;
    private javax.swing.JLabel dos;
    private javax.swing.JLabel dos1;
    private javax.swing.JLabel dos2;
    private javax.swing.JLabel info1;
    private javax.swing.JLabel info10;
    private javax.swing.JLabel info11;
    private javax.swing.JLabel info12;
    private javax.swing.JLabel info2;
    private javax.swing.JLabel info3;
    private javax.swing.JLabel info4;
    private javax.swing.JLabel info5;
    private javax.swing.JLabel info6;
    private javax.swing.JLabel info7;
    private javax.swing.JLabel info8;
    private javax.swing.JLabel info9;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel look;
    private javax.swing.JPanel look1;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel tres1;
    private javax.swing.JLabel tres10;
    private javax.swing.JLabel tres11;
    private javax.swing.JLabel tres2;
    private javax.swing.JLabel tres3;
    private javax.swing.JLabel tres6;
    private javax.swing.JLabel tres7;
    private javax.swing.JLabel tres8;
    private javax.swing.JLabel tres9;
    private javax.swing.JLabel uno;
    private javax.swing.JLabel uno1;
    // End of variables declaration//GEN-END:variables
}
