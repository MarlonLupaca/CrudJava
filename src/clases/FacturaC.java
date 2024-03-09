 package clases;
/**
 * @author Marlon Diego Lupaca
 */
public class FacturaC {
    private int IDFactura;
    private int IDCliente;
    private String Hora;
    private String Fecha;
    private double PagoTotaldeFactura;
    private String Dirreccion;
    private String NombreCliente;

    public FacturaC(int IDFactura, int IDCliente, String Hora, String Fecha, double PagoTotaldeFactura, String Dirreccion, String NombreCliente) {
        this.IDFactura = IDFactura;
        this.IDCliente = IDCliente;
        this.Hora = Hora;
        this.Fecha = Fecha;
        this.PagoTotaldeFactura = PagoTotaldeFactura;
        this.Dirreccion = Dirreccion;
        this.NombreCliente = NombreCliente;
    }



    
    
    public FacturaC(int IDCliente, String Hora, String Fecha, double PagoTotaldeFactura, String Dirreccion) {
        this.IDCliente = IDCliente;
        this.Hora = Hora;
        this.Fecha = Fecha;
        this.PagoTotaldeFactura = PagoTotaldeFactura;
        this.Dirreccion = Dirreccion;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }
    

    public String getDirreccion() {
        return Dirreccion;
    }

    public void setDirreccion(String Dirreccion) {
        this.Dirreccion = Dirreccion;
    }

    public int getIDFactura() {
        return IDFactura;
    }

    public void setIDFactura(int IDFactura) {
        this.IDFactura = IDFactura;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
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

    public double getPagoTotaldeFactura() {
        return PagoTotaldeFactura;
    }

    public void setPagoTotaldeFactura(double PagoTotaldeFactura) {
        this.PagoTotaldeFactura = PagoTotaldeFactura;
    }

    
}
