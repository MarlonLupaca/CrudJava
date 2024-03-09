package Acciones;

import base.conexion;
import clases.productosC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import operaciones.productosO;


public class ProductosAcciones extends conexion implements productosO {

    @Override
    public void registrar(productosC productos) throws Exception {
        try
        {
            this.conectar();
            PreparedStatement st = this.conectar.prepareStatement("INSERT INTO productos (IDProducto, IDCategoria,NombreProducto, Precio, Presentacion,  Descripcion) VALUES (?, ?, ?, ?, ?, ?)");
            st.setString(1, productos.getCodigo());
            st.setString(2, productos.getCategoria());
            st.setString(3, productos.getNombre());
            st.setDouble(4, productos.getPrecio());
            st.setString(5, productos.getPresentacion());
            st.setString(6, productos.getDescripcion());
            st.executeUpdate();
        }catch(SQLException e)
        {
            throw e;
        }
    }

    @Override
    public void modificar(productosC productos, String codigo) throws Exception {
        try
        {
            this.conectar();
            
            PreparedStatement st = this.conectar.prepareStatement( "UPDATE productos SET IDProducto = ?,IDCategoria = ?, NombreProducto = ?, Precio = ?, Presentacion = ?,  Descripcion = ? WHERE IDProducto = "+"'"+codigo+"'");
            st.setString(1, productos.getCodigo());
            st.setString(2, productos.getCategoria());
            st.setString(3, productos.getNombre());
            st.setDouble(4, productos.getPrecio());
            st.setString(5, productos.getPresentacion());
            st.setString(6, productos.getDescripcion());
            
            st.executeUpdate();
            st.close();
            
        }catch(SQLException e)
        {
            throw e;
        }
    }

    @Override
    public productosC llamar(String Codigo) throws Exception {
        productosC c = null;
        try {
            
            this.conectar();
            String sql = "SELECT IDProducto, IDCategoria, NombreProducto, Precio, Presentacion, Descripcion FROM productos WHERE IDProducto =  "+"'"+Codigo+"'";

            
            PreparedStatement pstmt = this.conectar.prepareStatement(sql);
            System.out.println(Codigo);
    
            ResultSet rs = pstmt.executeQuery();

            
        
                  
            String IDProducto = rs.getString(1);
            String IDCategoria= rs.getString(2);
            String NombreProducto = rs.getString(3);
            double Precio = rs.getInt(4); 
            String Presentacion = rs.getString(5);
            String Descripcion = rs.getString(6);
            c = new productosC(IDProducto, NombreProducto, Precio, Presentacion, IDCategoria, Descripcion);
            
            rs.close();
            pstmt.close();
                
                
        } catch (SQLException e) {
         
            e.printStackTrace();
        }
        
        return c;
        
    }

    @Override
    public void eliminar(String Codigo) throws Exception {
        try
        {
            this.conectar();
            
            PreparedStatement st = this.conectar.prepareStatement( "DELETE FROM productos WHERE IDProducto = " +"'"+ Codigo+"'");
            st.executeUpdate();
            st.close();
            
        }catch(SQLException e)
        {
            throw e;
        }
    }

    
    @Override
    public List<String> obtenerNombres() throws Exception {
    List<String> nom = new ArrayList<>();
    try {
        this.conectar();
        String sql = "SELECT nombre FROM categorias";
        PreparedStatement st = this.conectar.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        
        while (rs.next()) {
            String nombre = rs.getString(1);
            
            nom.add(nombre);
        }

        rs.close();
        st.close();
        this.conectar.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return nom;
    }

    @Override
    public List<String> obtenerNombresDeProductos() throws Exception {
        List<String> nom = new ArrayList<>();
        try {
            this.conectar();
            String sql = "SELECT NombreProducto FROM productos";
            PreparedStatement st = this.conectar.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString(1);

                nom.add(nombre);
            }

            rs.close();
            st.close();
            this.conectar.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nom;
        }

    @Override
    public String llamarPorNombreProductos(String Codigo) throws Exception {
        String IDCategoria="";
        try {
            this.conectar();
            String sql = "SELECT productos.IDProducto FROM productos Where productos.NombreProducto= "+ "'"+Codigo+"'";
            PreparedStatement pstmt = this.conectar.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();  
            IDCategoria = rs.getString(1);   
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
        }
        return IDCategoria;
    }
}