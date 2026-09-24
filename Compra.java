package EvaluacionProgramacion1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra {

    private int codigo;

    private LocalDate fecha;

    MetodoPago metodoPago;

    List<Producto> productos;


    public Compra (int codigo, LocalDate fecha, MetodoPago metodoPago) {

        this.codigo = codigo;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
        this.productos = new ArrayList<>();

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }


    // funcion para calcular el valor total de la compra

    public double calcularValorTotal (){

        double valorTotal = 0;

        for (Producto producto : productos) {

            valorTotal += producto.getPrecioUnitario() * producto.getCantidad();

        }
        return valorTotal;
    }

    @Override

    public String toString(){

        return "Codigo de compra: " + codigo + "Fecha de compra: " + fecha  + "Metodo de pago: " +  metodoPago + "\nLista clientes: " + "productos: " + productos;
    }
}
