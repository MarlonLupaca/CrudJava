package operaciones;

import clases.adminC;
import java.util.Map;

public interface loginO {
    public Map<String, String> obtenerAdmins() throws Exception;
    public void registrar(adminC admin) throws Exception;
}
