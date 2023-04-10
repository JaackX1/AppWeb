/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author nicolas
 */
public class respCheck {
    
    String nombre;
    String fecha_inicio;
    String rut_empr;
    int ID_OBSERVACIONES;
    int ID_MEJORA;
    int ID_RESPUESTAS;
    int ID_VISITA;

    public respCheck() {
    }

    public respCheck(String nombre, String fecha_inicio, String rut_empr, int ID_OBSERVACIONES, int ID_MEJORA, int ID_RESPUESTAS, int ID_VISITA) {
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.rut_empr = rut_empr;
        this.ID_OBSERVACIONES = ID_OBSERVACIONES;
        this.ID_MEJORA = ID_MEJORA;
        this.ID_RESPUESTAS = ID_RESPUESTAS;
        this.ID_VISITA = ID_VISITA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getRut_empr() {
        return rut_empr;
    }

    public void setRut_empr(String rut_empr) {
        this.rut_empr = rut_empr;
    }

    public int getID_OBSERVACIONES() {
        return ID_OBSERVACIONES;
    }

    public void setID_OBSERVACIONES(int ID_OBSERVACIONES) {
        this.ID_OBSERVACIONES = ID_OBSERVACIONES;
    }

    public int getID_MEJORA() {
        return ID_MEJORA;
    }

    public void setID_MEJORA(int ID_MEJORA) {
        this.ID_MEJORA = ID_MEJORA;
    }

    public int getID_RESPUESTAS() {
        return ID_RESPUESTAS;
    }

    public void setID_RESPUESTAS(int ID_RESPUESTAS) {
        this.ID_RESPUESTAS = ID_RESPUESTAS;
    }

    public int getID_VISITA() {
        return ID_VISITA;
    }

    public void setID_VISITA(int ID_VISITA) {
        this.ID_VISITA = ID_VISITA;
    }

    @Override
    public String toString() {
        return "respCheck{" + "nombre=" + nombre + ", fecha_inicio=" + fecha_inicio + ", rut_empr=" + rut_empr + ", ID_OBSERVACIONES=" + ID_OBSERVACIONES + ", ID_MEJORA=" + ID_MEJORA + ", ID_RESPUESTAS=" + ID_RESPUESTAS + ", ID_VISITA=" + ID_VISITA + '}';
    }

    
    
        
}
