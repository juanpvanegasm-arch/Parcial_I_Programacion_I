public class Cliente {

    private String nombre;
    private int documento;
    private int telefono;
    private String correoElectronico;

    public Cliente(String nombre, int documento, int telefono, String correoElectronico){
        this.nombre=nombre;
        this.documento=documento;
        this.telefono=telefono;
        this.correoElectronico=correoElectronico;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getDocumento() {return documento;}
    public void setDocumento(int documento) {this.documento = documento;}
    public int getTelefono() {return telefono;}
    public void setTelefono(int telefono) {this.telefono = telefono;}
    public String getCorreoElectronico() {return correoElectronico;}
    public void setCorreoElectronico(String correoElectronico) {this.correoElectronico = correoElectronico;}

    public String toString(){
        return "Nombre: "+nombre+
                "Documento: "+documento+
                "Teléfono: "+telefono+
                "Correo electrónico: "+correoElectronico;
    }
}
