package Clases;

import java.util.Date;


public class Asesoria {
    private int Id_Asesoria;
    private String Prof_a_Cargo;
    private Date Ases_Fecha_Ini;    
    private Date Ases_Fecha_Fin;
    private String Estado;
    private int Precio;
    private int Area_Id_Area;

    public Asesoria() {
    }

    public Asesoria(int Id_Asesoria, String Prof_a_Cargo, Date Ases_Fecha_Ini, Date Ases_Fecha_Fin, String Estado, int Precio, int Area_Id_Area) {
        this.Id_Asesoria = Id_Asesoria;
        this.Prof_a_Cargo = Prof_a_Cargo;
        this.Ases_Fecha_Ini = Ases_Fecha_Ini;
        this.Ases_Fecha_Fin = Ases_Fecha_Fin;
        this.Estado = Estado;
        this.Precio = Precio;
        this.Area_Id_Area = Area_Id_Area;
    }

    public int getId_Asesoria() {
        return Id_Asesoria;
    }

    public void setId_Asesoria(int Id_Asesoria) {
        this.Id_Asesoria = Id_Asesoria;
    }

    public String getProf_a_Cargo() {
        return Prof_a_Cargo;
    }

    public void setProf_a_Cargo(String Prof_a_Cargo) {
        this.Prof_a_Cargo = Prof_a_Cargo;
    }

    public Date getAses_Fecha_Ini() {
        return Ases_Fecha_Ini;
    }

    public void setAses_Fecha_Ini(Date Ases_Fecha_Ini) {
        this.Ases_Fecha_Ini = Ases_Fecha_Ini;
    }

    public Date getAses_Fecha_Fin() {
        return Ases_Fecha_Fin;
    }

    public void setAses_Fecha_Fin(Date Ases_Fecha_Fin) {
        this.Ases_Fecha_Fin = Ases_Fecha_Fin;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getArea_Id_Area() {
        return Area_Id_Area;
    }

    public void setArea_Id_Area(int Area_Id_Area) {
        this.Area_Id_Area = Area_Id_Area;
    }

    @Override
    public String toString() {
        return "Asesoria{" + "Id_Asesoria=" + Id_Asesoria + ", Prof_a_Cargo=" + Prof_a_Cargo + ", Ases_Fecha_Ini=" + Ases_Fecha_Ini + ", Ases_Fecha_Fin=" + Ases_Fecha_Fin + ", Estado=" + Estado + ", Precio=" + Precio + ", Area_Id_Area=" + Area_Id_Area + '}';
    }

    
}

