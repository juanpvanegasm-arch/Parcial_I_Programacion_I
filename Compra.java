import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Compra {
    private int codigo;
    private LocalDate fechaRealizacion;
    private MetodoPago metodoPago;
    private List<Producto> productos;


    public Compra(int codigo, LocalDate fechaRealizacion, MetodoPago metodoPago) {
        this.codigo = codigo;
        this.fechaRealizacion = fechaRealizacion;
        this.metodoPago = metodoPago;
        productos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public MetodoPago getMetodopago() {
        return metodoPago;
    }

    public void setMetodopago(MetodoPago metodopago) {
        this.metodoPago = metodopago;
    }

    public List<Producto> getListaProductos() {
        return productos;
    }

    public void setListaProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String toString() {
        return "Código: " + codigo +
                ", Fecha de realización: " + fechaRealizacion +
                ", Valor total: " + calcularValorTotal() +
                ", Método de pago: " + metodoPago;
    }

    // funcion para calcular el valor total de la compra
    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Producto producto : productos) {
            valorTotal += producto.getPrecioUnitario() * producto.getCantidadDisponible();
        }
        return valorTotal;
    }

}