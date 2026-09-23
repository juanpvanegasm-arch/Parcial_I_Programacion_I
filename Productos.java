package EvaluacionProgramacion1;
import java.util.ArrayList;
import java.util.List;

public class Productos {

    private String nombre;

    private int codigoDeProducto;

    private double precioUnitario;

    private int cantidad;

    CategoriaProductos categoria;

    List<Compra> compras;

    List<Cliente> clientes;



    public Productos (String nombre, int codigoDeProducto, double precioUnitario, int cantidad, CategoriaProductos categoria, ArrayList<Compra> compras, ArrayList<Cliente> clientes) {

        this.nombre = nombre;
        this.codigoDeProducto = codigoDeProducto;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.compras = compras;
        this.clientes = clientes;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoDeProducto() {
        return codigoDeProducto;
    }

    public void setCodigoDeProducto(int codigoDeProducto) {
        this.codigoDeProducto = codigoDeProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProductos getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProductos categoria) {
        this.categoria = categoria;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override

    public String toString() {

        return "Nombre Producto: " + nombre + "Codigo de producto: " + codigoDeProducto + "Precio unitario: " + precioUnitario + "Cantidad: " + cantidad +  "Categoria: " + categoria + "\n Lista compras: " + compras + "\n Lista clientes: " + clientes;
    }
}
