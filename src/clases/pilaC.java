package clases;

/**
 * @author Marlon Diego Lupaca
 */
public class pilaC {
    private int IDCliente;
    private int IDF;
    private String codigo;
    private String nombre;
    private String presentacion;
    private String categoria;
    private String descripcion;
    private int cantidad;
    private double precio;
    private double totalpagar;

    public pilaC(int IDCliente, int IDF, String codigo, String nombre, String presentacion, String categoria, String descripcion, int cantidad, double precio, double totalpagar) {
        this.IDCliente = IDCliente;
        this.IDF = IDF;
        this.codigo = codigo;
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.totalpagar = totalpagar;
    }

    

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public int getIDF() {
        return IDF;
    }

    public void setIDF(int IDF) {
        this.IDF = IDF;
    }
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotalpagar() {
        return totalpagar;
    }

    public void setTotalpagar(double totalpagar) {
        this.totalpagar = totalpagar;
    }
    
    
    
    
   
}
