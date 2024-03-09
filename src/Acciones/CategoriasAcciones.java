
package Acciones;

import operaciones.categoriasO;
import base.conexion;
import clases.categoriasC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriasAcciones extends conexion implements categoriasO{
    static int validacion;

    public static int getValidacion() {
        return validacion;
    }

    public static void setValidacion(int validacion) {
        CategoriasAcciones.validacion = validacion;
    }
    
    
    @Override
    public void registrar(categoriasC categoria) throws Exception {
        
        try
        {
            this.conectar();
            //consultar la base de datos 
            PreparedStatement st = this.conectar.prepareStatement("INSERT INTO categorias(IDCategoria,Nombre,Descripcion)VALUES(?,?,?);");
            st.setString(1,categoria.getCodigo());
            st.setString(2,categoria.getNombre());
            st.setString(3,categoria.getDescripcion());
            st.executeUpdate();
        }catch(SQLException e)
        {
            throw e;
        }
    }
    

    @Override
    public void modificar(categoriasC categoria,String codigo) throws Exception {
        try
        {
            this.conectar();
            
            PreparedStatement st = this.conectar.prepareStatement( "UPDATE categorias SET IDCategoria = ?, nombre = ?, descripcion = ? WHERE IDCategoria = "+"'"+codigo+"'");
            st.setString(1,categoria.getCodigo());
            st.setString(2,categoria.getNombre());
            st.setString(3,categoria.getDescripcion());
            st.executeUpdate();
            st.close();
            
        }catch(SQLException e)
        {
            throw e;
        }
    }

    @Override
    public void eliminar(String Codigo) throws Exception {
        try
        {
            this.conectar();
            
            PreparedStatement st = this.conectar.prepareStatement( "DELETE FROM categorias WHERE IDCategoria = " +"'"+ Codigo+"'");
            int filasAfectadas = st.executeUpdate();
            st.close();

            if (filasAfectadas == 0) {
                this.setValidacion(2);
                               
            } else {
                this.setValidacion(1);
            }
            
            
        }catch(SQLException e)
        {
            throw e;
        }
        
    }

    @Override
    public void llamar(String codigo) throws Exception {
        try {
            this.conectar();
            
            String sql = "SELECT IDCategoria, nombre, descripcion FROM categorias WHERE IDCategoria = "+"'"+codigo+"'";

            
            PreparedStatement pstmt = this.conectar.prepareStatement(sql);

    
            ResultSet rs = pstmt.executeQuery();

            
            if (rs.next()) {
                categoriasC s = new categoriasC();   
                String valor1 = rs.getString(1);
                String valor2= rs.getString(2);
                String valor3 = rs.getString(3);
                s.setCodigo(valor1);
                s.setNombre(valor2);
                s.setDescripcion(valor3);
            }

                
                rs.close();
                pstmt.close();
                
        } catch (SQLException e) {
         
            e.printStackTrace();
        }
        
    }

    @Override
    public String llamarPorNombre(String Codigo) throws Exception {
        String IDCategoria="";
        try {
            this.conectar();
            String sql = "SELECT categorias.IDCategoria FROM categorias Where categorias.Nombre= "+ "'"+Codigo+"'";
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
