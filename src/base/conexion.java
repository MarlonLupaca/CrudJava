package base;

import java.sql.*;

public class conexion {
    
    public Connection conectar;
    public Connection conectar() {
        try {
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:dbpasteleria.db");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }    
}
