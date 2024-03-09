package operaciones;
import clases.*;
import java.util.List;

public interface productosO {
    public void registrar(productosC productos) throws Exception;
    public void modificar(productosC productos,String codigo) throws Exception;
    public productosC llamar(String Codigo)throws Exception;
    public void eliminar(String Codigo) throws Exception;
    
    public List<String> obtenerNombres() throws Exception ;
    public List<String> obtenerNombresDeProductos() throws Exception ;
    public String llamarPorNombreProductos(String Codigo) throws Exception;
   
}
