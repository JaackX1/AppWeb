package Clases;

import java.util.Date;

public class Capacitacion {
    
    
    private int Id_Capacitacion;
    private String Profe_a_Cargo;
    private Date Cap_Fecha_Ini;    
    private Date Cap_Fecha_Fin;
    private String Estado;
    private int Cap_Precio;
    private int Id_Area;

    public Capacitacion() {
    }

    public Capacitacion(int Id_Capacitacion, String Profe_a_Cargo, Date Cap_Fecha_Ini, Date Cap_Fecha_Fin, String Estado, int Cap_Precio, int Id_Area) {
        this.Id_Capacitacion = Id_Capacitacion;
        this.Profe_a_Cargo = Profe_a_Cargo;
        this.Cap_Fecha_Ini = Cap_Fecha_Ini;
        this.Cap_Fecha_Fin = Cap_Fecha_Fin;
        this.Estado = Estado;
        this.Cap_Precio = Cap_Precio;
        this.Id_Area = Id_Area;
    }

    public int getId_Capacitacion() {
        return Id_Capacitacion;
    }

    public void setId_Capacitacion(int Id_Capacitacion) {
        this.Id_Capacitacion = Id_Capacitacion;
    }

    public String getProfe_a_Cargo() {
        return Profe_a_Cargo;
    }

    public void setProfe_a_Cargo(String Profe_a_Cargo) {
        this.Profe_a_Cargo = Profe_a_Cargo;
    }

    public Date getCap_Fecha_Ini() {
        return Cap_Fecha_Ini;
    }

    public void setCap_Fecha_Ini(Date Cap_Fecha_Ini) {
        this.Cap_Fecha_Ini = Cap_Fecha_Ini;
    }

    public Date getCap_Fecha_Fin() {
        return Cap_Fecha_Fin;
    }

    public void setCap_Fecha_Fin(Date Cap_Fecha_Fin) {
        this.Cap_Fecha_Fin = Cap_Fecha_Fin;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getCap_Precio() {
        return Cap_Precio;
    }

    public void setCap_Precio(int Cap_Precio) {
        this.Cap_Precio = Cap_Precio;
    }

    public int getId_Area() {
        return Id_Area;
    }

    public void setId_Area(int Id_Area) {
        this.Id_Area = Id_Area;
    }

    @Override
    public String toString() {
        return "Capacitacion{" + "Id_Capacitacion=" + Id_Capacitacion + ", Profe_a_Cargo=" + Profe_a_Cargo + ", Cap_Fecha_Ini=" + Cap_Fecha_Ini + ", Cap_Fecha_Fin=" + Cap_Fecha_Fin + ", Estado=" + Estado + ", Cap_Precio=" + Cap_Precio + ", Id_Area=" + Id_Area + '}';
    }
    
    
    
}
