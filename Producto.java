public class Producto {
    private String nombre;
    private int codigo;
    private double precioUnitario;
    private int cantidadDisponible;
    private CategoriaProducto categoriaProducto;

    public Producto (String nombre, int codigo, double precioUnitario, int cantidad, CategoriaProducto categoriaProducto){
        this.nombre=nombre;
        this.codigo=codigo;
        this.precioUnitario=precioUnitario;
        this.cantidadDisponible=cantidad;
        this.categoriaProducto = categoriaProducto;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public double getPrecioUnitario() {return precioUnitario;}
    public void setPrecioUnitario(double precioUnitario) {this.precioUnitario = precioUnitario;}
    public int getCantidadDisponible() {return cantidadDisponible;}
    public void setCantidadDisponible(int cantidad) {this.cantidadDisponible = cantidad;}
    public CategoriaProducto getCategoriaProductos() {return categoriaProducto;}
    public void setCategoriaProductos(CategoriaProducto categoriaProducto) {this.categoriaProducto = categoriaProducto;}

    public String toString(){
        return "Nombre: "+nombre+
                ", Código: "+codigo+
                ", Precio unitario: "+precioUnitario+
                ", Cantidad: "+cantidadDisponible+
                ", Categoria del producto: "+ categoriaProducto;
    }
}
