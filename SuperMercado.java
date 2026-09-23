public class SuperMercado {
    private String nombreComercial;
    private String direccion;
    private int telefono;

    public SuperMercado (String nombreComercial, String direccion, int telefono){
        this.nombreComercial=nombreComercial;
        this.direccion=direccion;
        this.telefono=telefono;
    }
    public int getTelefono() {return telefono;}
    public void setTelefono(int telefono) {this.telefono = telefono;}
    public String getNombreComercial() {return nombreComercial;}
    public void setNombreComercial(String nombreComercial) {this.nombreComercial = nombreComercial;}
    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String toString(){
        return "Nombre comercial: "+nombreComercial+
                "Dirección: "+direccion+
                "Teléfono: "+telefono;
    }
}
