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
public class Capacitaciones {
    int id_capa;
    String prof_a_cargo;
    String fecha_inicio;
    String fecha_fin;
    String estado;
    int precio;
    int id_area;

    public Capacitaciones() {
    }

    public Capacitaciones(int id_capa, String prof_a_cargo, String fecha_inicio, String fecha_fin, String estado, int precio, int id_area) {
        this.id_capa = id_capa;
        this.prof_a_cargo = prof_a_cargo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.estado = estado;
        this.precio = precio;
        this.id_area = id_area;
    }

    public int getId_capa() {
        return id_capa;
    }

    public void setId_capa(int id_capa) {
        this.id_capa = id_capa;
    }

    public String getProf_a_cargo() {
        return prof_a_cargo;
    }

    public void setProf_a_cargo(String prof_a_cargo) {
        this.prof_a_cargo = prof_a_cargo;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    @Override
    public String toString() {
        return "Capacitaciones{" + "id_capa=" + id_capa + ", prof_a_cargo=" + prof_a_cargo + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + ", estado=" + estado + ", precio=" + precio + ", id_area=" + id_area + '}';
    }
    
    
    
    
    
    
}
