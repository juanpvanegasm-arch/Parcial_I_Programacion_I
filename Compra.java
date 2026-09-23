import java.time.LocalDate;
public class Compra {
    private int codigo;
    private LocalDate fechaRealizacion;
    private double valorTotal;

    public Compra (int codigo, LocalDate fechaRealizacion, double valorTotal){
        this.codigo=codigo;
        this.fechaRealizacion=fechaRealizacion;
        this.valorTotal=valorTotal;
    }

    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public LocalDate getFechaRealizacion() {return fechaRealizacion;}
    public void setFechaRealizacion(LocalDate fechaRealizacion) {this.fechaRealizacion = fechaRealizacion;}
    public double getValorTotal() {return valorTotal;}
    public void setValorTotal(double valorTotal) {this.valorTotal = valorTotal;}

    public String toString(){
        return "Código: "+codigo+
                "Fecha de realización: "+fechaRealizacion+
                "Valor total: "+valorTotal;
    }
}
