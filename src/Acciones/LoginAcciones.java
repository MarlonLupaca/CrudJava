package Acciones;

import base.conexion;
import clases.adminC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import operaciones.loginO;

/**
 *
 * @author Marlon Diego Lupaca
 */
public class LoginAcciones extends conexion implements loginO {

    @Override
    public Map<String, String> obtenerAdmins() throws Exception {
        Map<String, String> ListaAdmin = new HashMap<>();
        try {
            this.conectar();
            String sql = "SELECT Correo, Contra FROM Admin";
            PreparedStatement st = this.conectar.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String Correo = rs.getString("Correo");
                String Contra = rs.getString("Contra");
                ListaAdmin.put(Correo, Contra);
            }

            rs.close();
            st.close();
            this.conectar.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ListaAdmin;
    }

    @Override
    public void registrar(adminC admin) throws Exception {
        try
        {
            this.conectar();
            PreparedStatement st = this.conectar.prepareStatement("INSERT INTO Admin (Correo,Contra)VALUES(?,?)");
            st.setString(1, admin.getNombre());
            st.setString(2, admin.getContraseña());
            st.executeUpdate();
        }catch(SQLException e)
        {
            throw e;
        }
    }
    
}
