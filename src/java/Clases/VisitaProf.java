/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author User
 */
public class VisitaProf {

    int id;
    String nombre;
    String descripcion;
    String fecha_ini;
    String fecha_ter;
    int id_estado;
    int id_observaciones;

    public VisitaProf() {
    }

    public VisitaProf(int id, String nombre, String descripcion, String fecha_ini, String fecha_ter, int id_estado, int id_observaciones) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_ini = fecha_ini;
        this.fecha_ter = fecha_ter;
        this.id_estado = id_estado;
        this.id_observaciones = id_observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(String fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public String getFecha_ter() {
        return fecha_ter;
    }

    public void setFecha_ter(String fecha_ter) {
        this.fecha_ter = fecha_ter;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public int getId_observaciones() {
        return id_observaciones;
    }

    public void setId_observaciones(int id_observaciones) {
        this.id_observaciones = id_observaciones;
    }

    @Override
    public String toString() {
        return "VisitaProf{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha_ini=" + fecha_ini + ", fecha_ter=" + fecha_ter + ", id_estado=" + id_estado + ", id_observaciones=" + id_observaciones + '}';
    }
    
    
    
    
}
