package EvaluacionProgramacion1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra {

    private int codigo;

    private LocalDate fecha;

    private double valorTotal;

    MetodoPago metodoPago;

    List<Productos> productos;

    List<Cliente> clientes;

    public Compra (int codigo, LocalDate fecha, double valorTotal, MetodoPago metodoPago, ArrayList<Productos> productos, ArrayList<Cliente> clientes) {

        this.codigo = codigo;
        this.fecha = fecha;
        this.valorTotal = valorTotal;
        this.metodoPago = metodoPago;
        this.productos = productos;
        this.clientes = clientes;
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

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override

    public String toString(){

        return "Codigo de compra: " + codigo + "Fecha de compra: " + fecha + "Valor total: " + valorTotal + "Metodo de pago: " +  metodoPago + "\nLista clientes: " + clientes + "\nLista productos " + productos;
    }
}
