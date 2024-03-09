package Acciones;
import InterfacesOperacionesPedidos.InfoFactura;
import base.conexion;
import clases.FacturaC;
import clases.InfoFacturaC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import operaciones.buscadorO;

/**
 *
 * @author Marlon Diego Lupaca
 */
public class BuscadorAcciones extends conexion implements buscadorO{

    @Override
public List<FacturaC> llamar(String Codigo) throws Exception {
    List<FacturaC> listaFacturas = new ArrayList<>();

    try {
        this.conectar();

        String sql = "SELECT \n" +
        "    Factura.IDFactura,\n" +
        "    Factura.IDCliente,\n" +
        "    clientes.Nombre,\n" +
        "    Factura.Hora,\n" +
        "    Factura.Fecha,\n" +
        "    Factura.Direccion,\n" +
        "    Factura.TotalFactura\n" +
        "FROM Factura\n" +
        "LEFT JOIN clientes ON Factura.IDCliente = clientes.IDCliente\n" +
        "WHERE Factura.IDCliente = ?;";

        PreparedStatement pstmt = this.conectar.prepareStatement(sql);
        pstmt.setString(1, Codigo);

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            int IDFactura = rs.getInt(1);
            int IDCliente = rs.getInt(2);
            String NombreCliente = rs.getString(3);
            String Hora = rs.getString(4);
            String Fecha = rs.getString(5);
            String Direccion = rs.getString(6);
            Double TotalFactura = rs.getDouble(7);
            

            FacturaC factura = new FacturaC(IDFactura, IDCliente, Hora, Fecha, TotalFactura, Direccion, NombreCliente);
            listaFacturas.add(factura);
        }

        rs.close();
        pstmt.close();

    } catch (SQLException e) {
        // Manejar la excepción de manera adecuada, puedes imprimir un mensaje o lanzarla de nuevo
        throw new Exception("Error al ejecutar la consulta SQL: " + e.getMessage(), e);
    } finally {
        // Asegurarse de cerrar la conexión en el bloque finally para evitar posibles fugas de recursos
        if (this.conectar != null && !this.conectar.isClosed()) {
            this.conectar.close();
        }
    }

    return listaFacturas;
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
    public Map<String, String> obtenerDNIyApellidoClientes() throws Exception {
        Map<String, String> dniApellidos = new HashMap<>();
        try {
            this.conectar();
            String sql = "SELECT IDCliente, Apellido FROM clientes";
            PreparedStatement st = this.conectar.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String dni = rs.getString("IDCliente");
                String apellido = rs.getString("Apellido");
                dniApellidos.put(dni, apellido);
            }

            rs.close();
            st.close();
            this.conectar.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dniApellidos;
    }

    @Override
    public List<FacturaC> llamarPorProductos(String Codigo) throws Exception {
        List<FacturaC> listaFacturas = new ArrayList<>();

        try {
            this.conectar();

            String sql = "SELECT \n" +
                "    Factura.IDFactura, \n" +
                "    Factura.IDCliente, \n" +
                "    clientes.Nombre, \n" +
                "    Factura.Hora, \n" +
                "    Factura.Fecha, \n" +
                "    Factura.Direccion, \n" +
                "    Factura.TotalFactura \n" +
                "FROM Factura \n" +
                "LEFT JOIN ProductosVendidos ON Factura.IDFactura = ProductosVendidos.IDFactura\n" +
                "LEFT JOIN clientes ON Factura.IDCliente = clientes.IDCliente\n" +
                "LEFT JOIN productos ON ProductosVendidos.IDProducto = productos.IDProducto\n" +
                "LEFT JOIN categorias ON productos.IDCategoria = categorias.IDCategoria \n" +
                "WHERE productos.IDCategoria = "+"'"+Codigo+"'";

            PreparedStatement pstmt = this.conectar.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int IDFactura = rs.getInt(1);
                int IDCliente = rs.getInt(2);
                String NombreCliente = rs.getString(3);
                String Hora = rs.getString(4);
                String Fecha = rs.getString(5);
                String Direccion = rs.getString(6);
                Double TotalFactura = rs.getDouble(7);


                FacturaC factura = new FacturaC(IDFactura, IDCliente, Hora, Fecha, TotalFactura, Direccion, NombreCliente);
                listaFacturas.add(factura);
            }

            rs.close();
            pstmt.close();

        } catch (SQLException e) {
            // Manejar la excepción de manera adecuada, puedes imprimir un mensaje o lanzarla de nuevo
            throw new Exception("Error al ejecutar la consulta SQL: " + e.getMessage(), e);
        } finally {
            // Asegurarse de cerrar la conexión en el bloque finally para evitar posibles fugas de recursos
            if (this.conectar != null && !this.conectar.isClosed()) {
                this.conectar.close();
            }
        }

        return listaFacturas;
        }

    @Override
    public List<FacturaC> llamarPorFecha(String Inicio,String Fin) throws Exception {
        List<FacturaC> listaFacturas = new ArrayList<>();

        try {
            this.conectar();

            String sql = "SELECT \n" +
                "    Factura.IDFactura, \n" +
                "    Factura.IDCliente, \n" +
                "    clientes.Nombre, \n" +
                "    Factura.Hora, \n" +
                "    Factura.Fecha, \n" +
                "    Factura.Direccion, \n" +
                "    Factura.TotalFactura \n" +
                "FROM Factura \n" +
                "LEFT JOIN clientes ON Factura.IDCliente = clientes.IDCliente\n" +
                "WHERE fecha BETWEEN" + "'" +Inicio+ "'" +" AND "+ "'"+Fin+"'";

            PreparedStatement pstmt = this.conectar.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int IDFactura = rs.getInt(1);
                int IDCliente = rs.getInt(2);
                String NombreCliente = rs.getString(3);
                String Hora = rs.getString(4);
                String Fecha = rs.getString(5);
                String Direccion = rs.getString(6);
                Double TotalFactura = rs.getDouble(7);
                

                FacturaC factura = new FacturaC(IDFactura, IDCliente, Hora, Fecha, TotalFactura, Direccion, NombreCliente);
                listaFacturas.add(factura);
            }

            rs.close();
            pstmt.close();

        } catch (SQLException e) {
            // Manejar la excepción de manera adecuada, puedes imprimir un mensaje o lanzarla de nuevo
            throw new Exception("Error al ejecutar la consulta SQL: " + e.getMessage(), e);
        } finally {
            // Asegurarse de cerrar la conexión en el bloque finally para evitar posibles fugas de recursos
            if (this.conectar != null && !this.conectar.isClosed()) {
                this.conectar.close();
            }
        }

        return listaFacturas;        
    }

    @Override
    public List<InfoFacturaC> llamarInfoFactura(String Codigo) throws Exception {
        List<InfoFacturaC> listaInfoFacturas = new ArrayList<>();

        try {
            this.conectar();

            String sql = "SELECT \n" +
            "    Factura.IDFactura,\n" +
            "    Factura.Hora,\n" +
            "    Factura.Fecha,\n" +
            "    Factura.Direccion,\n" +
            "    Factura.TotalFactura,    \n" +
            "    Factura.IDCliente,\n" +
            "    clientes.Nombre,\n" +
            "    clientes.Apellido,\n" +
            "    clientes.Direccion AS DireccionDelCliente,\n" +
            "    clientes.Genero,\n" +
            "    clientes.Correo,\n" +
            "    clientes.Celular,\n" +
            "    productos.NombreProducto,\n" +
            "    productos.IDCategoria,\n" +
            "    productos.Precio,\n" +
            "    ProductosVendidos.Cantidad,\n" +
            "    ProductosVendidos.TotalPagar\n" +
            "FROM Factura\n" +
            "LEFT JOIN ProductosVendidos ON Factura.IDFactura = ProductosVendidos.IDFactura\n" +
            "LEFT JOIN clientes ON Factura.IDCliente = clientes.IDCliente\n" +
            "LEFT JOIN productos ON ProductosVendidos.IDProducto = productos.IDProducto\n" +
            "LEFT JOIN categorias ON productos.IDCategoria = categorias.IDCategoria\n" +
            "WHERE Factura.IDFactura = " + "'"+ Codigo+ "'";

            PreparedStatement pstmt = this.conectar.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String IDFactura = rs.getString(1);
                String Hora = rs.getString(2);
                String Fecha = rs.getString(3);
                String Direccion = rs.getString(4);
                String TotalFactura = rs.getString(5);
                String IDCliente = rs.getString(6);
                String Nombre = rs.getString(7);
                String Apellido = rs.getString(8);
                String DireccionCliente = rs.getString(9);
                String Genero = rs.getString(10);
                String Correo = rs.getString(11);
                String Celular = rs.getString(12);
                String NombreProducto = rs.getString(13);
                String IDCategoria = rs.getString(14);
                String Precio = rs.getString(15);
                String Cantidad = rs.getString(16);
                String TotalPagar = rs.getString(17);
                
                

                InfoFacturaC factura = new InfoFacturaC(IDFactura,Hora,Fecha,Direccion,TotalFactura,IDCliente,Nombre,Apellido,DireccionCliente,Genero,Correo,Celular,NombreProducto,IDCategoria,Precio,Cantidad,TotalPagar);
                listaInfoFacturas.add(factura);
            }

            rs.close();
            pstmt.close();

        } catch (SQLException e) {
            // Manejar la excepción de manera adecuada, puedes imprimir un mensaje o lanzarla de nuevo
            throw new Exception("Error al ejecutar la consulta SQL: " + e.getMessage(), e);
        } finally {
            // Asegurarse de cerrar la conexión en el bloque finally para evitar posibles fugas de recursos
            if (this.conectar != null && !this.conectar.isClosed()) {
                this.conectar.close();
            }
        }

        return listaInfoFacturas;
    }
}
