package operaciones;
import clases.*;
import java.util.List;
import java.util.Map;


public interface pedidosO {
    public void registrarFactura(FacturaC factura) throws Exception;
    public void llamar(String Codigo)throws Exception;
    public void eliminar(String Codigo) throws Exception;
    public int ObtenerFactura() throws Exception;
    public void registrarProductosVendidos(Map<Integer, pilaC> mapa);
    public List<String> nombresCliente() throws Exception ;
    public Map<String, String> obtenerDNIyNombresClientes() throws Exception;
    public productosC obtenerProducto(String codigo) throws Exception;
    public Map<String, String> obtenerIDProductosyNombresProductos() throws Exception;
}
