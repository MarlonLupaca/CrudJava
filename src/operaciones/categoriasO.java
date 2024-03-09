package operaciones;
import clases.*;

public interface categoriasO {
    public void registrar(categoriasC categoria) throws Exception;
    public void modificar(categoriasC categoria,String codigo) throws Exception;
    public void llamar(String Codigo)throws Exception;
    public void eliminar(String Codigo) throws Exception;
    public String llamarPorNombre(String Codigo) throws Exception;
    
}
