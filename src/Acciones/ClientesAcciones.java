
package Acciones;

import static Acciones.CategoriasAcciones.setValidacion;
import base.conexion;
import clases.clientesC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import operaciones.clientesO;

public class ClientesAcciones extends conexion implements clientesO {
    static int validacion;

    public static int getValidacion() {
        return validacion;
    }

    public static void setValidacion(int validacion) {
        ClientesAcciones.validacion = validacion;
    }
    
    @Override
    public void registrar(clientesC clientes) throws Exception {
        try
        {
            this.conectar();
            PreparedStatement st = this.conectar.prepareStatement("INSERT INTO clientes (IDCliente, Nombre, Apellido, Direccion, Genero, Correo, Celular) VALUES (?, ?, ?, ?, ?, ?, ?)");
            st.setString(1, (String) clientes.getDNI());
            st.setString(2, clientes.getNombre());
            st.setString(3, clientes.getApellido());
            st.setString(4, clientes.getDireccion());
            st.setString(5, clientes.getGenero());
            st.setString(6, clientes.getCorreo());
            st.setString(7, clientes.getCelular());
            st.executeUpdate();
        }catch(SQLException e)
        {
            throw e;
        }
    }

    @Override
    public void modificar(clientesC clientes,String codigo) throws Exception {
        try
        {
            this.conectar();
            
            PreparedStatement st = this.conectar.prepareStatement( "UPDATE clientes SET IDCliente = ?, Nombre = ?, Apellido = ?, Direccion = ?, Genero = ?, Correo = ?, Celular = ? WHERE IDCliente = "+"'"+codigo+"'");
            st.setString(1, (String) clientes.getDNI());
            st.setString(2, clientes.getNombre());
            st.setString(3, clientes.getApellido());
            st.setString(4, clientes.getDireccion());
            st.setString(5, clientes.getGenero());
            st.setString(6, clientes.getCorreo());
            st.setString(7, clientes.getCelular());

            st.executeUpdate();
            st.close();
            
        }catch(SQLException e)
        {
            throw e;
        }
    } 

    @Override
    public void llamar(String Codigo) throws Exception {
        try {
            this.conectar();
            String sql = "SELECT IDCliente, Nombre, Apellido, Direccion, Genero, Correo, Celular FROM clientes WHERE IDCliente =  "+"'"+Codigo+"'";

            
            PreparedStatement pstmt = this.conectar.prepareStatement(sql);

    
            ResultSet rs = pstmt.executeQuery();

            
            if (rs.next()) {
                clientesC s = new clientesC();   
                String valor1 = rs.getString(1);
                String valor2= rs.getString(2);
                String valor3 = rs.getString(3);
                String valor4 = rs.getString(4);
                String valor5 = rs.getString(5);
                String valor6 = rs.getString(6);
                String valor7 = rs.getString(7);
                
                s.setDNI(valor1);
                s.setNombre(valor2);
                s.setApellido(valor3);
                s.setDireccion(valor4);
                s.setGenero(valor5);
                s.setCorreo(valor6);
                s.setCelular(valor7);

            }

                
                rs.close();
                pstmt.close();
                
        } catch (SQLException e) {
         
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(String Codigo) throws Exception {
        try
        {
            this.conectar();
            
            PreparedStatement st = this.conectar.prepareStatement( "DELETE FROM clientes WHERE IDCliente = " +"'"+ Codigo+"'");
            int filasAfectadas = st.executeUpdate();
            st.close();
            if (filasAfectadas == 0) {
                setValidacion(2);
                               
            } else {
                setValidacion(1);
            }
            
        }catch(SQLException e)
        {
            throw e;
        }
    }

    @Override
    public List<String> obtenerNombresDeClientes() throws Exception {
    List<String> nom = new ArrayList<>();
    try {
        this.conectar();
        String sql = "SELECT IDCliente FROM clientes";
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
}
