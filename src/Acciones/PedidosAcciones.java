
package Acciones;

import base.conexion;
import clases.FacturaC;
import clases.pedidosC;
import clases.pilaC;
import clases.productosC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import operaciones.pedidosO;


public class PedidosAcciones extends conexion implements pedidosO {

    @Override
    public void llamar(String Codigo) throws Exception {
        try {
            this.conectar();
            String sql = "SELECT NumeroPedido, FechaPedido, HoraPedido, IDCliente, IDProducto FROM Pedido WHERE codigo =  "+"'"+Codigo+"'";

            
            PreparedStatement pstmt = this.conectar.prepareStatement(sql);

    
            ResultSet rs = pstmt.executeQuery();

            
            if (rs.next()) {
                pedidosC s = new pedidosC();   
               
                
            }       
                rs.close();
                pstmt.close();
                
        } catch (SQLException e) {
         
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(String Codigo) throws SQLException {
        try {
            this.conectar();
            System.out.println(Codigo);

            String queryProductos = "DELETE FROM ProductosVendidos WHERE ProductosVendidos.IDFactura = ?";
            try (PreparedStatement stProductos = this.conectar.prepareStatement(queryProductos)) {
                stProductos.setString(1, Codigo);
                stProductos.executeUpdate();
            }

            String queryFactura = "DELETE FROM Factura WHERE Factura.IDFactura = ?";
            try (PreparedStatement stFactura = this.conectar.prepareStatement(queryFactura)) {
                stFactura.setString(1, Codigo);
                stFactura.executeUpdate();
            }

        } catch (SQLException e) {

            throw e;

        } finally {
            if (this.conectar != null && !this.conectar.isClosed()) {
                this.conectar.close();
            }
        }
    }


    @Override
    public void registrarFactura(FacturaC factura) throws Exception { 
        try
        {
            this.conectar();
            PreparedStatement st = this.conectar.prepareStatement( "INSERT INTO Factura (IDCliente,Hora,FECHA,TotalFactura,Direccion) VALUES (?,?,?,?,?)");
            st.setInt(1,factura.getIDCliente());
            st.setString(2,factura.getHora());
            st.setString(3,factura.getFecha());
            st.setDouble(4,factura.getPagoTotaldeFactura());
            st.setString(5,factura.getDirreccion());
            st.executeUpdate();
        }catch(SQLException e)
        {
            throw e;
        }
    }

    @Override
    public List<String> nombresCliente() throws Exception {
        List<String> clientes = new ArrayList<>();
        try {
            this.conectar();
            String sql = "SELECT Nombre FROM clientes";
            PreparedStatement st = this.conectar.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String nombreCompleto = rs.getString("Nombre");
                clientes.add(nombreCompleto);
            }
            rs.close();
            st.close();
            this.conectar.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    

    @Override
    public Map<String, String> obtenerDNIyNombresClientes() throws Exception {
        Map<String, String> dniNombres = new HashMap<>();
        try {
            this.conectar();
            String sql = "SELECT IDCliente, Nombre FROM clientes";
            PreparedStatement st = this.conectar.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String dni = rs.getString("IDCliente");
                String nombre = rs.getString("Nombre");
                dniNombres.put(dni, nombre);
            }

            rs.close();
            st.close();
            this.conectar.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dniNombres;
    }

    @Override
    public Map<String, String> obtenerIDProductosyNombresProductos() throws Exception {
        Map<String, String> ListaProductos = new HashMap<>();
        try {
            this.conectar();
            String sql = "SELECT IDProducto, NombreProducto FROM productos";
            PreparedStatement st = this.conectar.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String IDProducto = rs.getString("IDProducto");
                String NombreProducto = rs.getString("NombreProducto");
                ListaProductos.put(IDProducto, NombreProducto);
            }

            rs.close();
            st.close();
            this.conectar.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ListaProductos;
   }

    @Override
    public productosC obtenerProducto(String codigo) throws Exception {
    productosC producto = null;
    try {
        this.conectar();
        String sql = "SELECT IDProducto, NombreProducto, Precio, Presentacion, IDCategoria, Descripcion FROM productos WHERE IDProducto = ?";
        PreparedStatement st = this.conectar.prepareStatement(sql);
        st.setString(1, codigo);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            String IDProducto = rs.getString("IDProducto");
            String NombreProducto = rs.getString("NombreProducto");
            int Precio = rs.getInt("Precio");
            String Presentacion = rs.getString("Presentacion");
            String Categoria = rs.getString("IDCategoria");
            String Descripcion = rs.getString("Descripcion");
            producto = new productosC(IDProducto, NombreProducto, Precio, Presentacion, Categoria, Descripcion);
        }

        rs.close();
        st.close();
        this.conectar.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return producto;
}

    @Override
    public void registrarProductosVendidos(Map<Integer, pilaC> PilaProductos) {
        
        try {
            this.conectar();

            // Consulta SQL para insertar datos en la base de datos
            String sql = "INSERT INTO ProductosVendidos (IDFactura,IDProducto, cantidad,TotalPagar, PrecioUnitario) VALUES (?,?,?,?,?)";
            PreparedStatement st;
            st = this.conectar.prepareStatement(sql);

            for (pilaC pila : PilaProductos.values()) {
                st.setInt(1, pila.getIDF());
                st.setString(2, pila.getCodigo());
                st.setInt(3, pila.getCantidad());
                st.setDouble(4, pila.getTotalpagar());
                st.setDouble(5, pila.getPrecio());

                // Ejecutar la consulta para insertar los datos
                st.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidosAcciones.class.getName()).log(Level.SEVERE, null, ex);
        }


        

    }

    @Override
    public int ObtenerFactura() throws Exception {
        int UltimoIDFactura = 0;
        try {
            this.conectar();

            // Consulta SQL para obtener el último valor de la secuencia de la tabla 'Factura'
            String sql = "SELECT seq FROM sqlite_sequence WHERE name = 'Factura'";
            PreparedStatement st = this.conectar.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            // Verifica si hay resultados y obtén el valor de la secuencia
            if (rs.next()) {
                UltimoIDFactura = rs.getInt("seq");
            }

            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(PedidosAcciones.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.conectar.close();
        }
        return UltimoIDFactura;
    }


    
}
