import java.util.List;
import java.util.ArrayList;
public class Supermercado {
    private String nombreComercial;
    private String direccion;
    private int telefono;

    private List<Producto> listaProductos;
    private List<Cliente> listaClientes;
    private List<Compra> listaCompras;

    public Supermercado(String nombreComercial, String direccion, int telefono){
        this.nombreComercial=nombreComercial;
        this.direccion=direccion;
        this.telefono=telefono;

        listaClientes = new ArrayList<>();
        listaCompras = new ArrayList<>();
        listaProductos = new ArrayList<>();
    }
    public int getTelefono() {return telefono;}
    public void setTelefono(int telefono) {this.telefono = telefono;}
    public String getNombreComercial() {return nombreComercial;}
    public void setNombreComercial(String nombreComercial) {this.nombreComercial = nombreComercial;}
    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}

    public List<Producto> getListaProductos() {return listaProductos;}
    public void setListaProductos(List<Producto> listaProductos) {this.listaProductos = listaProductos;}
    public List<Cliente> getListaClientes() {return listaClientes;}
    public void setListaClientes(List<Cliente> listaClientes) {this.listaClientes = listaClientes;}
    public List<Compra> getListaCompras() {return listaCompras;}
    public void setListaCompras(List<Compra> listaCompras) {this.listaCompras = listaCompras;}

    public String toString(){
        return "Nombre comercial: "+nombreComercial+
                "Dirección: "+direccion+
                "Teléfono: "+telefono+
                "Lista de productos: "+listaProductos+
                "Lista de clientes: "+listaClientes+
                "Lista de compras: "+listaCompras;
    }
    public boolean verificarCliente(int documento) {
        boolean existe = false;
        for (Cliente cliente : listaClientes) {
            if (cliente.getDocumento() == documento) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    public boolean ingresarCliente (Cliente cliente){
        boolean ingresado=false;
        int ID=cliente.getDocumento();
        boolean existe=verificarCliente(ID);
        if(existe==ingresado){
            listaClientes.add(cliente);
            ingresado=true;
        }
        return ingresado;
    }
    public boolean actualizarCliente(int documento, Cliente clienteActualizado){
        boolean actualizado=false;
        for(Cliente cliente : listaClientes){
            if(cliente.getDocumento()==documento){
                cliente.setNombre(clienteActualizado.getNombre());
                cliente.setTelefono(clienteActualizado.getTelefono());
                cliente.setCorreoElectronico(clienteActualizado.getCorreoElectronico());

                actualizado=true;
                break;
            }
        }
        return actualizado;
    }
    public boolean eliminarCliente(int documento){
        boolean eliminado=false;
        for(Cliente cliente :listaClientes){
            if(cliente.getDocumento()==documento){
                listaClientes.remove(cliente);
                eliminado=true;
                break;
            }
        }
        return eliminado;
    }
    public boolean verificarProducto(int codigo) {
        boolean existe = false;
        for (Producto producto : listaProductos) {
            if (producto.getCodigo() == codigo) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    public boolean ingresarProducto (Producto producto){
        boolean ingresado=false;
        int cod=producto.getCodigo();
        boolean existe=verificarProducto(cod);
        if(existe==ingresado){
            listaProductos.add(producto);
            ingresado=true;
        }
        return ingresado;
    }
    public boolean actualizarProducto (int codigo, Producto productoActualizado){
        boolean actualizado=false;
        for(Producto producto : listaProductos){
            if(producto.getCodigo()==codigo){
                producto.setNombre(productoActualizado.getNombre());
                producto.setPrecioUnitario(productoActualizado.getPrecioUnitario());
                producto.setCantidadDisponible(productoActualizado.getCantidadDisponible());
                producto.setCategoriaProductos(productoActualizado.getCategoriaProductos());
                actualizado=true;
                break;
            }
        }
        return actualizado;
    }
    public boolean eliminarProducto(int codigo){
        boolean eliminado=false;
        for(Producto producto :listaProductos){
            if(producto.getCodigo()==codigo){
                listaProductos.remove(producto);
                eliminado=true;
                break;
            }
        }
        return eliminado;
    }
    public boolean verificarCompra(int codigo) {
        boolean existe = false;
        for (Compra compra : listaCompras) {
            if (compra.getCodigo() == codigo) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    public boolean ingresarCompra (Compra compra){
        boolean ingresado=false;
        int cod=compra.getCodigo();
        boolean existe=verificarCompra(cod);
        if(existe==ingresado){
            listaCompras.add(compra);
            ingresado=true;
        }
        return ingresado;
    }
    public boolean actualizarCompra (int codigo, Compra compraActualizada){
        boolean actualizado=false;
        for(Compra compra : listaCompras){
            if(compra.getCodigo()==codigo){
                compra.setFechaRealizacion(compraActualizada.getFechaRealizacion());
                compra.setMetodopago(compraActualizada.getMetodopago());
                actualizado=true;
                break;
            }
        }
        return actualizado;
    }
    public boolean eliminarCompra(int codigo){
        boolean eliminado=false;
        for(Compra compra :listaCompras){
            if(compra.getCodigo()==codigo){
                listaCompras.remove(compra);
                eliminado=true;
                break;
            }
        }
        return eliminado;
    }
    }


