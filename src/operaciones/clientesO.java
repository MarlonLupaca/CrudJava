package operaciones;
import clases.*;
import java.util.List;

public interface clientesO {
    public void registrar(clientesC clientes) throws Exception;
    public void modificar(clientesC clientes,String codigo) throws Exception;
    public void llamar(String Codigo)throws Exception;
    public void eliminar(String Codigo) throws Exception;
    public List<String> obtenerNombresDeClientes() throws Exception;
}
