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
public class Contrato {
    private String Pago_fecha;
    private int Pago_monto;
    private int Id_plan;
    private String Rut;
    private String Cont_firma_cliente;
    private String Cont_fecha_inicio;

    public Contrato() {
    }

    public Contrato(String Pago_fecha, int Pago_monto, int Id_plan, String Rut, String Cont_firma_cliente, String Cont_fecha_inicio) {
        this.Pago_fecha = Pago_fecha;
        this.Pago_monto = Pago_monto;
        this.Id_plan = Id_plan;
        this.Rut = Rut;
        this.Cont_firma_cliente = Cont_firma_cliente;
        this.Cont_fecha_inicio = Cont_fecha_inicio;
    }

    public String getPago_fecha() {
        return Pago_fecha;
    }

    public void setPago_fecha(String Pago_fecha) {
        this.Pago_fecha = Pago_fecha;
    }

    public int getPago_monto() {
        return Pago_monto;
    }

    public void setPago_monto(int Pago_monto) {
        this.Pago_monto = Pago_monto;
    }

    public int getId_plan() {
        return Id_plan;
    }

    public void setId_plan(int Id_plan) {
        this.Id_plan = Id_plan;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getCont_firma_cliente() {
        return Cont_firma_cliente;
    }

    public void setCont_firma_cliente(String Cont_firma_cliente) {
        this.Cont_firma_cliente = Cont_firma_cliente;
    }

    public String getCont_fecha_inicio() {
        return Cont_fecha_inicio;
    }

    public void setCont_fecha_inicio(String Cont_fecha_inicio) {
        this.Cont_fecha_inicio = Cont_fecha_inicio;
    }

    @Override
    public String toString() {
        return "Contrato{" + "Pago_fecha=" + Pago_fecha + ", Pago_monto=" + Pago_monto + ", Id_plan=" + Id_plan + ", Rut=" + Rut + ", Cont_firma_cliente=" + Cont_firma_cliente + ", Cont_fecha_inicio=" + Cont_fecha_inicio + '}';
    }
    
    
    
}
