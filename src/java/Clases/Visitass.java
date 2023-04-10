/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

/**
 *
 * @author User
 */
public class Visitass {
    @SerializedName("id")
    int id;
    
    @SerializedName("title")
    String nombre;
    
    @SerializedName("descripcion")
    String descripcion;
    
    @SerializedName("start")
    Date fecha_ini;
    
    @SerializedName("end")
    Date fecha_ter;
    
    @SerializedName("estado")
    int id_estado;
    
    @SerializedName("run")
    String run;
    
    @SerializedName("run")
    String rut;

    public Visitass() {
    }

    public Visitass(int id, String nombre, String descripcion, Date fecha_ini, Date fecha_ter, int id_estado, String run, String rut) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_ini = fecha_ini;
        this.fecha_ter = fecha_ter;
        this.id_estado = id_estado;
        this.run = run;
        this.rut = rut;
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

    public Date getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(Date fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public Date getFecha_ter() {
        return fecha_ter;
    }

    public void setFecha_ter(Date fecha_ter) {
        this.fecha_ter = fecha_ter;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Visitass{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha_ini=" + fecha_ini + ", fecha_ter=" + fecha_ter + ", id_estado=" + id_estado + ", run=" + run + ", rut=" + rut + '}';
    }

    
    
        
}
