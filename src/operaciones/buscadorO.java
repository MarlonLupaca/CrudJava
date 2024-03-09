
package operaciones;

import clases.FacturaC;
import clases.InfoFacturaC;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Marlon Diego Lupaca
 */
public interface buscadorO {
    public List<FacturaC> llamar(String Codigo) throws Exception;
    public List<FacturaC> llamarPorProductos(String Codigo) throws Exception;
    public List<InfoFacturaC> llamarInfoFactura(String Codigo) throws Exception;
    public List<FacturaC> llamarPorFecha(String Inicio,String Fin) throws Exception;
    public Map<String, String> obtenerDNIyNombresClientes() throws Exception;
    public Map<String, String> obtenerDNIyApellidoClientes() throws Exception;
}
