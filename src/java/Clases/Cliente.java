/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Cliente {
    String RUT_EMPRESA;
    String EMPR_NOMBRE;
    String EMPR_DIRECCION;
    int EMPR_TELEFONO;
    String EMPR_CORREO;
    int ID_RUBRO;
    int ID_CLASE_PERS;

    public Cliente() {
    }

    public Cliente(String RUT_EMPRESA, String EMPR_NOMBRE, String EMPR_DIRECCION, int EMPR_TELEFONO, String EMPR_CORREO, int ID_RUBRO, int ID_CLASE_PERS) {
        this.RUT_EMPRESA = RUT_EMPRESA;
        this.EMPR_NOMBRE = EMPR_NOMBRE;
        this.EMPR_DIRECCION = EMPR_DIRECCION;
        this.EMPR_TELEFONO = EMPR_TELEFONO;
        this.EMPR_CORREO = EMPR_CORREO;
        this.ID_RUBRO = ID_RUBRO;
        this.ID_CLASE_PERS = ID_CLASE_PERS;
    }

    public String getRUT_EMPRESA() {
        return RUT_EMPRESA;
    }

    public void setRUT_EMPRESA(String RUT_EMPRESA) {
        this.RUT_EMPRESA = RUT_EMPRESA;
    }

    public String getEMPR_NOMBRE() {
        return EMPR_NOMBRE;
    }

    public void setEMPR_NOMBRE(String EMPR_NOMBRE) {
        this.EMPR_NOMBRE = EMPR_NOMBRE;
    }

    public String getEMPR_DIRECCION() {
        return EMPR_DIRECCION;
    }

    public void setEMPR_DIRECCION(String EMPR_DIRECCION) {
        this.EMPR_DIRECCION = EMPR_DIRECCION;
    }

    public int getEMPR_TELEFONO() {
        return EMPR_TELEFONO;
    }

    public void setEMPR_TELEFONO(int EMPR_TELEFONO) {
        this.EMPR_TELEFONO = EMPR_TELEFONO;
    }

    public String getEMPR_CORREO() {
        return EMPR_CORREO;
    }

    public void setEMPR_CORREO(String EMPR_CORREO) {
        this.EMPR_CORREO = EMPR_CORREO;
    }

    public int getID_RUBRO() {
        return ID_RUBRO;
    }

    public void setID_RUBRO(int ID_RUBRO) {
        this.ID_RUBRO = ID_RUBRO;
    }

    public int getID_CLASE_PERS() {
        return ID_CLASE_PERS;
    }

    public void setID_CLASE_PERS(int ID_CLASE_PERS) {
        this.ID_CLASE_PERS = ID_CLASE_PERS;
    }

    @Override
    public String toString() {
        return "Cliente{" + "RUT_EMPRESA=" + RUT_EMPRESA + ", EMPR_NOMBRE=" + EMPR_NOMBRE + ", EMPR_DIRECCION=" + EMPR_DIRECCION + ", EMPR_TELEFONO=" + EMPR_TELEFONO + ", EMPR_CORREO=" + EMPR_CORREO + ", ID_RUBRO=" + ID_RUBRO + ", ID_CLASE_PERS=" + ID_CLASE_PERS + '}';
    }

        
    
    
}
