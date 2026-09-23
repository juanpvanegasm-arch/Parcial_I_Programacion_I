package EvaluacionProgramacion1;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;

    private int documento;

    private int telefono;

    private String correoElectronico;

    List<Productos> productos;

    List<Cliente> clientes;

    public Cliente (String nombre, int documento, int telefono, String correoElectronico, ArrayList<Productos> productos, ArrayList<Cliente> clientes) {

        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.productos = productos;
        this.clientes = clientes;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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
    public String toString() {

        return "Nombre: " + nombre + "documento: " + documento + "telefono: " + telefono + "Correo electronico: " + correoElectronico + "\nLista clientes: " + clientes + "\nLista productos: " + productos;
    }
}
