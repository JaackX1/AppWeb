package Clases;

public class Accidente {
    private int Id_accidente;
    private String Acc_observacion;
    private String Acc_fecha;
    private String Acc_hora;
    private String Acc_resolucion;

    public Accidente() {
    }

    public Accidente(int Id_accidente, String Acc_observacion, String Acc_fecha, String Acc_hora, String Acc_resolucion) {
        this.Id_accidente = Id_accidente;
        this.Acc_observacion = Acc_observacion;
        this.Acc_fecha = Acc_fecha;
        this.Acc_hora = Acc_hora;
        this.Acc_resolucion = Acc_resolucion;
    }

    public int getId_accidente() {
        return Id_accidente;
    }

    public void setId_accidente(int Id_accidente) {
        this.Id_accidente = Id_accidente;
    }

    public String getAcc_observacion() {
        return Acc_observacion;
    }

    public void setAcc_observacion(String Acc_observacion) {
        this.Acc_observacion = Acc_observacion;
    }

    public String getAcc_fecha() {
        return Acc_fecha;
    }

    public void setAcc_fecha(String Acc_fecha) {
        this.Acc_fecha = Acc_fecha;
    }

    public String getAcc_hora() {
        return Acc_hora;
    }

    public void setAcc_hora(String Acc_hora) {
        this.Acc_hora = Acc_hora;
    }

    public String getAcc_resolucion() {
        return Acc_resolucion;
    }

    public void setAcc_resolucion(String Acc_resolucion) {
        this.Acc_resolucion = Acc_resolucion;
    }

    @Override
    public String toString() {
        return "Accidente{" + "Id_accidente=" + Id_accidente + ", Acc_observacion=" + Acc_observacion + ", Acc_fecha=" + Acc_fecha + ", Acc_hora=" + Acc_hora + ", Acc_resolucion=" + Acc_resolucion + '}';
    }
   
}
