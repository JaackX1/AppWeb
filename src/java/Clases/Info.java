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
public class Info {
    
    int id_pago;
    int pago_monto;
    int id_contrato;

    public Info() {
    }

    public Info(int id_pago, int pago_monto, int id_contrato) {
        this.id_pago = id_pago;
        this.pago_monto = pago_monto;
        this.id_contrato = id_contrato;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public int getPago_monto() {
        return pago_monto;
    }

    public void setPago_monto(int pago_monto) {
        this.pago_monto = pago_monto;
    }

    public int getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
    }

    @Override
    public String toString() {
        return "Info{" + "id_pago=" + id_pago + ", pago_monto=" + pago_monto + ", id_contrato=" + id_contrato + '}';
    }
    
    
}
