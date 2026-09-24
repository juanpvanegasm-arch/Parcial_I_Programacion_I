package EvaluacionProgramacion1;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    private String nombreComercial;

    private String direccion;

    private int telefono;

    private List<Producto> listaProductos;

    private List<Compra> listaCompras;

    private List<Cliente> listaClientes;

    public Supermercado(String nombreComercial, String direccion, int telefono) {

        this.nombreComercial = nombreComercial;

        this.direccion = direccion;

        this.telefono = telefono;

        listaProductos = new ArrayList<>();

        listaCompras = new ArrayList<>();

        listaClientes = new ArrayList<>();

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

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
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

    // Funcion para agregar los valores a las listas

    public void agregarClientes (Cliente cliente) {

        listaClientes.add(cliente);

    }

    public void agregarCompras (Compra compra) {

        listaCompras.add(compra);
    }

    public void agregarProducto (Producto producto) {

        listaProductos.add(producto);
    }

    //Funciones verificar si el cliente existe

    public boolean verificarClientes (int documento){

        boolean existe = false;

        for (Cliente cliente : listaClientes) {

            if (cliente.getDocumento() == documento) {

                existe = true;

                break;

            }
        }
        return existe;
    }


    public boolean verificarProducto (int codigoProducto){
        boolean existe = false;
        for (Producto producto : listaProductos) {

            if(producto.getCodigoDeProducto() == codigoProducto){

                existe = true;

                break;
            }
        }
        return existe;
    }

    //Funciones para agregar a listas y que no esten repetidos

    public boolean agregarClienteNoRepetido(Cliente cliente){

        boolean agregado = false;

        boolean existe = verificarClientes(cliente.getDocumento());

        if (!existe){

            listaClientes.add(cliente);
            agregado = true;
        }
        return agregado;
    }

    public void agregarCompra(Compra compra) {

            listaCompras.add(compra);

    }
    public boolean agregarProductoNoRepetido(Producto producto){

        boolean agregado = false;

        boolean existe = verificarClientes(producto.getCodigoDeProducto());

        if (!existe){

            listaProductos.add(producto);

            agregado = true;
        }
        return agregado;
    }




    //Funciones para actualizar datos

    public boolean actualizarCliente(int documento, Cliente clienteActualizado) {

        boolean estaActualizado = false;

        for (Cliente cliente: listaClientes) {

            if (cliente.getDocumento() == documento){
                cliente.setNombre(clienteActualizado.getNombre());
                cliente.setCorreoElectronico(clienteActualizado.getCorreoElectronico());
                cliente.setTelefono(clienteActualizado.getTelefono());
                cliente.setDocumento(clienteActualizado.getDocumento());

                estaActualizado = true;
            }
        }
        return estaActualizado;
    }

    public boolean actualizarCompra(int codigo, Compra compraActualizada) {

        boolean estaActualizado = false;

        for (Compra compra: listaCompras) {

            if (compra.getCodigo() == codigo){

                compra.setCodigo(compraActualizada.getCodigo());
                compra.setFecha(compraActualizada.getFecha());
                compra.setMetodoPago(compraActualizada.getMetodoPago());

                estaActualizado = true;
            }
        }
        return estaActualizado;
    }

    public boolean actualizarProducto(int codigoDeProducto, Producto productoActualizada) {

        boolean estaActualizado = false;

        for (Producto producto: listaProductos) {

            if (producto.getCodigoDeProducto() == codigoDeProducto){

                producto.setNombre(productoActualizada.getNombre());
                producto.setPrecioUnitario(productoActualizada.getPrecioUnitario());
                producto.setCantidad(productoActualizada.getCantidad());
                producto.setCategoria(productoActualizada.getCategoria());
                producto.setNombre(productoActualizada.getNombre());

                estaActualizado = true;
            }
        }
        return estaActualizado;
    }

    // Funciones para eliminar de las listas

    public boolean eliminarCliente(int documento){

        boolean esEliminado = false;

        for (Cliente cliente: listaClientes) {

            listaClientes.remove(cliente);
            esEliminado = true;
            break;

        }
        return esEliminado;
    }

    public boolean eliminarProducto(int codigoDeProducto){

        boolean esEliminado = false;

        for (Producto producto: listaProductos) {

            listaProductos.remove(producto);
            esEliminado = true;
            break;

        }
        return esEliminado;
    }

    public boolean eliminarCompra(int codigo){

        boolean esEliminado = false;

        for (Compra compra: listaCompras) {

            listaCompras.remove(compra);
            esEliminado = true;
            break;

        }
        return esEliminado;
    }












    // Encontrar el valor total de la compra, que se calcula considerando el precio de los productos seleccionados
}
