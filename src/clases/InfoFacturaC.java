package clases;

/**
 *
 * @author Marlon Diego Lupaca
 * @param <String>
 */
public class InfoFacturaC<String> {
    private String IDFactura;
    private String Hora;
    private String Fecha;
    private String Direccion;
    private String TotalFactura;
    private String IDCliente;
    private String Nombre;
    private String Apellido;
    private String DireccionDelCliente;
    private String Genero;
    private String Correo;
    private String Celular;
    private String NombreProducto;
    private String IDCategoria;
    private String Precio;
    private String Cantidad;
    private String TotalPagar;

    public InfoFacturaC(String IDFactura, String Hora, String Fecha, String Direccion, String TotalFactura, String IDCliente, String Nombre, String Apellido, String DireccionDelCliente, String Genero, String Correo, String Celular, String NombreProducto, String IDCategoria, String Precio, String Cantidad, String TotalPagar) {
        this.IDFactura = IDFactura;
        this.Hora = Hora;
        this.Fecha = Fecha;
        this.Direccion = Direccion;
        this.TotalFactura = TotalFactura;
        this.IDCliente = IDCliente;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DireccionDelCliente = DireccionDelCliente;
        this.Genero = Genero;
        this.Correo = Correo;
        this.Celular = Celular;
        this.NombreProducto = NombreProducto;
        this.IDCategoria = IDCategoria;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
        this.TotalPagar = TotalPagar;
    }

    public InfoFacturaC() {
    }

    public String getIDFactura() {
        return IDFactura;
    }

    public void setIDFactura(String IDFactura) {
        this.IDFactura = IDFactura;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTotalFactura() {
        return TotalFactura;
    }

    public void setTotalFactura(String TotalFactura) {
        this.TotalFactura = TotalFactura;
    }

    public String getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(String IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccionDelCliente() {
        return DireccionDelCliente;
    }

    public void setDireccionDelCliente(String DireccionDelCliente) {
        this.DireccionDelCliente = DireccionDelCliente;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getIDCategoria() {
        return IDCategoria;
    }

    public void setIDCategoria(String IDCategoria) {
        this.IDCategoria = IDCategoria;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getTotalPagar() {
        return TotalPagar;
    }

    public void setTotalPagar(String TotalPagar) {
        this.TotalPagar = TotalPagar;
    }
}
