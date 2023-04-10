/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Nicolas
 */
public class Persona {
    String RUN;
    String PER_P_NOMBRE;
    String PER_S_NOMBRE;
    String PER_P_APELLIDO;
    String PER_S_APELLIDO;
    int PER_TELEFONO;
    String PER_CORREO;
    String PER_FECHA_NAC;
    String DIRECCION;
    int ID_NACIONALIDAD;
    int ID_SEXO;
    int ID_CARGO;
    int ID_CLASE_PERS;

    public Persona() {
    }

    public Persona(String RUN, String PER_P_NOMBRE, String PER_S_NOMBRE, String PER_P_APELLIDO, String PER_S_APELLIDO, int PER_TELEFONO, String PER_CORREO, String PER_FECHA_NAC, String DIRECCION, int ID_NACIONALIDAD, int ID_SEXO, int ID_CARGO, int ID_CLASE_PERS) {
        this.RUN = RUN;
        this.PER_P_NOMBRE = PER_P_NOMBRE;
        this.PER_S_NOMBRE = PER_S_NOMBRE;
        this.PER_P_APELLIDO = PER_P_APELLIDO;
        this.PER_S_APELLIDO = PER_S_APELLIDO;
        this.PER_TELEFONO = PER_TELEFONO;
        this.PER_CORREO = PER_CORREO;
        this.PER_FECHA_NAC = PER_FECHA_NAC;
        this.DIRECCION = DIRECCION;
        this.ID_NACIONALIDAD = ID_NACIONALIDAD;
        this.ID_SEXO = ID_SEXO;
        this.ID_CARGO = ID_CARGO;
        this.ID_CLASE_PERS = ID_CLASE_PERS;
    }

    public String getRUN() {
        return RUN;
    }

    public void setRUN(String RUN) {
        this.RUN = RUN;
    }

    public String getPER_P_NOMBRE() {
        return PER_P_NOMBRE;
    }

    public void setPER_P_NOMBRE(String PER_P_NOMBRE) {
        this.PER_P_NOMBRE = PER_P_NOMBRE;
    }

    public String getPER_S_NOMBRE() {
        return PER_S_NOMBRE;
    }

    public void setPER_S_NOMBRE(String PER_S_NOMBRE) {
        this.PER_S_NOMBRE = PER_S_NOMBRE;
    }

    public String getPER_P_APELLIDO() {
        return PER_P_APELLIDO;
    }

    public void setPER_P_APELLIDO(String PER_P_APELLIDO) {
        this.PER_P_APELLIDO = PER_P_APELLIDO;
    }

    public String getPER_S_APELLIDO() {
        return PER_S_APELLIDO;
    }

    public void setPER_S_APELLIDO(String PER_S_APELLIDO) {
        this.PER_S_APELLIDO = PER_S_APELLIDO;
    }

    public int getPER_TELEFONO() {
        return PER_TELEFONO;
    }

    public void setPER_TELEFONO(int PER_TELEFONO) {
        this.PER_TELEFONO = PER_TELEFONO;
    }

    public String getPER_CORREO() {
        return PER_CORREO;
    }

    public void setPER_CORREO(String PER_CORREO) {
        this.PER_CORREO = PER_CORREO;
    }

    public String getPER_FECHA_NAC() {
        return PER_FECHA_NAC;
    }

    public void setPER_FECHA_NAC(String PER_FECHA_NAC) {
        this.PER_FECHA_NAC = PER_FECHA_NAC;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public int getID_NACIONALIDAD() {
        return ID_NACIONALIDAD;
    }

    public void setID_NACIONALIDAD(int ID_NACIONALIDAD) {
        this.ID_NACIONALIDAD = ID_NACIONALIDAD;
    }

    public int getID_SEXO() {
        return ID_SEXO;
    }

    public void setID_SEXO(int ID_SEXO) {
        this.ID_SEXO = ID_SEXO;
    }

    public int getID_CARGO() {
        return ID_CARGO;
    }

    public void setID_CARGO(int ID_CARGO) {
        this.ID_CARGO = ID_CARGO;
    }

    public int getID_CLASE_PERS() {
        return ID_CLASE_PERS;
    }

    public void setID_CLASE_PERS(int ID_CLASE_PERS) {
        this.ID_CLASE_PERS = ID_CLASE_PERS;
    }

    @Override
    public String toString() {
        return "Persona{" + "RUN=" + RUN + ", PER_P_NOMBRE=" + PER_P_NOMBRE + ", PER_S_NOMBRE=" + PER_S_NOMBRE + ", PER_P_APELLIDO=" + PER_P_APELLIDO + ", PER_S_APELLIDO=" + PER_S_APELLIDO + ", PER_TELEFONO=" + PER_TELEFONO + ", PER_CORREO=" + PER_CORREO + ", PER_FECHA_NAC=" + PER_FECHA_NAC + ", DIRECCION=" + DIRECCION + ", ID_NACIONALIDAD=" + ID_NACIONALIDAD + ", ID_SEXO=" + ID_SEXO + ", ID_CARGO=" + ID_CARGO + ", ID_CLASE_PERS=" + ID_CLASE_PERS + '}';
    }

    
    
    
}
