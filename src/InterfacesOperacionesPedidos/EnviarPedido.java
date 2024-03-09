package InterfacesOperacionesPedidos;
import Acciones.ClientesAcciones;
import Acciones.PedidosAcciones;
import Acciones.ProductosAcciones;
import base.conexion;
import clases.FacturaC;
import clases.clientesC;
import clases.pilaC;
import clases.productosC;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.JTableHeader;
import operaciones.clientesO;
import operaciones.pedidosO;
import operaciones.productosO;
/**
 *
 * @author Marlon Diego Lupaca
 */
public class EnviarPedido extends javax.swing.JPanel implements Runnable{
    private String hora,minutos,segundos,ampm;
    private Calendar calendario;
    private Thread h1;
    private int IDClienteE;
    private int NuevoIDFactura;
    private int ContadorFilas;
    private String fechaFormateada;
    private double TotalFacturaPagar = 0;
    private double PagoTotaldeFactura;
    private int ContadorProductoAgregados = 1;
    Map<Integer,pilaC> PilaProductos= new HashMap<>();
    
    public EnviarPedido() {
        initComponents();
        h1 =  new Thread(this);
        h1.start();
        setVisible(true);
        this.run();
        this.mostrar();
        this.llenar();
        this.fecha();
        this.llenarProductos();
        this.ObtenerNuevoIDFactura();

        correcto.setVisible(false);
        campoObligatorio.setVisible(false);
         campoObligatorio1.setVisible(false);
        campoObligatorio3.setVisible(false);
        campoObligatorio4.setVisible(false);
        campoObligatorio6.setVisible(false);
        ValidadorColumnas.setVisible(false);
        cambioInsuficiente.setVisible(false);
        ClienteNoEncontrado.setVisible(false);
        ProductoNoEncontrado.setVisible(false);
        campoObligatorioNumero.setVisible(false);
        correcto.setVisible(false);
        fila.setVisible(false);
    }

    public void mostrar() {
        
            DefaultTableModel tabla = new DefaultTableModel(); 
            tabla.addColumn("N°");
            tabla.addColumn("Nombre");
            tabla.addColumn("Presentacion");
            tabla.addColumn("Categoria");
            tabla.addColumn("Descripcion");
            tabla.addColumn("Cantidad");
            tabla.addColumn("P.Unitario");
            tabla.addColumn("Total Pagar");
            Tpedidos.setModel(tabla);
            Tpedidos.setShowVerticalLines(false);
            Tpedidos.setRowHeight(28);
            JTableHeader cabecera = Tpedidos.getTableHeader();
            Font headerFont = new Font("Roboto", Font.PLAIN, 18);
            cabecera.setFont(headerFont);
            cabecera.setBackground(new Color(0x2E3093));
            cabecera.setForeground(Color.WHITE);
        }
       public void llenar() {
            clientes.setBackground(Color.white);
            PedidosAcciones sc = new PedidosAcciones();

            try {
                Map<String, String> dniNombres = sc.obtenerDNIyNombresClientes();

                for (Map.Entry<String, String> jalador : dniNombres.entrySet()) {
                    String dni = jalador.getKey();
                    String nombre = jalador.getValue();
                    clientes.addItem(dni + " - " + nombre);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            clientes.setSelectedItem(null);
        }
        public void fecha()
        {
            // Obtén la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Formatea la fecha como una cadena
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        fechaFormateada = fechaActual.format(formatter);
        FechaActu.setText(fechaFormateada);
        System.out.println(fechaFormateada);
        }


        public void llenarProductos()
        {
            productos.setBackground(Color.white);
            PedidosAcciones sc = new PedidosAcciones();
            try {

                Map<String, String> ListaProductos = sc.obtenerIDProductosyNombresProductos();
                
                for (Map.Entry<String, String> jalador : ListaProductos.entrySet()) {
                    
                    String nombre = jalador.getValue();
                    productos.addItem(nombre);
                }
            } catch (Exception ex) {
                
            }
            productos.setSelectedItem(null);
        }
        
        @Override
        public void run() {
            Thread ct=Thread.currentThread();
            while(ct==h1)
            {
                calcular();
                HoraActu.setText(hora+":"+minutos+":"+segundos+" "+ampm);
                try
                {
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                }
            }
        }
        
        public void calcular()
        {
            Calendar calendario = new GregorianCalendar();
            Date fechaHoraActual = new Date();
            calendario.setTime(fechaHoraActual);
            ampm = calendario.get(Calendar.AM_PM) ==Calendar.AM?"AM":"PM";
            if(ampm.equals("PM"))
            {
                int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
                hora = h>9?""+h:"0"+h;
            } else 
            {
                hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
            }
            minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
            segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
        }
        
        
        
        public void ObtenerNuevoIDFactura()
        {
            pedidosO dao = new PedidosAcciones();
            try {
                int IDFactura = dao.ObtenerFactura();
                NuevoIDFactura = IDFactura + 1;
                String IDBoletaA = String.valueOf(NuevoIDFactura);
                if(NuevoIDFactura>0 & NuevoIDFactura<10){
                    IDBoleta.setText("0000" + IDBoletaA);
                } else if(NuevoIDFactura>=10 & NuevoIDFactura<100){
                    IDBoleta.setText("000" + IDBoletaA);
                } else if (NuevoIDFactura>=100 & NuevoIDFactura<1000){
                    IDBoleta.setText("00" + IDBoletaA);
                }else if (NuevoIDFactura>=1000 & NuevoIDFactura<10000){
                    IDBoleta.setText("0" + IDBoletaA);
                } else{
                    IDBoleta.setText(IDBoletaA);
                }
                

            } catch (Exception ex) {
                Logger.getLogger(EnviarPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PanelRegistrar = new javax.swing.JPanel();
        PanelCategoria = new javax.swing.JPanel();
        panelC = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tpedidos = new javax.swing.JTable();
        correcto = new javax.swing.JButton();
        HoraActu = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        clientes = new javax.swing.JComboBox<>();
        productos = new javax.swing.JComboBox<>();
        cantidadProductos = new javax.swing.JTextField();
        BusquedaDNI = new javax.swing.JTextField();
        carrito = new javax.swing.JButton();
        buscarCliente = new javax.swing.JButton();
        campoproducto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TotalPagarFA = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        registrar4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        Pago = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Vuelto = new javax.swing.JLabel();
        buscarProducto = new javax.swing.JButton();
        ppp1 = new javax.swing.JLabel();
        IDBoleta = new javax.swing.JLabel();
        FechaActu = new javax.swing.JLabel();
        campoObligatorio = new javax.swing.JLabel();
        campoObligatorio3 = new javax.swing.JLabel();
        campoObligatorio4 = new javax.swing.JLabel();
        ValidadorColumnas = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        fila = new javax.swing.JLabel();
        cambioInsuficiente = new javax.swing.JLabel();
        campoObligatorio6 = new javax.swing.JLabel();
        campoObligatorioNumero = new javax.swing.JLabel();
        ClienteNoEncontrado = new javax.swing.JLabel();
        ProductoNoEncontrado = new javax.swing.JLabel();
        look = new javax.swing.JPanel();
        dos = new javax.swing.JLabel();
        uno = new javax.swing.JLabel();
        Dtres = new javax.swing.JLabel();
        Duno = new javax.swing.JLabel();
        tres = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        tres2 = new javax.swing.JLabel();
        Dcuatro = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        tres4 = new javax.swing.JLabel();
        Dseis = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        tres6 = new javax.swing.JLabel();
        Dcinco = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        tres5 = new javax.swing.JLabel();
        Dsiete = new javax.swing.JLabel();
        Ddos = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tres1 = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        campoObligatorio1 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelRegistrar.setPreferredSize(new java.awt.Dimension(850, 580));
        PanelRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelC.setBackground(new java.awt.Color(255, 255, 255));
        panelC.setPreferredSize(new java.awt.Dimension(850, 580));
        panelC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tpedidos.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Tpedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tpedidos.setSelectionBackground(new java.awt.Color(46, 48, 147));
        Tpedidos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tpedidos);

        panelC.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 810, 260));

        correcto.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
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
        panelC.add(correcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 320, 70));

        HoraActu.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        HoraActu.setText("Hora");
        panelC.add(HoraActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 150, 35));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel19.setText("Direccion de Envio");
        panelC.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel20.setText("Cantidad");
        panelC.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, 40));

        clientes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        clientes.setFocusable(false);
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        panelC.add(clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 200, 35));

        productos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        productos.setFocusable(false);
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });
        panelC.add(productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 200, 35));

        cantidadProductos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cantidadProductos.setMargin(new java.awt.Insets(2, 15, 2, 6));
        cantidadProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadProductosActionPerformed(evt);
            }
        });
        panelC.add(cantidadProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 60, 35));

        BusquedaDNI.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        BusquedaDNI.setMargin(new java.awt.Insets(2, 15, 2, 6));
        BusquedaDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaDNIActionPerformed(evt);
            }
        });
        panelC.add(BusquedaDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 250, 35));

        carrito.setBackground(new java.awt.Color(46, 48, 147));
        carrito.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        carrito.setForeground(new java.awt.Color(255, 255, 255));
        carrito.setText("+");
        carrito.setToolTipText("");
        carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritoActionPerformed(evt);
            }
        });
        panelC.add(carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 40, 35));

        buscarCliente.setBackground(new java.awt.Color(46, 48, 147));
        buscarCliente.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        buscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        buscarCliente.setText("BUSCAR DNI");
        buscarCliente.setToolTipText("");
        buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteActionPerformed(evt);
            }
        });
        panelC.add(buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 140, 35));

        campoproducto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        campoproducto.setMargin(new java.awt.Insets(2, 15, 2, 6));
        campoproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoproductoActionPerformed(evt);
            }
        });
        panelC.add(campoproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 250, 35));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel21.setText("Producto");
        panelC.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        registrar.setBackground(new java.awt.Color(46, 48, 147));
        registrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("Registrar Venta");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        panelC.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 200, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 48, 147), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TotalPagarFA.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        TotalPagarFA.setText("           ");
        jPanel1.add(TotalPagarFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 210, 20));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setText("Cambio:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        registrar4.setBackground(new java.awt.Color(46, 48, 147));
        registrar4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        registrar4.setForeground(new java.awt.Color(255, 255, 255));
        registrar4.setText("Calcular Total");
        registrar4.setToolTipText("");
        registrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar4ActionPerformed(evt);
            }
        });
        jPanel1.add(registrar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 180, 35));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel17.setText("Total:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        Pago.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Pago.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagoActionPerformed(evt);
            }
        });
        jPanel1.add(Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 210, 20));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel18.setText("Pago:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 20));

        Vuelto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Vuelto.setText("           ");
        jPanel1.add(Vuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 210, 20));

        panelC.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 370, 150));

        buscarProducto.setBackground(new java.awt.Color(46, 48, 147));
        buscarProducto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        buscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        buscarProducto.setText("BUSCAR ID");
        buscarProducto.setToolTipText("");
        buscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProductoActionPerformed(evt);
            }
        });
        panelC.add(buscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 130, 35));

        ppp1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        ppp1.setText("ID Factura:");
        panelC.add(ppp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 35));

        IDBoleta.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        IDBoleta.setText("    ");
        panelC.add(IDBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 35));

        FechaActu.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        FechaActu.setText("Fecha");
        panelC.add(FechaActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 150, 35));

        campoObligatorio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio.setText("Campo obligatorio (*)");
        panelC.add(campoObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        campoObligatorio3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio3.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio3.setText("Campo obligatorio (*)");
        panelC.add(campoObligatorio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, 20));

        campoObligatorio4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio4.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio4.setText("Campo obligatorio (*)");
        panelC.add(campoObligatorio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, 20));

        ValidadorColumnas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        ValidadorColumnas.setForeground(new java.awt.Color(233, 55, 78));
        ValidadorColumnas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconsrechazo.png"))); // NOI18N
        ValidadorColumnas.setText("Ingrese al menos un producto");
        ValidadorColumnas.setBorderPainted(false);
        ValidadorColumnas.setContentAreaFilled(false);
        ValidadorColumnas.setFocusPainted(false);
        ValidadorColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidadorColumnasActionPerformed(evt);
            }
        });
        panelC.add(ValidadorColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, 70));

        eliminar.setBackground(new java.awt.Color(46, 48, 147));
        eliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        panelC.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 200, 40));

        fila.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fila.setForeground(new java.awt.Color(255, 0, 0));
        fila.setText("Selecione Fila (*)");
        panelC.add(fila, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, -1, -1));

        cambioInsuficiente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cambioInsuficiente.setForeground(new java.awt.Color(255, 0, 0));
        cambioInsuficiente.setText("Pago insuficiente (*)");
        panelC.add(cambioInsuficiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        campoObligatorio6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio6.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio6.setText("Pago insuficiente (*)");
        panelC.add(campoObligatorio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        campoObligatorioNumero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorioNumero.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorioNumero.setText("Ingresa un numero  (*)");
        panelC.add(campoObligatorioNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, 20));

        ClienteNoEncontrado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ClienteNoEncontrado.setForeground(new java.awt.Color(255, 0, 0));
        ClienteNoEncontrado.setText("CLIENTE NO ENCONTRADO");
        panelC.add(ClienteNoEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        ProductoNoEncontrado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ProductoNoEncontrado.setForeground(new java.awt.Color(255, 0, 0));
        ProductoNoEncontrado.setText("PRODUCTO NO ENCONTRADO");
        panelC.add(ProductoNoEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        look.setBackground(new java.awt.Color(255, 255, 255));
        look.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 48, 147), 4));
        look.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        dos.setText("DNI:");
        look.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 186, -1));

        uno.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        uno.setText("Nombre:");
        look.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 186, -1));

        Dtres.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Dtres.setText(" ");
        look.add(Dtres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, -1));

        Duno.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Duno.setText(" ");
        look.add(Duno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 200, -1));

        tres.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres.setText("Apellido:");
        look.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 186, -1));

        jSeparator1.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 250, 10));

        jSeparator2.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 242, 10));

        jSeparator3.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 242, 10));

        tres2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres2.setText("Direccion:");
        look.add(tres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 211, -1));

        Dcuatro.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Dcuatro.setText(" ");
        look.add(Dcuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 200, -1));

        jSeparator4.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 242, -1));

        jSeparator5.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 250, 10));

        tres4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres4.setText("Correo:");
        look.add(tres4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 215, -1));

        Dseis.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Dseis.setText(" ");
        look.add(Dseis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 200, -1));

        jSeparator6.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 250, 10));

        jSeparator7.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 250, 10));

        tres6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres6.setText("Genero:");
        look.add(tres6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 215, -1));

        Dcinco.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Dcinco.setText(" ");
        look.add(Dcinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 200, -1));

        jSeparator8.setForeground(new java.awt.Color(46, 48, 147));
        jSeparator8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        look.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 250, 10));

        tres5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tres5.setText("Celular:");
        look.add(tres5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 215, -1));

        Dsiete.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Dsiete.setText(" ");
        look.add(Dsiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 200, -1));

        Ddos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Ddos.setText(" ");
        look.add(Ddos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, -1));

        panelC.add(look, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 250, 500));

        jPanel4.setBackground(new java.awt.Color(46, 48, 147));

        tres1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tres1.setForeground(new java.awt.Color(255, 255, 255));
        tres1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tres1.setText("Cliente Busqueda");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tres1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tres1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelC.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 250, 40));

        Direccion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Direccion.setMargin(new java.awt.Insets(2, 15, 2, 6));
        Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionActionPerformed(evt);
            }
        });
        panelC.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 270, 35));

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel22.setText("Cliente");
        panelC.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        campoObligatorio1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoObligatorio1.setForeground(new java.awt.Color(255, 0, 0));
        campoObligatorio1.setText("Campo obligatorio (*)");
        panelC.add(campoObligatorio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, -1));

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
                .addComponent(panelC, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PanelRegistrar.add(PanelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

        add(PanelRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void correctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctoActionPerformed
        correcto.setVisible(false);
    }//GEN-LAST:event_correctoActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientesActionPerformed

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productosActionPerformed

    private void cantidadProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadProductosActionPerformed

    private void BusquedaDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaDNIActionPerformed

    private void carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) Tpedidos.getModel();
        boolean camposVacios = false;
        int cantidad= 0;
        String nombreProducto = (String) productos.getSelectedItem();
        
        
        if(nombreProducto == null)
        {
            campoObligatorio3.setVisible(true);
            camposVacios = true;
        } else 
        {
            campoObligatorio3.setVisible(false);
        }
        if (cantidadProductos.getText().isEmpty()) {
            campoObligatorio4.setVisible(true);
            camposVacios = true;
        } else if (!cantidadProductos.getText().matches("\\d+")) {
            campoObligatorioNumero.setVisible(true);
            camposVacios = true;
        } else 
        {
            campoObligatorio4.setVisible(false);
            cantidad = Integer.parseInt(cantidadProductos.getText());
        }
        if(camposVacios)
        {
            return;
        }
        ValidadorColumnas.setVisible(false);
        ContadorFilas++;
        System.out.println(ContadorFilas);
        
        pedidosO sc = new PedidosAcciones();
        
        String dni="";
        try
        {
           Map<String, String> ListaProductos = sc.obtenerIDProductosyNombresProductos();
           for (Map.Entry<String, String> jalador : ListaProductos.entrySet()) {
                    String NombreCliente = jalador.getValue();
                    if(nombreProducto.equals(NombreCliente))
                    {
                        dni =jalador.getKey();
                    }
                }
            productosC producto = sc.obtenerProducto(dni);
            double TotalPagar = cantidad * producto.getPrecio();
            TotalFacturaPagar += TotalPagar; 
            
            TotalPagarFA.setText(String.valueOf(TotalFacturaPagar));
            String codigo = producto.getCodigo();            
            Object[] fila = {ContadorProductoAgregados,producto.getNombre(),producto.getPresentacion(),producto.getCategoria(),producto.getDescripcion(),cantidad,producto.getPrecio(), TotalPagar};
            modelo.addRow(fila);
            productos.setSelectedItem(null);
            pilaC mas = new pilaC(IDClienteE,NuevoIDFactura ,codigo ,producto.getNombre(),producto.getPresentacion(),producto.getCategoria(),producto.getCategoria(),cantidad,producto.getPrecio(),TotalPagar);
            PilaProductos.put(ContadorProductoAgregados,mas);
            
            ContadorProductoAgregados++;
            cantidadProductos.setText("");
            ProductoNoEncontrado.setVisible(false);
        }catch (Exception ex) {        
        }
    }//GEN-LAST:event_carritoActionPerformed

    private void buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteActionPerformed
        String selecionadoCliente = BusquedaDNI.getText();

        PedidosAcciones sc = new PedidosAcciones();
        clientesO dao = new ClientesAcciones();
        clientesC c = new clientesC();
        int n = 0;
        if(!"".equals(selecionadoCliente)){
            ClienteNoEncontrado.setVisible(false);
            
            try {
                Map<String, String> listaClientes = sc.obtenerDNIyNombresClientes();

                for (Map.Entry<String, String> jalador : listaClientes.entrySet()) 
                {
                        String dni = jalador.getKey();
                        String nombre = jalador.getValue();
                        if (selecionadoCliente.equals(dni))
                        {
                            clientes.setSelectedItem(dni + " - " + nombre);
                            n = 1;

                        } 
                }

                if(!"".equals(selecionadoCliente))
                {
                    dao.llamar(selecionadoCliente);


                        Duno.setText((String) c.getDNI());
                        Ddos.setText(c.getNombre());
                        Dtres.setText(c.getApellido());
                        Dcuatro.setText(c.getDireccion());
                        Dcinco.setText(c.getGenero());
                        Dseis.setText(c.getCorreo());
                        Dsiete.setText(c.getCelular());

                        c.setDNI(null);

                        BusquedaDNI.setText("");
                }
               
                if(n == 0)
                    {
                        clientes.setSelectedItem(null);
                        ClienteNoEncontrado.setVisible(true);
                    }
            } catch (Exception ex) {
                Logger.getLogger(EnviarPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else
        {
            System.out.println("esta vacio");
            if(clientes.getSelectedItem() != null){
                String seleccion = (String) clientes.getSelectedItem();
                String[] partes = seleccion.split(" - "); 
                System.out.println(partes[0]);
                try {
                    dao.llamar(partes[0]);
                } catch (Exception ex) {
                    Logger.getLogger(EnviarPedido.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Duno.setText((String) c.getDNI());
                Ddos.setText(c.getNombre());
                Dtres.setText(c.getApellido());
                Dcuatro.setText(c.getDireccion());
                Dcinco.setText(c.getGenero());
                Dseis.setText(c.getCorreo());
                Dsiete.setText(c.getCelular());

                c.setDNI(null);
                BusquedaDNI.setText("");
            }else
            {
               System.out.println("Nada Selecionado"); 
            }
        }
        
    }//GEN-LAST:event_buscarClienteActionPerformed

    private void campoproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoproductoActionPerformed

    private void registrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar4ActionPerformed

        if(!"".equals(String.valueOf(Pago.getText()))){
            PagoTotaldeFactura = Double.parseDouble(Pago.getText());
            double cambio = PagoTotaldeFactura - TotalFacturaPagar;

            if(cambio >= 0)
            {
                Vuelto.setText(String.valueOf(cambio));
                cambioInsuficiente.setVisible(false);
            } else
            {
                cambioInsuficiente.setVisible(true);
            }
            cambio = 0;
        } else 
        {
            campoObligatorio6.setVisible(true);
        }
        
    }//GEN-LAST:event_registrar4ActionPerformed

    private void buscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProductoActionPerformed
        String selecionadoProducto = campoproducto.getText().toUpperCase();
        PedidosAcciones sc = new PedidosAcciones();
        ProductoNoEncontrado.setVisible(false);
        int n = 0;
        try {
            Map<String, String> ListaProductos = sc.obtenerIDProductosyNombresProductos();
            for (Map.Entry<String, String> jalador : ListaProductos.entrySet()) 
            {
                    String IDProducto = jalador.getKey();
                    String NombreProducto = jalador.getValue();
                    if (selecionadoProducto.equals(IDProducto))
                    {
                        productos.setSelectedItem(NombreProducto);
                        n = 1;
                        campoproducto.setText("");
                    } 
            }
            if(n == 0)
            {
                productos.setSelectedItem(null);
                ProductoNoEncontrado.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(EnviarPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarProductoActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed

        boolean camposVacios = false;
        String DireccionEnvio = Direccion.getText();
        if ("".equals(DireccionEnvio)) {
            campoObligatorio1.setVisible(true);
            camposVacios = true;
        }else
        {
            campoObligatorio1.setVisible(false);
        }
        
        String seleccion = (String) clientes.getSelectedItem();
        if (seleccion == null) {
            campoObligatorio.setVisible(true);
            camposVacios = true;
        }else
        {
            campoObligatorio.setVisible(false);
        }

        if(ContadorFilas == 0)
        {
            ValidadorColumnas.setVisible(true);
            camposVacios = true;
        }else 
        {
            ValidadorColumnas.setVisible(false);
        }

        if (camposVacios) {
            return;
        } 
        
        String Hora = HoraActu.getText();
        String[] partes = seleccion.split(" - "); // Divide la cadena en partes usando " - " como separador
        IDClienteE = Integer.parseInt(partes[0]); // El DNI estará en la primera parte
        
        System.out.println(String.valueOf(TotalFacturaPagar));
        FacturaC cabecera = new FacturaC(IDClienteE,Hora,fechaFormateada,TotalFacturaPagar,DireccionEnvio);
        pedidosO dao = new PedidosAcciones();
        try {
            dao.registrarFactura(cabecera);
            dao.registrarProductosVendidos(PilaProductos);
        } catch (Exception ex) {
            
        }
        cantidadProductos.setText("");
        clientes.setSelectedItem(null);
        productos.setSelectedItem(null);
        this.ObtenerNuevoIDFactura();
        DefaultTableModel modelo = (DefaultTableModel) Tpedidos.getModel();
        modelo.setRowCount(0);
        PilaProductos.clear();
        ContadorFilas = 0;
        ContadorProductoAgregados=1;
        TotalFacturaPagar = 0;
        TotalPagarFA.setText("");
        Pago.setText("");
        Vuelto.setText("");
        Direccion.setText("");
        campoObligatorio6.setVisible(false);
        correcto.setVisible(true);
        
        
    }//GEN-LAST:event_registrarActionPerformed

    private void ValidadorColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidadorColumnasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValidadorColumnasActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
    DefaultTableModel modelo = (DefaultTableModel) Tpedidos.getModel();
    int filaSeleccionada = Tpedidos.getSelectedRow();
    fila.setVisible(false);
    if (filaSeleccionada != -1 && filaSeleccionada < modelo.getRowCount()) {
        int FilaSeleccionadaMas = filaSeleccionada + 1;

        Object valorColumnaN = Tpedidos.getValueAt(filaSeleccionada, Tpedidos.getColumn("N°").getModelIndex());
        Object ValorTotalPagar = Tpedidos.getValueAt(filaSeleccionada, Tpedidos.getColumn("Total Pagar").getModelIndex());
        
        int numero = Integer.parseInt(valorColumnaN.toString());
        double total = Double.parseDouble(ValorTotalPagar.toString());
        TotalFacturaPagar -= total;
        TotalPagarFA.setText(String.valueOf(TotalFacturaPagar));     
        pilaC objetoAEliminar = PilaProductos.get(numero);
        modelo.removeRow(filaSeleccionada);
        PilaProductos.remove(numero);
        ContadorFilas--;
    } else {
        fila.setVisible(true);
    }
    
    }//GEN-LAST:event_eliminarActionPerformed

    private void PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PagoActionPerformed

    private void DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BusquedaDNI;
    private javax.swing.JLabel ClienteNoEncontrado;
    private javax.swing.JLabel Dcinco;
    private javax.swing.JLabel Dcuatro;
    private javax.swing.JLabel Ddos;
    private javax.swing.JTextField Direccion;
    private javax.swing.JLabel Dseis;
    private javax.swing.JLabel Dsiete;
    private javax.swing.JLabel Dtres;
    private javax.swing.JLabel Duno;
    private javax.swing.JLabel FechaActu;
    private javax.swing.JLabel HoraActu;
    private javax.swing.JLabel IDBoleta;
    private javax.swing.JTextField Pago;
    private javax.swing.JPanel PanelCategoria;
    private javax.swing.JPanel PanelRegistrar;
    private javax.swing.JLabel ProductoNoEncontrado;
    private javax.swing.JLabel TotalPagarFA;
    public javax.swing.JTable Tpedidos;
    private javax.swing.JButton ValidadorColumnas;
    private javax.swing.JLabel Vuelto;
    private javax.swing.JButton buscarCliente;
    private javax.swing.JButton buscarProducto;
    private javax.swing.JLabel cambioInsuficiente;
    private javax.swing.JLabel campoObligatorio;
    private javax.swing.JLabel campoObligatorio1;
    private javax.swing.JLabel campoObligatorio3;
    private javax.swing.JLabel campoObligatorio4;
    private javax.swing.JLabel campoObligatorio6;
    private javax.swing.JLabel campoObligatorioNumero;
    private javax.swing.JTextField campoproducto;
    private javax.swing.JTextField cantidadProductos;
    private javax.swing.JButton carrito;
    private javax.swing.JComboBox<String> clientes;
    private javax.swing.JButton correcto;
    private javax.swing.JLabel dos;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel fila;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel look;
    private javax.swing.JPanel panelC;
    private javax.swing.JLabel ppp1;
    private javax.swing.JComboBox<String> productos;
    private javax.swing.JButton registrar;
    private javax.swing.JButton registrar4;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel tres1;
    private javax.swing.JLabel tres2;
    private javax.swing.JLabel tres4;
    private javax.swing.JLabel tres5;
    private javax.swing.JLabel tres6;
    private javax.swing.JLabel uno;
    // End of variables declaration//GEN-END:variables


}
