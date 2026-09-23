package EvaluacionProgramacion1;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    private String nombreComercial;

    private String direccion;

    private int telefono;

    private List<Productos> listaProductos;

    private List<Compra> listaCompras;

    private List<Cliente> listaClientes;

    public Supermercado(String nombreComercial, String direccion, int telefono,  ArrayList<Productos> listaProductos, ArrayList<Compra> listaCompras, ArrayList<Cliente> listaClientes) {

        this.nombreComercial = nombreComercial;

        this.direccion = direccion;

        this.telefono = telefono;

        this.listaProductos = listaProductos;

        this.listaClientes = listaClientes;

        this.listaCompras = listaCompras;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Productos> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    @Override
    public String toString() {
        return "Supermercado: " + "nombreComercial: " + nombreComercial + "direccion: " + direccion + ", telefono: " + telefono + "\nLista clientes: " + listaClientes + "\nLista compras: " + listaCompras + "\nLista productos: " + listaProductos;
    }



}
